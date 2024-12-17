package cl.aacp9.repository;

import cl.aacp9.DTO.ClienteDto;
import cl.aacp9.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

//    @Query(value= "SELECT new cl.aacp9.DTO.ClienteDto(c.nomCli) FROM Cliente c")
//    public List<ClienteDto> findAllClienteDto();

    Cliente findByRun (String run);

    @Query(value="SELECT new cl.aacp9.model.Cliente(id, nombre, apellido, run, direccion, fechaNacimiento, estado) " +
                 "FROM Cliente " +
                 "WHERE estado=true")
    List<Cliente> findAllEnabled();

    //metodos ya incluidos en JPA
    /*
    * save
    * findAll
    * findById
    * findAllById
    * delete
    * */
}
