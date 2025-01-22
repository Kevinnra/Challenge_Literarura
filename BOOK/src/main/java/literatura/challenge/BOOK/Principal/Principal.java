package literatura.challenge.BOOK.Principal;


import literatura.challenge.BOOK.model.Libro;
import literatura.challenge.BOOK.repository.LibroRepository;
import literatura.challenge.BOOK.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal implements CommandLineRunner {
    @Autowired
    private GutendexService gutendexService;
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1 - Buscar libro por título");
            System.out.println("2 - Listar libros registrados");
            System.out.println("3 - Listar autores registrados");
            System.out.println("4 - Listar autores vivos en determinado año");
            System.out.println("5 - Listar libros por idioma");
            System.out.println("6 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    Libro libro = gutendexService.buscarLibroPorTitulo(titulo);
                    libroRepository.save(libro);
                    System.out.println("Libro guardado: " + libro.getTitulo());
                }
                case 2 -> libroRepository.findAll().forEach(System.out::println);
                case 3 -> libroRepository.findAll()
                        .stream()
                        .flatMap(libro -> libro.getAutores().stream())
                        .distinct()
                        .forEach(System.out::println);
                case 4 -> {
                    System.out.print("Ingrese el año: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    libroRepository.findAll().stream()
                            .flatMap(libro -> libro.getAutores().stream())
                            .filter(autor -> autorEstaVivoEn(autor, year))
                            .forEach(System.out::println);
                }
                case 5 -> {
                    System.out.print("Ingrese el idioma (e.g., 'en'): ");
                    String idioma = scanner.nextLine();
                    libroRepository.findByIdioma(idioma).forEach(System.out::println);
                }
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private boolean autorEstaVivoEn(String autor, int year) {
        // Implementar lógica para verificar si un autor está vivo en el año dado
        return true; // Ejemplo: reemplazar con lógica real
    }
}
