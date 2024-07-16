package foro.hub.api.topico;

import foro.hub.api.curso.Curso;
import foro.hub.api.respuesta.Respuesta;
import foro.hub.api.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name="topico")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;

    @Enumerated(EnumType.STRING)
    private Estado status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Respuesta> respuestas;

    public Topico(DatosCrearTopico datosCrearTopico) {

            this.titulo= datosCrearTopico.titulo();
            this.mensaje= datosCrearTopico.mensaje();
            this.status= datosCrearTopico.status();
            this.autor= datosCrearTopico.autor();
            this.curso= datosCrearTopico.curso();
            this.fechaCreacion= LocalDateTime.now();

    }
}



