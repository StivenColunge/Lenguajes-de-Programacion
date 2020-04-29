create database mascota;
use mascota;

create table usuario(
mascota varchar (11) not null,
raza varchar (50) not null,
edad int (10) not null,
dueño varchar(20)not null,
celular int (20) not null
) ENGINE = InnoDB default charset = latin1;


insert into usuario (mascota, raza, edad,dueño,celular)
values  ('ROSE','Pastor aleman','2','stiven','3129876'),
		('REX','no tiene','3','carlos','3122222'),
		('HOLI','gato montes','1','walter','3082312'),
        ('POPI','gato FENIX','4','camilo','2222312'),
        ('JULIET','PUBG','1','laura','3992312');
        
        select * from mascota.usuario
		