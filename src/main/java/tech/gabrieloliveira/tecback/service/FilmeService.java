package tech.gabrieloliveira.tecback.service;

import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.gabrieloliveira.tecback.model.Filme;
import tech.gabrieloliveira.tecback.repository.FilmeRepository;

import java.util.List;
import java.util.Objects;
@Slf4j
@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;


    public Filme salvar(Filme filme) {
        filme = repository.save(filme);
        return filme;
    }

    public Filme alterar(Filme filme) throws Exception {
        if (Objects.nonNull(filme.getId())) {
            filme = repository.save(filme);
        } else {
            throw new Exception();
        }
        return filme;
    }

    public List<Filme> listar(){
      return repository.findAll();
    }
    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e){
            log.info("Erro ao realizar Exclusão :{}",e);
            return false;
        }
        return true;
    }


    public Filme consultarPorId(Integer id){

        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }





}