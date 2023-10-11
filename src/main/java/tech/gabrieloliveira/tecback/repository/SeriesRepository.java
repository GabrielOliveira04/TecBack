package tech.gabrieloliveira.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.gabrieloliveira.tecback.model.Series;
@Repository
public interface SeriesRepository extends JpaRepository<Series,Integer> {
}
