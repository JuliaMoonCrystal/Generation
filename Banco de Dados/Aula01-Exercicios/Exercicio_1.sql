CREATE DATABASE db_RH; -- criando o banco de dados
use db_Rh;


CREATE TABLE tb_funcionaries(
id BIGINT NOT NULL auto_increment,
nome VARCHAR(100) NOT NULL ,
setor VARCHAR(100) NOT NULL,
salario DECIMAL(7,2) NOT NULL,
cargo VARCHAR(100) NOT NULL,
primary key(id)
);

INSERT INTO tb_funcionaries(nome,setor,salario,cargo) VALUES
("Julia"," TI",1900,"Desenvolvedora Front-End jr"),
("Pedro"," TI",1900,"Desenvolvedor Back-End jr"),
("Jessica"," TI",1900,"Desenvolvedora Full-Stack jr"),
("Luan"," RH",6000,"Gerente do RH"),
("Juliana","Financeiro",6000,"Contador");

SELECT * FROM tb_funcionaries;

-- maior que 2000
SELECT nome,setor,salario,cargo FROM tb_funcionaries WHERE salario >=2000;

-- menor que 2000
SELECT nome,setor,salario,cargo FROM tb_funcionaries WHERE salario <2000;

-- atualizando um dados
UPDATE tb_funcionaries SET salario =2900 WHERE id=1;
SELECT * FROM tb_funcionaries;

