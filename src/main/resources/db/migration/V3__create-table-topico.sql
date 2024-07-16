CREATE TABLE topico (
                        id BIGINT NOT NULL AUTO_INCREMENT,
                        titulo VARCHAR(100) NOT NULL UNIQUE,
                        mensaje VARCHAR(250) NOT NULL,
                        fecha_creacion DATETIME NOT NULL,
                        status VARCHAR(50) NOT NULL,
                        autor_topico_id BIGINT NOT NULL,
                        curso_id BIGINT NOT NULL,
                        PRIMARY KEY (id),
                        CONSTRAINT fk_topicos_autor_topico_id FOREIGN KEY (autor_topico_id) REFERENCES usuario(id),
                        CONSTRAINT fk_topicos_curso_topico_id FOREIGN KEY (curso_id) REFERENCES curso(id)
);