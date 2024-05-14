drop table recetas;
drop table usuarios;
drop table etiquetas;
drop table receta_etiqueta;

CREATE TABLE USUARIOS (
    nombre varchar2(20) primary key,
    contraseña varchar2(20) not null,
    rol number(1) default 0 check (rol between 0 and 1)
);

CREATE TABLE RECETAS (
    cod integer GENERATED ALWAYS AS IDENTITY (Start with 1 increment by 1) primary key,
    nombre varchar2(20) not null,
    autor varchar2(20),
    ingredientes varchar2(50),
    pasos varchar2(50),
    constraint fk_re_us foreign key (autor) references usuarios (nombre) 
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

insert into USUARIOS values ('ADMIN', ADMIN, 1);

insert into ETIQUETAS (nombre) values ('Desayuno');
insert into ETIQUETAS (nombre) values ('Almuerzo');
insert into ETIQUETAS (nombre) values ('Cena');
insert into ETIQUETAS (nombre) values ('Dulce');
insert into ETIQUETAS (nombre) values ('Salado');
insert into ETIQUETAS (nombre) values ('Carne');
insert into ETIQUETAS (nombre) values ('Vegetariano');
insert into ETIQUETAS (nombre) values ('Sano');

commit;