package proyecto.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.crud.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

}
