# criação de uma nova base dados

create database empresa;

use empresa; #coloca a database empresa como padrão

 # criar a tabela de departamentos
 
 # drop table if exists departamento;
 

 create table departamento(
	idDepto int not null auto_increment,
    nomeDep varchar(50),
    andar smallint,
    constraint pk_departamento primary key (idDepto)
 );
 
 create table funcionario(
	idFunc int not null auto_increment,
    nome varchar(100) not null,
    email varchar(80),
    sexo enum('M','F') not null,
    dataAdm date,
    salario float,
    idDepto int,
    constraint pk_funcionario primary key (idFunc),
    constraint fk_func_depto foreign key (idDepto) references departamento(idDepto)
 );
 
 create table projeto(
	idProj int not null auto_increment,
    titulo varchar(40),
    constraint pk_projeto primary key (idProj)
 );
 
 create table projfunc (
	idFunc int not null,
    idProj int not null,
    constraint pk_projfunc primary key (idFunc, idProj),
    constraint fk_func_projfunc foreign key (idFunc) references funcionario (idFunc),
    constraint fk_proj_projfunc foreign key (idProj) references projeto (idProj)
 );
 
 # inserindo dados nas tabelas
 
 insert into departamento values (null, 'Engenharia', 15);
 insert into departamento values (null, 'TI', 16);
 insert into departamento values (null, 'Financeiro', 15);
 insert into departamento values (null, 'Compras', 14);
 