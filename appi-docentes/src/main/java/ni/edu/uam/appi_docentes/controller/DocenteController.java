package ni.edu.uam.appi_docentes.controller;

import ni.edu.uam.appi_docentes.modelo.Docente;
import ni.edu.uam.appi_docentes.repository.DocenteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {
    private final DocenteRepository repository;


    public DocenteController(DocenteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Docente> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Docente guardar(@RequestBody Docente docente) {
        return repository.save(docente);
    }
}
