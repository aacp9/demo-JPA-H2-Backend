package cl.aacp9.controller;

import cl.aacp9.model.Contrato;
import cl.aacp9.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contrato/")
public class ContratoController {
    @Autowired
    private ContratoService contratoService;

    @GetMapping("/")
    public ResponseEntity<List<Contrato>> findAll(){
        try{
            List<Contrato> lista = contratoService.findAll();
            if(!lista.isEmpty()){
                return new ResponseEntity<>(lista, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Contrato> save(@RequestBody Contrato contrato){
        try{
            Contrato contratoSaved = contratoService.save(contrato);
            if(contratoSaved != null){
                return new ResponseEntity<>(contratoSaved, HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
