create user centro
identified by Medico
default tablespace users
temporary tablespace temp
quota 2000k on users;

grant create session, create table to centro;

drop table comuna;
drop table centro;
drop table paciente;
drop table especialidad;
drop table doctor;
drop table consulta;

create table comuna(
com_id char(4),
com_nombre varchar2(20)
);

create table centro(
cen_id number(6),
cen_nombre varchar2(20),
com_id char(4)
);

create table paciente(
pac_rut varchar2(8),
pac_dv char(1),
pac_nombre varchar2(20),
pac_apellido varchar2(20),
pac_edad number(3),
pac_fecha_nac date
);

create table especialidad(
esp_id number,
esp_nombre varchar2(20),
esp_tarifa number(8)
);

create table doctor(
doc_id char(9),
doc_nombre varchar2(20),
doc_apellido varchar2(20),
esp_id number
);

create table consulta(
con_id integer,
pac_rut varchar2(8),
doc_id char(9),
pac_dv char(1),
con_fecha date,
cen_id number(6)
);

alter table paciente
add constraint pk_paciente
primary key(pac_rut, pac_dv);


alter table especialidad
add constraint pk_especialista
primary key(esp_id);

alter table consulta
add constraint pk_consulta
primary key(con_id, con_fecha);


alter table doctor
add constraint pk_doctor
primary key(doc_id);

alter table centro
add constraint pk_centro
primary key(cen_id);

alter table comuna
add constraint pk_comuna
primary key(com_id);

alter table centro
add constraint fk_com_id
foreign key(com_id)
references comuna(com_id);

alter table doctor
add constraint fk_esp_id
foreign key(esp_id)
references especialidad(esp_id);

alter table consulta
add constraint fk_pac_dv
foreign key(pac_rut, pac_dv)
references paciente(pac_rut, pac_dv);

alter table consulta
add constraint fk_doc_id
foreign key(doc_id)
references doctor(doc_id);

alter table consulta
add constraint fk_cen_id
foreign key(cen_id)
references centro(cen_id);

desc centro;
desc comuna;
desc consulta;
desc doctor;
desc especialidad;
desc paciente;
