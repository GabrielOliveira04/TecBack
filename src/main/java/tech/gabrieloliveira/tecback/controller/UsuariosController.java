package tech.gabrieloliveira.tecback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.gabrieloliveira.tecback.model.Usuarios;
import tech.gabrieloliveira.tecback.service.UsuariosService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService service;


    @PostMapping()
    public ResponseEntity<Usuarios> salvar(@RequestBody Usuarios usuario) {
        usuario = service.salvar(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuarios> alterar(@RequestBody Usuarios usuario) {
        usuario = service.alterar(usuario);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuarios>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Usuarios> consultar(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.consultaPorId(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }






}
