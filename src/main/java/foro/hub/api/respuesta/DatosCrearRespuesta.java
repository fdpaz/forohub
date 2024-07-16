package foro.hub.api.respuesta;

import jakarta.validation.constraints.NotBlank;

public record DatosCrearRespuesta(
        @NotBlank
        String mensaje,
        @NotBlank
        Long idTopico,
        @NotBlank
        Long idAutor,
        @NotBlank
        String solucion
) {
}
