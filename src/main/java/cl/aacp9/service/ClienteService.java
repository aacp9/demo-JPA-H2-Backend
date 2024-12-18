package cl.aacp9.service;

import cl.aacp9.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public List<Cliente> findAll();
    public List<Cliente> findAllByEstado(Boolean estado);
    public Cliente findByRun(String run);
    public Cliente save(Cliente cliente);
    public Optional<Cliente> findById(Long id);
    public void update(Cliente cliente);

}
