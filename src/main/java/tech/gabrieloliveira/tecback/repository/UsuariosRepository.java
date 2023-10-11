package tech.gabrieloliveira.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.gabrieloliveira.tecback.model.Usuarios;
@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {

}
