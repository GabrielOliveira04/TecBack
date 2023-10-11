package tech.gabrieloliveira.tecback.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.gabrieloliveira.tecback.model.Usuarios;
import tech.gabrieloliveira.tecback.repository.UsuariosRepository;

import java.util.List;
import java.util.Objects;
@Slf4j
@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository repository;


    public Usuarios salvar(Usuarios usuario) {
        return  repository.save(usuario);
    }




    public Usuarios alterar(Usuarios usuario){
        if (Objects.nonNull(usuario.getId())){
            usuario = repository.save(usuario);
        }else{
            System.out.println("Error");
        }
        return usuario;
    }


    public List<Usuarios> listar(){
        return repository.findAll();
    }


    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
        return true;

    }


    public Usuarios consultaPorId(Integer id){
        return repository.findById(id).orElseThrow();
    }



















}
