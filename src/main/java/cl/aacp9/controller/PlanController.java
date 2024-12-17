package cl.aacp9.controller;

import cl.aacp9.model.Plan;
import cl.aacp9.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/plan/")
public class PlanController {
    @Autowired
    private PlanService planService;

    @GetMapping("/")
    public ResponseEntity<List<Plan>> findAll() {
        try {
            List<Plan> planList = planService.findAll();
            if (!planList.isEmpty()) {
                return new ResponseEntity<>(planList, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<Plan>> findAllByEstado(@PathVariable Boolean estado) {
        try {
            List<Plan> listEnabled = planService.findAllByEstado(estado);
            if (!listEnabled.isEmpty()) {
                return new ResponseEntity<>(listEnabled, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("save")
    public ResponseEntity<Plan> save(@RequestBody Plan plan){
        try {
            Plan planAux=planService.save(plan);
            if(planAux!=null){
                return new ResponseEntity<>(plan, HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Plan> update(@RequestBody Plan plan){
        try{
            planService.update(plan);
            return new ResponseEntity<>(plan, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
