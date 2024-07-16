package foro.hub.api.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCrearCurso(
        @NotBlank
        String nombre,
        @NotBlank
        Categoria categoria) {

}
