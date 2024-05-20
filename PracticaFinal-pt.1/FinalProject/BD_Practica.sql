drop table receta_etiqueta;
drop table puntuaciones;
drop table recetas;
drop table usuarios;
drop table etiquetas;


CREATE TABLE USUARIOS (
    cod integer GENERATED ALWAYS AS IDENTITY (Start with 1 increment by 1) primary key,
    nombre varchar2(20) unique,
    contraseña varchar2(20) not null,
    rol number(1) default 0 check (rol between 0 and 1)
);

CREATE TABLE RECETAS (
    cod integer GENERATED ALWAYS AS IDENTITY (Start with 1 increment by 1) primary key,
    nombre varchar2(20) not null,
    autor integer,
    ingredientes varchar2(50),
    pasos varchar2(50),
    constraint fk_re_us foreign key (autor) references usuarios(cod) 
);

CREATE TABLE ETIQUETAS(
    cod integer GENERATED ALWAYS AS IDENTITY (Start with 1 increment by 1) primary key,
    nombre varchar2(20) not null
);

CREATE TABLE RECETA_ETIQUETA(
    receta integer,
    etiqueta number(2,0),
    CONSTRAINT pk_re_et primary key(receta, etiqueta)
);

CREATE TABLE PUNTUACIONES (
    usuario integer,
    receta integer,
    nota number(2,0) check(nota between 0 and 10) not null,
    comentario varchar2(100),
    CONSTRAINT pk_punt primary key (usuario, receta),
    CONSTRAINT fk_pun_rec foreign key (receta) references recetas(cod),
    CONSTRAINT fk_pun_usu foreign key (usuario) references usuarios(cod)
);

insert into USUARIOS (nombre, contraseña, rol) values ('ADMIN', 'ADMIN', 1);

insert into ETIQUETAS (nombre) values ('Desayuno');
insert into ETIQUETAS (nombre) values ('Almuerzo');
insert into ETIQUETAS (nombre) values ('Cena');
insert into ETIQUETAS (nombre) values ('Dulce');
insert into ETIQUETAS (nombre) values ('Salado');
insert into ETIQUETAS (nombre) values ('Carne');
insert into ETIQUETAS (nombre) values ('Vegetariano');
insert into ETIQUETAS (nombre) values ('Sano');

insert into recetas (nombre, autor , ingredientes, pasos) values('huevo', 1, 'hueso', 'no se');
insert into recetas (nombre, autor , ingredientes, pasos) values('hue', 1, 'hueso', 'no se');

commit;