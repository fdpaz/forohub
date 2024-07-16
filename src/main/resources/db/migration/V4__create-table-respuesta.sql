CREATE TABLE respuesta (
                           id BIGINT NOT NULL AUTO_INCREMENT,
                           mensaje VARCHAR(255) NOT NULL,
                           topico_id BIGINT NOT NULL,
                           fecha_creacion DATETIME NOT NULL,
                           autor_id BIGINT NOT NULL,
                           solucion TINYINT NOT NULL,

                           PRIMARY KEY (id),

                           CONSTRAINT fk_respuestas_autor_id FOREIGN KEY (autor_id) REFERENCES usuario(id),
                           CONSTRAINT fk_respuestas_topico_id FOREIGN KEY (topico_id) REFERENCES topico(id)
);
