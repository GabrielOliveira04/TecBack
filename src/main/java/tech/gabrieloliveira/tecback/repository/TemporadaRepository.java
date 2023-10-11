package tech.gabrieloliveira.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.gabrieloliveira.tecback.model.Temporada;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada,Integer> {
}
