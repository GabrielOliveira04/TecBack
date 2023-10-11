package tech.gabrieloliveira.tecback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.gabrieloliveira.tecback.model.Temporada;
import tech.gabrieloliveira.tecback.service.TemporadaService;

import java.util.List;

@RestController
@RequestMapping
public class TemporadaController {


    @Autowired
    TemporadaService service;

    @PostMapping
    public ResponseEntity<Temporada> salvar(@RequestBody Temporada temporada) {
        temporada = service.salvar(temporada);
        return ResponseEntity.ok(temporada);
    }

    @PutMapping
    public ResponseEntity<Temporada> alterar(@RequestBody Temporada temporada) throws Exception {
        temporada = service.alterar(temporada);
        return ResponseEntity.ok(temporada);
    }

    @GetMapping
    public ResponseEntity<List<Temporada>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Temporada> consultar(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.consultaPorId(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id) {
        if (service.excluir(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }


    }
}