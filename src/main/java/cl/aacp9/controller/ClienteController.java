package cl.aacp9.controller;

import cl.aacp9.model.Cliente;
import cl.aacp9.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/cliente/")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public ResponseEntity<List<Cliente>> findAll() {
        try {
            List<Cliente> lista=clienteService.findAll();
            //consultamos valor obtenido
            if(!lista.isEmpty()){
                //retornamos las lista y un estatus de ok
                return new ResponseEntity<>(lista, HttpStatus.OK);
            }else {
                //retornamos un estatus de no content
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            //en esta caso habrà un erroe en el servidor
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        try{
            Cliente clienteAux=clienteService.save(cliente);
            if(clienteAux!=null){
               return new ResponseEntity<>(cliente, HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/run/{run}")
    public ResponseEntity<Cliente> findByRun(@PathVariable String run) {
        try {
//            System.out.println("valor de run: "+ run);
            Cliente cliente=clienteService.findByRun(run);
            if(cliente!=null){
                return new ResponseEntity<>(cliente, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Cliente>> findById(@PathVariable Integer id) {//tambien se puede usar @RequestParam, se envìa en json
        try {
//            System.out.println("valor de id: "+ id);
            Optional<Cliente> cliente=clienteService.findById(id);
            if(cliente!=null){
                return new ResponseEntity<>(cliente, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
/*
    @GetMapping("/findAllEnabled")
    public ResponseEntity<List<Cliente>> findAllEnabled() {
        try {
            List<Cliente> listEnabled=clienteService.findAllEnabled();
            //consultamos valor obtenido
            if(!listEnabled.isEmpty()){
                //retornamos las lista y un estatus de ok
                return new ResponseEntity<>(listEnabled, HttpStatus.OK);
            }else {
                //retornamos un estatus de no content
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            //en esta caso habrà un erroe en el servidor
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
*/

    @PutMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
        try{
            clienteService.update(cliente);
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
