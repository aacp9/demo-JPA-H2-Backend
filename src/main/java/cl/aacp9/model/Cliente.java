package cl.aacp9.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@ToString
@Entity
@Data
@Builder
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String run;
    private String direccion;
    private Date fechaNacimiento;
    private Boolean estado;

    //1:n con tabla contrato
    @OneToMany(mappedBy = "cliente") //nombre del atributo en  Contrato que hara la relacion
    private Set<Contrato> contratos;


//constructor

    public Cliente(Long id, String nombre, String apellido, String run, String direccion, Date fechaNacimiento, Boolean estado, Set<Contrato> contratos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.contratos = contratos;
    }

    public Cliente() {
    }

    //Getter y Setter


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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    //equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido) && Objects.equals(run, cliente.run) && Objects.equals(direccion, cliente.direccion) && Objects.equals(fechaNacimiento, cliente.fechaNacimiento) && Objects.equals(estado, cliente.estado) && Objects.equals(contratos, cliente.contratos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, run, direccion, fechaNacimiento, estado, contratos);
    }
}

