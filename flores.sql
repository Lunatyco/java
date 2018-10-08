drop table continente;
drop table pais;
drop table flores;
drop table tipo_flor;
drop table transaccion;

create table continente(
id_continente number(38) not null,
nom_continente varchar2(20)
);

create table pais(
id_pais number(38) not null,
id_continente number(38),
nom_pais varchar2(20)
);

create table flores(
id_flores number(38) not null,
id_pais number(38),
id_tipo number(38)
);

create table tipo_flor(
id_tipo number(38) not null,
nombre varchar2(25),
descripcion varchar2(20)
);

create table transaccion(
id_transaccion number(38) not null,
id_pais number(38),
id_flores number(38),
fecha date,
tipo_transaccion varchar2(20)
);


insert into continente(id_continente, nom_continente) values ('11','asia');
insert into continente(id_continente, nom_continente) values ('22','europa');
insert into continente(id_continente, nom_continente) values ('33','norteamerica');
insert into continente(id_continente, nom_continente) values ('44','sudamerica');
insert into continente(id_continente, nom_continente) values ('55','africa');

insert into pais(id_pais, id_continente, nom_pais) values ('1','22','alemania');

insert into pais(id_pais, id_continente, nom_pais) values ('2','22','francia');

insert into pais(id_pais, id_continente, nom_pais) values ('3','22','belgica');

insert into pais(id_pais, id_continente, nom_pais) values ('4','22','espana');

insert into pais(id_pais, id_continente, nom_pais) values ('5','11','israel');

insert into pais(id_pais, id_continente, nom_pais) values ('6','44','bolivia');

insert into pais(id_pais, id_continente, nom_pais) values ('7','44','colombia');

insert into pais(id_pais, id_continente, nom_pais) values ('8','11','japon');


insert into pais(id_pais, id_continente, nom_pais) values ('9','11','korea');

insert into pais(id_pais, id_continente, nom_pais) values ('10','33','usa');

insert into tipo_flor(id_tipo, nombre, descripcion) values ('1','rosas','individual');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('2','crisantino','follaje');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('3','tulipan','individual');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('4','azucena','individual');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('5','orquidea','individual');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('6','lirio','follaje');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('7','fresia','follaje');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('8','lirio_agua','follaje');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('9','clavel','individual');
insert into tipo_flor(id_tipo, nombre, descripcion) values ('10','otro','individual');



insert into flores(id_flores, id_pais, id_tipo) values('1','2','1');

insert into flores(id_flores, id_pais, id_tipo) values('2','1','2');

insert into flores(id_flores, id_pais, id_tipo) values('3','5','3');

insert into flores(id_flores, id_pais, id_tipo) values('4','3','4');

insert into flores(id_flores, id_pais, id_tipo) values('5','5','5');

insert into flores(id_flores, id_pais, id_tipo) values('6','8','6');

insert into flores(id_flores, id_pais, id_tipo) values('7','4','7');

insert into flores(id_flores, id_pais, id_tipo) values('8','7','8');

insert into flores(id_flores, id_pais, id_tipo) values('9','10','9');

insert into flores(id_flores, id_pais, id_tipo) values('10','9','10');


insert into transaccion(id_transaccion, id_pais, id_flores, fecha, tipo_transaccion) values('1','5','5',TO_DATE('2018-01-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'exportacion');
insert into transaccion(id_transaccion, id_pais, id_flores, fecha, tipo_transaccion) values('2','8','6',TO_DATE('2018-07-15 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'exportacion');
insert into transaccion(id_transaccion, id_pais, id_flores, fecha, tipo_transaccion) values('3','9','10',TO_DATE('2018-05-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'exportacion');
insert into transaccion(id_transaccion, id_pais, id_flores, fecha, tipo_transaccion) values('4','8','6',TO_DATE('2018-04-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'),'importacion');
insert into transaccion(id_transaccion, id_pais, id_flores, fecha, tipo_transaccion) values('5','7','8',TO_DATE('2018-04-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'),'importacion');



alter table continente add primary key (id_continente);

alter table pais add primary key (id_pais);

alter table flores add primary key (id_flores);

alter table tipo_flor add primary key (id_tipo);

alter table transaccion add primary key (id_transaccion);

alter table pais add foreign key (id_continente) references continente(id_continente);

alter table flores add foreign key (id_pais) references pais(id_pais);

alter table flores add foreign key (id_tipo) references tipo_flor
(id_tipo);

alter table transaccion add foreign key (id_flores) references flores(id_flores);

alter table transaccion add foreign key (id_pais) references pais(id_pais);


set SERVEROUTPUT on
declare
nomflor varchar2(20);
idpais number(38);
begin
select a.NOMBRE, b.ID_PAIS 
into nomflor, idpais 
from tipo_flor a
inner join FLORES b
on a.ID_TIPO = b.ID_TIPO
where b.id_pais = '8';
DBMS_OUTPUT.put_line('Las flor: ' || nomflor || ' es importada desde Japón ' || idpais||' el cual es un pais de Asia' );
end;


set SERVEROUTPUT on
declare
tipotrans varchar2(20);
nomflor varchar2(20);
idpais number(38);
begin
select b.tipo_transaccion, a.nombre, b.id_pais
into tipotrans, nomflor, idpais
from TIPO_FLOR a
inner join TRANSACCION b
on a.ID_TIPO = b.ID_FLORES
where a.ID_TIPO = 6 and tipo_transaccion = 'importacion' and b.ID_PAIS = 8;
DBMS_OUTPUT.put_line('Transaccion ' || tipotrans || ' de ' || nomflor || 
's , fueron realizadas en el mes de Abril, desde ' || idpais || ' Japon');
end;



set SERVEROUTPUT on
declare
descripcion varchar2(20);
idpais number(38);
nomflor varchar2(20);
begin
select a.descripcion, b.ID_PAIS, a.NOMBRE
into descripcion, idpais, nomflor
from TIPO_FLOR a
inner join TRANSACCION b
on a.ID_TIPO = b.ID_FLORES
where a.descripcion = 'follaje' and id_flores = 8 and b.ID_PAIS = 7;
DBMS_OUTPUT.put_line('La flores importadas en formato de ' || descripcion || ' desde ' || idpais || ' Colombia, son ' || nomflor);
end;