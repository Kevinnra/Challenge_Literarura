package literatura.challenge.BOOK.repository;



import literatura.challenge.BOOK.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByTituloContainsIgnoreCase(String titulo);
    List<Libro> findByIdioma(String idioma);
    List<Libro> findByAutoresContains(String autor);
}
