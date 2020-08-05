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

#alterar uma coluna da tabela

# alter table departamento drop column nomeDepto;
# alter table departamento add column nomeDep varchar(50);

#removendo um registro da tabela

# delete from departamento where idDepto = 5;

select * from funcionario;

SELECT 
    *
FROM
    funcionario
        INNER JOIN
    departamento ON funcionario.idDepto = departamento.idDepto; 
