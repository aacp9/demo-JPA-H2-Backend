package cl.aacp9.service;

import cl.aacp9.model.Plan;
import cl.aacp9.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public List<Plan> findAll() {
        //aca se realiza las validades, no el controllador
        return planRepository.findAll();
    }

    @Override
    public List<Plan> findAllByEstado(Boolean estado) {
        return planRepository.findAllByEstado(estado);
    }


    @Override
    public Optional<Plan> findById(Long id) {
        return planRepository.findById(id);
    }

    @Override
    public Plan save(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public void update(Plan plan) {
        planRepository.save(plan);
    }
}

