CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
id BIGINT auto_increment NOT NULL,
tamanho VARCHAR(20) NOT NULL,
descricao VARCHAR(100) NOT NULL,
ativo BOOLEAN NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE tb_pizza(
id BIGINT auto_increment NOT NULL,
nome VARCHAR(100) NOT NULL,
preco DECIMAL(7,2) NOT NULL,
id_categoria BIGINT NOT NULL,
sabor VARCHAR(100) NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id)
);


INSERT INTO tb_categoria(tamanho,descricao,ativo)VALUES
("Broto","Pizza pequenina ",true),
("Médio","Pizza média muito saborosa ",false),
("Grande","Pizza muito grande ",false),
("Extra-Grande","Pizza muito grande ",true),
("Médio","Pizza média muito saborosa ",true);

SELECT *FROM tb_categoria;

INSERT INTO tb_pizza(nome,preco,id_categoria,sabor) VALUES
("PIZZA HAVAIANA",20.80,2,"Calabreza"),
("PIZZA Tradicional",45.80,1,"Portuguese"),
("PIZZA Exception",40.90,3,"Calabreza"),
("PIZZA Especial",80.00,1,"Muçarela");

SELECT *FROM tb_pizza;

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
SELECT *FROM tb_pizza WHERE preco > 45;

-- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
SELECT *FROM tb_pizza WHERE preco BETWEEN 29 AND 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT *FROM tb_pizza WHERE nome LIKE "%E%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
SELECT * FROM tb_pizza INNER JOIN tb_categoria
ON tb_categoria.id = tb_pizza.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são pizza doce).

SELECT * FROM tb_pizza INNER JOIN tb_categoria
ON tb_categoria.id = tb_pizza.id_categoria
WHERE tb_categoria.id = 2;

