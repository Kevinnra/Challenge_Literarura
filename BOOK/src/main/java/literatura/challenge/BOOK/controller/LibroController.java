package literatura.challenge.BOOK.controller;

import literatura.challenge.BOOK.model.Libro;
import literatura.challenge.BOOK.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @PostMapping
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    @GetMapping
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }
}
