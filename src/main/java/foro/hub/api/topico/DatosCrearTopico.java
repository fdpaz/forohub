package foro.hub.api.topico;

import foro.hub.api.curso.Curso;
import foro.hub.api.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;

public record DatosCrearTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        Estado status,
        @NotBlank
        Usuario autor,
        @NotBlank
        Curso curso) {

}
