package cl.aacp9.service;

import cl.aacp9.model.Contrato;

import java.util.List;

public interface ContratoService {
    public List<Contrato> findAll();
    public Contrato save(Contrato contrato);
}
