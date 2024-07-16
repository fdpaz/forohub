package foro.hub.api.controller;


import foro.hub.api.curso.Curso;
import foro.hub.api.curso.CursoRepository;
import foro.hub.api.curso.DatosCrearCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

  @Autowired
  private CursoRepository cursoRepository;

  @PostMapping
  public void registrarCurso(@RequestBody DatosCrearCurso datosCrearCurso) {
    cursoRepository.save(new Curso(datosCrearCurso));
  }

  @GetMapping
  public List<Curso> listarCursos() {
    return cursoRepository.findAll();
  }
}
