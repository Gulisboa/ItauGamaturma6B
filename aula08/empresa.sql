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
 
 insert into funcionario values(null, 'Carlos Silva', 'carlos@empresa.com', 'M', '2020-01-14', 5000, 1);
 insert into funcionario values(null, 'Ricardo', 'ricardo@empresa.com', 'M', '2020-02-13', 6000 , 2);
 insert into funcionario values(null, 'Pedro', 'pedro@empresa.com', 'M', '2020-03-10', 4500, 1 );
 insert into funcionario values(null, 'Camila', 'camila@empresa.com', 'F', '2020-01-09', 7500 , 3);
 insert into funcionario values(null, 'Armando', 'armando@empresa.com', 'M', '2020-05-21', 4500, 4 );
 
 insert into projeto values (null, 'Nova rodovia BR-876');
 insert into projeto values (null, 'Novo viaduto do chá');
 insert into projeto values (null, 'Reforma Maracanã');
 
 insert into projfunc values(1, 1);
 insert into projfunc values(2, 1);
 insert into projfunc values(1, 2);
 insert into projfunc values(1, 3);
 insert into projfunc values(3, 3);
 
#consultas aos dados
 
 
#listar todos os funcionários da empresa
SELECT 
    *
FROM
    funcionario;
 
# listar apenas nome e email dos funcionarios
SELECT 
    nome, email
FROM
    funcionario;
 
# procurar o email do funcionario com primeiro nome Pedro
 
SELECT 
    nome, email
FROM
    funcionario
WHERE
    nome LIKE 'Pedro%'; # o símbolo % representa qualquer sequencia de caracteres
    
# Quais os departamentos de cada funcionário

#solução 1
select funcionario.nome, departamento.nomeDep 
from funcionario inner join departamento on funcionario.idDepto = departamento.idDepto;

#solução 2
select funcionario.nome, departamento.nomeDep 
from funcionario inner join departamento using (idDepto);


# listar todos os funcionários e seus projetos
select funcionario.nome, projeto.titulo
from funcionario inner join projfunc using (idFunc) 
	inner join projeto using (idProj) order by funcionario.nome;
    
# listar todos os funcionários e seus projetos, mesmo que o funcionário não esteja em projetos
select funcionario.nome, projeto.titulo
from funcionario left join projfunc using (idFunc) 
	left join projeto using (idProj) order by funcionario.nome;

# em quantos projetos cada funcionário está alocado
select funcionario.nome, count(idFunc) NumProjetos
from funcionario inner join projfunc using (idFunc) 
	inner join projeto using (idProj) 
    group by idFunc
    order by funcionario.nome;

select funcionario.nome, count(idProj) NumProjetos
from funcionario left join projfunc using (idFunc) 
	left join projeto using (idProj) 
    group by idFunc
    order by funcionario.nome;
    
 # mostre a média de salários dos funcioinarios
 
 select avg(salario) mediaSalario
 from funcionario;
 
 # quais são os funcionários que ganham acima da média
 
 select nome, salario
 from funcionario
 where salario > ( 
	select avg(salario) mediaSalario
	from funcionario
);
 
# quem foi contratado no dia 14/01/2020
 
#solução 1 - padrão MySQL
select nome from funcionario where dataAdm = '2020-01-14';
 
#solução 2 - alterando o formato da data
select nome from funcionario where dataAdm = str_to_date('14/01/2020','%d/%m/%Y');