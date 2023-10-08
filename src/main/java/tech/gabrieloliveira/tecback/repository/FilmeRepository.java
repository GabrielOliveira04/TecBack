package tech.gabrieloliveira.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.gabrieloliveira.tecback.model.Filme;
@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
}
