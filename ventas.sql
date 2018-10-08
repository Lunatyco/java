drop table detalle_boleta;
drop table boleta;
drop table cliente;
drop table producto;
drop table vendedor;


create table detalle_boleta(
nro_boleta number(10) not null,
cod_producto number(8) not null,
cantidad number(5),
valor_unitario number(5),
valor_total number(8)
);

create table boleta(
nro_boleta number(10) not null,
fecha_boleta date,
monto_boleta number(10),
id_vendedor number(5),
cod_cliente number(5)
);

create table cliente(
cod_cliente number(5) not null,
numrut_cliente number(10),
dvrut_cliente varchar2(1),
pnombre_cliente varchar2(25),
snombre_cliente varchar2(25),
appat_cliente varchar2(25),
apmat_cliente varchar2(25),
fecha_incorporacion date
);

create table producto(
cod_producto number(8) not null,
desc_producto varchar2(40),
stock_minimo number(5),
stock_actual number(5)
);

create table vendedor(
cod_vendedor number(5) not null,
numrut_vendedor number(10),
dvrut_vendedor varchar2(1),
pnombre_vendedor varchar2(25),
snombre_vendedor varchar2(25),
appat_vendedor varchar2(25),
apmat_vendedor varchar2(25),
fecha_contrato date,
porc_comision number(3,1),
sueldo_base number(8)
);

alter table producto add primary key (cod_producto);

alter table boleta add primary key (nro_boleta);

alter table vendedor add primary key (cod_vendedor);

alter table cliente add primary key (cod_cliente);

alter table boleta add foreign key (id_vendedor) references vendedor(cod_vendedor);

alter table boleta add foreign key (cod_cliente) references cliente(cod_cliente);

alter table detalle_boleta add foreign key (cod_producto) references producto(cod_producto);

alter table detalle_boleta add foreign key (nro_boleta) references boleta(nro_boleta);

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('1','16762783','1','juan','carlos','jara','jara',TO_DATE('2018-05-08 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('2','15742763','2','pedro','pablo','moya','sepa',TO_DATE('2018-04-09 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('3','15767423','4','roberto','carlos','mil','amigos',TO_DATE('2018-03-16 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('4','18187263','2','aleandro','ricardo','gamboa','meza',TO_DATE('2018-01-05 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('5','13633872','k','renato','javier','rodriguez','castro',TO_DATE('2018-08-19 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('6','12752783','4','pedro','pablo','vega','cordoba',TO_DATE('2018-09-20 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('7','11734783','2','pablo','puerco','diaz','jara',TO_DATE('2018-03-30 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('8','17123741','5','luis','alberto','jara','toro',TO_DATE('2018-11-05 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('9','11183733','6','javiera','christel','vera','jara',TO_DATE('2017-12-20 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));

insert into cliente(cod_cliente,numrut_cliente, dvrut_cliente, pnombre_cliente, snombre_cliente, appat_cliente, apmat_cliente, fecha_incorporacion) values('10','13837283','k','abril','june','lara','verdugo',TO_DATE('2018-08-16 19:00:00', 'YYYY-MM-DD HH24:MI:SS'));


insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('1','20','10','50');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('2','25','5','20');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('3','15','15','100');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('4','10','10','50');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('5','30','2','25');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('6','20','5','80');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('7','35','10','60');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('8','15','1','5');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('9','25','12','60');

insert into producto(cod_producto, desc_producto, stock_minimo, stock_actual) values('10','30','2','18');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('1','18767823','1','carlos','alberto','coloma','letelier',TO_DATE('2018-05-08 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'20','500000');


insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('2','17647243','3','juan','jose','jara','gomez',TO_DATE('2016-04-16 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'30','750000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('3','16728313','2','carla','maria','jonia','ramos',TO_DATE('2017-05-08 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'25','650000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('4','12312342','5','juana','martha','lazo','lillo',TO_DATE('2015-05-08 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'30','800000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('5','15787823','3','fabrizio','joao','tulinda','loza',TO_DATE('2018-03-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'15','375000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('6','16745823','k','ricardo','remulo','roma','remo',TO_DATE('2017-08-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'20','525000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('7','17887623','6','ricardo','juan','rosas','rojas',TO_DATE('2018-01-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'10','350000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('8','16784323','4','javiera','sofia','ramos','burgos',TO_DATE('2015-04-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'30','800000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('9','13767823','k','cristian','alberto','miranda','sepulveda',TO_DATE('2018-06-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'10','325000');

insert into vendedor(cod_vendedor,numrut_vendedor,dvrut_vendedor, pnombre_vendedor, snombre_vendedor, appat_vendedor, apmat_vendedor, fecha_contrato, porc_comision, sueldo_base) values('10','10798823','6','evaristo','aldo','moya','mirano',TO_DATE('2014-03-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'35','900000');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('1', TO_DATE('2018-04-01 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'75000','1','1');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('2', TO_DATE('2018-04-02 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'24000','2','2');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('3', TO_DATE('2018-04-03 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'50000','3','3');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('4', TO_DATE('2018-04-04 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'33000','4','4');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('5', TO_DATE('2018-04-05 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'250000','5','5');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('6', TO_DATE('2018-04-06 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'70000','6','6');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('7', TO_DATE('2018-04-07 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'280000','7','7');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('8', TO_DATE('2018-04-08 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'100000','8','8');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('9', TO_DATE('2018-04-09 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'18000','9','9');

insert into boleta(nro_boleta, fecha_boleta, monto_boleta,id_vendedor, cod_cliente) values('10', TO_DATE('2018-04-10 19:00:00', 'YYYY-MM-DD HH24:MI:SS'),'160000','10','10');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('1','1','15','5000','60000');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('2','2','3','8000','18000');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('3','3','20','2500','42500');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('4','4','22','1500','29700');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('5','5','10','25000','175000');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('6','6','20','3500','56000');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('7','7','8','35000','182000');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('8','8','2','50000','85000');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('9','9','9','2000','13500');

insert into detalle_boleta(nro_boleta, cod_producto, cantidad, valor_unitario, valor_total) values ('10','10','2','80000','112000');

commit;

select (vendedor.sueldo_base + (boleta.monto_boleta * vendedor.porc_comision)/100  ) as sueldo_total_vendedor from vendedor inner join boleta on vendedor.cod_vendedor = boleta.id_vendedor;

select detalle_boleta.cantidad, boleta.monto_boleta, detalle_boleta.valor_total as valor_con_descuento from detalle_boleta inner join boleta on boleta.nro_boleta = detalle_boleta.nro_boleta;