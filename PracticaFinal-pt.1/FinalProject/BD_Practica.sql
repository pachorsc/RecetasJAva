drop table receta_etiqueta;
drop table puntuaciones;
drop table recetas;
drop table usuarios;
drop table etiquetas;


CREATE TABLE USUARIOS (
    cod integer GENERATED ALWAYS AS IDENTITY (Start with 1 increment by 1) primary key,
    nombre varchar2(20) unique,
    contrase�a varchar2(20) not null,
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

insert into USUARIOS (nombre, contrase�a, rol) values ('ADMIN', 'ADMIN', 1);
insert into USUARIOS (nombre, contrase�a) values ('pacho', 'pacho', 0);
insert into USUARIOS (nombre, contrase�a) values ('dani', 'dani', 0);

insert into recetas (nombre, autor , ingredientes, pasos) values('huevo frito', 1, 'huevo, aceite, oregano y pimienta', 'romper el huevo y freirlo en la sarten, posteriormente condimentar');
insert into recetas (nombre, autor , ingredientes, pasos) values('Galletas de chocolate', 1, 'huevo, miel, harina, mantequilla y chocolate', 'Bate los huevos con la harina y la mantequilla, a�ade el chocolate y mete en el horno 10 minutos');
insert into recetas (nombre, autor , ingredientes, pasos) values('Tortitas', 2, 'harina, huevo, aceite, mantequilla y leche', 'Batir todo y llevar a la sarten');
insert into recetas (nombre, autor , ingredientes, pasos) values('Pavo en salsa de la abuela', 2, 'pavo, cebolla, tomate, pimiento, oregano, pimenton', 'cortar las verduras y sofreir, a�adir el pollo y el tomate');
insert into recetas (nombre, autor , ingredientes, pasos) values('Arroz con pollo', 3, 'Arroz y pollo', 'hacer el arroz y el pollo');

insert into ETIQUETAS (nombre) values ('Desayuno');
insert into ETIQUETAS (nombre) values ('Almuerzo');
insert into ETIQUETAS (nombre) values ('Cena');
insert into ETIQUETAS (nombre) values ('Dulce');
insert into ETIQUETAS (nombre) values ('Salado');
insert into ETIQUETAS (nombre) values ('Carne');
insert into ETIQUETAS (nombre) values ('Vegetariano');
insert into ETIQUETAS (nombre) values ('Sano');

commit;