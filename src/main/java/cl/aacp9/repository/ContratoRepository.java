package cl.aacp9.repository;

import cl.aacp9.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository <Contrato, Long> {
    //metodos ya incluidos en JPA
    /*
     * save
     * findAll
     * findById
     * findAllById
     * delete
     * */
}
