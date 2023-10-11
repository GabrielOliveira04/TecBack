package tech.gabrieloliveira.tecback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.gabrieloliveira.tecback.model.Filme;
import tech.gabrieloliveira.tecback.model.Series;
import tech.gabrieloliveira.tecback.service.SeriesService;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {


    @Autowired
    SeriesService service;


    @PostMapping
    public ResponseEntity<Series>salvar(@RequestBody Series series){
        series = service.salvar(series);
        return ResponseEntity.ok(series);
    }

    @PutMapping
    public  ResponseEntity<Series> alterar(@RequestBody Series series)throws Exception{
        series = service.alterar(series);
        return ResponseEntity.ok(series);
    }
    @GetMapping
    public ResponseEntity<List<Series>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Series> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }








}
