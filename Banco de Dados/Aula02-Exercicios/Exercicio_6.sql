CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
id BIGINT auto_increment NOT NULL,
tipo_curso VARCHAR(100) NOT NULL,
modalidade VARCHAR(20) NOT NULL,
qtd_semestres INT NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE tb_curso(
id BIGINT auto_increment NOT NULL,
nome VARCHAR(100) NOT NULL,
carga_Horaria INT NOT NULL,
descricao VARCHAR(100) NOT NULL,
nome_faculdade VARCHAR(100) NOT NULL,
id_categoria BIGINT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo_curso,modalidade,qtd_semestres)VALUES
("TI","Presencial", 6),
("Engenharia","EAD",6),
("RH","Presencial",5);

SELECT * FROM tb_categoria;

INSERT INTO tb_curso(nome,carga_horaria,descricao,nome_faculdade,id_categoria)VALUES
("Análise e desenvolvimento de sistmas",270,"Curso de introdução a TI","Faculdade",1),
("Banco de dados",300,"Como gerenciar um Banco de dados","Faculdade de Banco de daod",1),
("Engenharia civil",210,"Curso de introdução a Engenharia","Faculdade de engenharia",2),
("Engenharia eletrica",210,"Curso de introdução a Engenharia eletrica","Faculdade de engenharia",2),
("Recursos Humanos",210,"Curso de introdução a Recursos Humanos","Faculdade de RH",3);

SELECT * FROM tb_curso;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.(mudei)
SELECT * FROM tb_curso WHERE carga_horaria > 200;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.(mudei)
SELECT * FROM tb_curso WHERE carga_horaria BETWEEN 200 AND 300; 

-- Faça um select  utilizando LIKE buscando os Produtos com a letra J.
SELECT * FROM tb_curso WHERE nome LIKE "%E%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
SELECT * FROM tb_curso INNER JOIN tb_categoria
ON tb_categoria.id = tb_curso.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são da categoria Java).
SELECT * FROM tb_curso INNER JOIN tb_categoria
ON tb_categoria.id = tb_curso.id_categoria 
WHERE tb_categoria.id=1;


