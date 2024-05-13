/*RECETA:cod, nombre, creador, duracion, desc, puntuacion
USUARIO: NOMBRE, CONTRASEÑA*/

drop table usuarios;
drop table recetas;

CREATE TABLE USUARIOS (
    nombre varchar2(20) primary key,
    contraseña varchar2(20) not null,
    rol number(1) default 0 check (rol between 0 and 1)
);

CREATE TABLE RECETAS (
    cod number(2,0) primary key,
    nombre varchar2(20) not null,
    creador varchar2(20),
    duracion number(2,0),
    puntuacion varchar2(20) check (puntuacion between 0 and 10),
    constraint fk_re_us foreign key (creador) references usuarios (nombre)
);

commit;