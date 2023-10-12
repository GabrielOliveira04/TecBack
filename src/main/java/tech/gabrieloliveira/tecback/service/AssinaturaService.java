package tech.gabrieloliveira.tecback.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.gabrieloliveira.tecback.model.Assinatura;
import tech.gabrieloliveira.tecback.model.Filme;
import tech.gabrieloliveira.tecback.model.Series;

import tech.gabrieloliveira.tecback.model.TipoPlano;
import tech.gabrieloliveira.tecback.repository.AssinaturaRepository;

@Slf4j
@Service
public class AssinaturaService {

    @Autowired
    private AssinaturaRepository repository;


    public boolean permiteAssistirFilmeSerie(Assinatura assinatura, Filme filme, Series series) {
        if (assinatura == null) {
            throw new IllegalArgumentException("Assinatura não existe!");
        }
        int visualizacoes = filme.getVisualizacoes();
        if (assinatura.getTipoPlano() == TipoPlano.BASICO && visualizacoes >= 1) {
            return false;
        } else if (assinatura.getTipoPlano() == TipoPlano.PADRAO && visualizacoes >= 2) {
            return false;
        } else if (assinatura.getTipoPlano() == TipoPlano.PREMIUM && visualizacoes >= 100000) {
            return false;
        }

        return true;


    }


}
