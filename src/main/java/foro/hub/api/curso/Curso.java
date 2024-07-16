package foro.hub.api.curso;

import foro.hub.api.topico.Topico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="curso")
@Entity(name="Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

  //  @OneToMany(mappedBy = "curso")
  //  private List<Topico> topicos;

    public Curso(DatosCrearCurso datosCrearCurso) {
        this.nombre = datosCrearCurso.nombre();
        this.categoria = datosCrearCurso.categoria();
    }
}
