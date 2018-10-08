create user prueba1
identified by inacap
default tablespace users
temporary tablespace temp
quota 2000k on users;

grant create session, create table to prueba1;

create table autos(
id_auto number(5),
ano number(5),
precio number(8),
patente varchar(6),
id_modelo number(3),
rut_persona number(9),
dv_persona char(1),
id_tipo_auto number(5)
);

create table personas(
rut_persona number(9),
dv_persona char(1),
nombre varchar(50),
apellidos varchar(100)
);

create table modelos(
id_modelo number(3),
nombre varchar(50),
id_marca number(3)
);

create table marcas(
id_marca number(3),
nombre varchar(50)
);

create table tipo_auto(
id_tipo_auto number(5),
tipo_auto varchar(50)
);

alter table tipo_auto
add constraint FK_id_tipo_auto
foreign key (id_tipo_auto)
references autos(id_tipo_auto);


alter table autos
add constraint PK_autos
primary key(id_auto);

alter table modelos
add constraint PK_modelos
primary key(id_modelo);

alter table marcas
add constraint PK_marcas
primary key(id_marca);

alter table personas
add constraint PK_personas
primary key(rut_persona);

alter table autos
add constraint FK_id_modelo
foreign key(id_modelo)
references modelos(id_modelo);

alter table modelos
add constraint FK_id_marca
foreign key(id_marca)
references marcas(id_marca);

alter table autos
add constraint FK_rut_persona
foreign key (rut_persona)
references personas(rut_persona);

alter table autos
add constraint check_autos
check (ano>2015 and precio>1000000);

insert into personas(RUT_PERSONA,dv_persona,nombre,apellidos) values(16752485,'K', 'Benito','Camelo');
insert into personas(RUT_PERSONA,dv_persona,nombre,apellidos) values(15842756,0, 'Bombo','Fica');


insert into marcas(id_marca, nombre) values(1,'Kia');
insert into marcas(id_marca, nombre) values(2,'Hyundai');
insert into marcas(id_marca, nombre) values(3,'Chevrolet');


insert into modelos(id_modelo, nombre, id_marca) values(1,'Rio 4',1);
insert into modelos(id_modelo, nombre, id_marca) values(2,'Cerato',1);
insert into modelos(id_modelo, nombre, id_marca) values(3,'Sail',3);

insert into autos(ID_AUTO,ano,precio,patente,id_modelo,rut_persona,dv_persona) values(1,2017,60000000,'JAPE11',1,16752485,'K');

insert into autos(ID_AUTO,ano,precio,patente,id_modelo,rut_persona,dv_persona) values(2,2017,75000000,'JOLA33',2,16752485,'K');

insert into autos(ID_AUTO,ano,precio,patente,id_modelo,rut_persona,dv_persona) values(3,2018,65000000,'JILA18',3,15842756,0);

insert into autos(ID_AUTO,ano,precio,patente,id_modelo,rut_persona,dv_persona) values(4,2018,60000000,'JOPO25',2,15842756,0);

insert into autos(ID_AUTO,ano,precio,patente,id_modelo,rut_persona,dv_persona) values(5,2018,10000000,'JPPE21',2,16752485,'K');

UPDATE marcas SET marcas.NOMBRE = 'CocaCola' where marcas.nombre = 'Chevrolet';

delete from AUTOS where ano = 2018;

select  a.patente, a.ano, p.rut_persona, p.dv_persona, p.nombre from autos a, personas p;

select autos.patente, autos.ano, personas.rut_persona, personas.dv_persona, personas.nombre from autos inner join personas on autos.RUT_PERSONA = personas.RUT_PERSONA;

select m.nombre, mo.nombre,a.precio,a.ano,a.patente from marcas m, modelos mo, autos a;

select marcas.nombre, modelos.nombre, autos.precio, autos.ano, autos.patente from autos inner join modelos on autos.ID_MODELO  = modelos.ID_MODELO inner join marcas on modelos.ID_MARCA = marcas.ID_MARCA;
