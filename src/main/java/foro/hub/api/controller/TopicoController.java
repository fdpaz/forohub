package foro.hub.api.controller;


import foro.hub.api.topico.DatosCrearTopico;
import foro.hub.api.topico.Topico;
import foro.hub.api.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosCrearTopico datosCrearTopico){
       topicoRepository.save(new Topico(datosCrearTopico));
    }
}
