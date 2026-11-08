package ni.edu.uam.appi_docentes.repository;

import ni.edu.uam.appi_docentes.modelo.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente, Long> {

}
