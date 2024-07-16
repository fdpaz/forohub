package foro.hub.api.controller;


import foro.hub.api.respuesta.RespuestaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    private RespuestaRepository respuestaRepository;
}
