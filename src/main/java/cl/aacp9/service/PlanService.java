package cl.aacp9.service;

import cl.aacp9.model.Plan;

import java.util.List;
import java.util.Optional;

public interface PlanService {
    public List<Plan> findAll();
    public List<Plan> findAllByEstado(Boolean estado);
    public Optional<Plan> findById(int id);
    public Plan save(Plan plan);
    public void update(Plan plan);
}
