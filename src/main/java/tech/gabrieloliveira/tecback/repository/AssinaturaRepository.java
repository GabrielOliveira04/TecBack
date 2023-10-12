package tech.gabrieloliveira.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.gabrieloliveira.tecback.model.Assinatura;
@Repository
public interface AssinaturaRepository extends JpaRepository<Assinatura, Integer> {

}
