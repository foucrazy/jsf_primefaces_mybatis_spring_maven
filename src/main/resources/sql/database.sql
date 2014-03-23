drop table cursos cascade;
drop table niveles cascade;
drop table profesores cascade;

create table profesores(
	"idProfesor" integer PRIMARY KEY,
	nombre varchar(150)
);

create table niveles(
	"idNivel" integer PRIMARY KEY,
	valor varchar(15)
);

create table cursos(
	"idCurso" serial PRIMARY KEY,
	titulo varchar(200),
	horas integer,
	"idNivel" integer references niveles("idNivel"),
	"idProfesor" integer references profesores("idProfesor"),
	activo boolean	
);

insert into niveles("idNivel",valor) values (1,'Básico');
insert into niveles("idNivel",valor) values (2,'Intermedio');
insert into niveles("idNivel",valor) values (3,'Avanzado');

insert into profesores("idProfesor",nombre) values(1,'Roberto Canales Mora');
insert into profesores("idProfesor",nombre) values(2,'Ismael Fernandez Molina');
insert into profesores("idProfesor",nombre) values(3,'Félix González de Santos');

insert into cursos(titulo,horas,"idNivel","idProfesor",activo) values('Manipulación de datos en MongoDB mediante Aggregation Pipeline',10,3,1,true);
insert into cursos(titulo,horas,"idNivel","idProfesor",activo) values('Agrupación de datos con MongoDB: uso de Group',7,2,1,true);
insert into cursos(titulo,horas,"idNivel","idProfesor",activo) values('Primeros pasos con Apache Cassandra',6,1,1,true);
insert into cursos(titulo,horas,"idNivel","idProfesor",activo) values('Desarrollo rápido de aplicaciones CRUD con OpenXava',10,2,2,true);
insert into cursos(titulo,horas,"idNivel","idProfesor",activo) values('Primeros pasos con MyBatis',3,1,3,false);
