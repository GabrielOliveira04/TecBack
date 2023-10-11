package tech.gabrieloliveira.tecback.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.gabrieloliveira.tecback.model.Temporada;
import tech.gabrieloliveira.tecback.model.Usuarios;
import tech.gabrieloliveira.tecback.repository.TemporadaRepository;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class TemporadaService {


    @Autowired
    TemporadaRepository repository;



    public Temporada salvar(Temporada temporada){
        temporada = repository.save(temporada);
        return temporada;
    }

    public Temporada alterar( Temporada temporada) throws Exception{
        if(Objects.nonNull(temporada.getId())){
            temporada = repository.save(temporada);

        }else {
            throw new Exception();
        }
        return temporada;
    }


    public List<Temporada> listar(){
        return repository.findAll();
    }
    public Temporada consultaPorId(Integer id) {
        return repository.findById(id).orElseThrow();
    }
    public Boolean excluir (Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e){
            log.info("Erro ao realizar Exclusão:{}", e);
            return false;
        }
        return true;
    }
}
