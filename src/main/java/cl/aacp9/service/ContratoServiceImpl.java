package cl.aacp9.service;

import cl.aacp9.model.Contrato;
import cl.aacp9.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public List<Contrato> findAll() {
        return contratoRepository.findAll();
    }

    @Override
    public Contrato save(Contrato contrato) {
        return contratoRepository.save(contrato);
    }
}
