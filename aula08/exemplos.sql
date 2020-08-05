/* comentários */

# comentário

#criar um novo base de dados
create database meuBanco;

#apagar TODA a base de dados
drop database meubanco;

#traz os detalhes da tabela funcionário
desc funcionario;

#consulta os dados da tabela departamento

select * from departamento;

 alter table departamento drop column nomeDepto;
 alter table departamento add column nomeDep varchar(50);