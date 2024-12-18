package cl.aacp9.service;

import cl.aacp9.model.Cliente;
import cl.aacp9.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        //aca se realiza las validaciones no en el controller
        return clienteRepository.findAll();
    }
/*
    @Override
    public List<Cliente> findAllEnabled() {
        return clienteRepository.findAllEnabled();
    }
*/
    @Override
    public Cliente findByRun(String run) {
        return clienteRepository.findByRun(run);
    }

    @Override
    public Cliente save(Cliente cliente) {
        //aca se realiza las validaciones no en el controller
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void update(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
