package cl.aacp9.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@ToString
@Entity
@Data
@Builder
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int precio;
    private String servicio;
    private Boolean estado;

    //1:n con tabla contrato
    @OneToMany(mappedBy = "plan")//nombre del atributo en la clase contrato que hara la relacion
    private Set<Contrato> contratos;

   //constructor

    public Plan(Long id, String nombre, int precio, String servicio, Boolean estado, Set<Contrato> contratos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.servicio = servicio;
        this.estado = estado;
        this.contratos = contratos;
    }

    public Plan() {
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Set<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(Set<Contrato> contratos) {
        this.contratos = contratos;
    }

    //equal y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return precio == plan.precio && Objects.equals(id, plan.id) && Objects.equals(nombre, plan.nombre) && Objects.equals(servicio, plan.servicio) && Objects.equals(estado, plan.estado) && Objects.equals(contratos, plan.contratos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, servicio, estado, contratos);
    }
}
