package literatura.challenge.BOOK.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import literatura.challenge.BOOK.model.Libro;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GutendexService {
    private final ConsumoAPI consumoAPI;

    public GutendexService(ConsumoAPI consumoAPI) {
        this.consumoAPI = consumoAPI;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        String url = "https://gutendex.com/books?search=" + titulo.replace(" ", "%20");
        String respuesta = consumoAPI.obtenerDatos(url);

        try {
            JsonNode json = new ObjectMapper().readTree(respuesta);
            JsonNode libroJson = json.get("results").get(0);

            String tituloLibro = libroJson.get("title").asText();
            String idioma = libroJson.get("languages").get(0).asText();
            List<String> autores = new ArrayList<>();
            libroJson.get("authors").forEach(a -> autores.add(a.get("name").asText()));
            String fechaPublicacion = libroJson.get("copyright_year").asText(null);
            Integer descargas = libroJson.get("download_count").asInt();

            return new Libro(tituloLibro, idioma, autores, fechaPublicacion, descargas);
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException("Error al procesar la respuesta de Gutendex.");
        }
    }
}

