
package demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "¡Hola, mundo desde Spring Boot!";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido a Spring Boot.";
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "proyecto", "Demo Spring Boot",
            "version", "1.0",
            "mensaje", "Mi primera API REST"
        );
    }
}
