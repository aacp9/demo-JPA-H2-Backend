package cl.aacp9.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "contrato")
@AllArgsConstructor
@NoArgsConstructor
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean estado;


    //n:1 con la tabla cliente
    @ManyToOne
    @JoinColumn(name="usuario_id") //
    private Cliente cliente;

    //n:1 con la tabla plan
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

    //Constructor
    public Contrato(Long id, Boolean estado, Cliente cliente, Plan plan) {
        this.id = id;
        this.estado = estado;
        this.cliente = cliente;
        this.plan = plan;
    }

    public Contrato() {
    }

    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    //equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(id, contrato.id) && Objects.equals(estado, contrato.estado) && Objects.equals(cliente, contrato.cliente) && Objects.equals(plan, contrato.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estado, cliente, plan);
    }
}
