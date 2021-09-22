CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;


CREATE TABLE tb_categoria(
id BIGINT auto_increment NOT NULL,
tipo VARCHAR(100) NOT NULL,
classificacao VARCHAR(100) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
id BIGINT auto_increment NOT NULL,
nome VARCHAR(100) NOT NULL,
preco DECIMAL(7,2)NOT NULL,
descricao VARCHAR(100) NOT NULL,
nome_fabricante VARCHAR(100) NOT NULL,
id_categoria BIGINT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo,classificacao)VALUES
("Natural","Resistente"),
("Artificial","Auxiliar"),
("Combinados","Elétrico");

SELECT * FROM tb_categoria;

insert into tb_produto (nome, preco, descricao, nome_fabricante, id_categoria) values
("Argamassa Forte",70.00,"Boa para obras", "Vedacit", 2),
("Cimento",90.00,"Boa para obras pequenas e grandes ", "3M", 2),
("Vigas",70.00,"Boa para obras de predios", "Vedacit", 3),
("Tijolo de barro",100.00,"Boa para obras", "Vedacit", 1),
("Cano de Aluminio",120.00,"Boa para obras", "Amanco", 3);

SELECT * FROM tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produto WHERE preco >50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_produto WHERE nome LIKE "%C%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
SELECT *FROM tb_produto INNER JOIN tb_categoria
ON tb_categoria.id = tb_produto.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica
-- (exemplo todos os produtos que são aves ou legumes).
SELECT *FROM tb_produto INNER JOIN tb_categoria
ON tb_categoria.id = tb_produto.id_categoria
WHERE tb_categoria.id=2;