    create table usuario(

        id bigint not null auto_increment,
        nombre varchar(100) not null unique,
        correElectronico varchar(100) not null unique,
        contrasena varchar(100) not null,

        primary key(id)
    );