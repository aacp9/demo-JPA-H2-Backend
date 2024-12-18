package cl.aacp9.repository;

import cl.aacp9.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
    /*
    @Query(value="SELECT new cl.aacp9.model.Plan(id, nombre, precio, servicio, estado)" +
                 "FROM Plan " +
                 "WHERE estado=true")
    */
    List<Plan> findAllByEstado(Boolean estado);

    //metodos ya incluidos en JPA
    /*
     * save
     * findAll
     * findById
     * findAllById
     * delete
     * */
}
