CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
id BIGINT auto_increment NOT NULL,
tipo VARCHAR(100) NOT NULL,
tipo_uso VARCHAR(100) NOT NULL,
tarja VARCHAR(50) NOT NULL,
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

INSERT INTO tb_categoria(tipo,tipo_uso,tarja)VALUES
("Antibiótico","Oral","Vermelha - com receita"),
("Analgésicos","Oral","Preta"),
("Anti-inflamatórios","Oral","Amarela");


SELECT * FROM tb_categoria;

INSERT INTO tb_produto(nome,preco,descricao,nome_fabricante,id_categoria)VALUES
("TK ANT",33.00,"Remédio para infecções","Hypermarcas",1),
("Tira a dor",20.00,"Remédio para dores","Generico",2),
("Hidrado",93.00,"Remédio para inflamações","Novartis",3),
("ANT-INFLA",100.00,"Remédio para inflamações","Eurofarma",3),
("Adivil",7.00,"Remédio para dores","Hypermarcas",2),
("Dorflex",9.50,"Remédio para dores","Takeda.",2),
("TK ANT",30.00,"Remédio para infecções","Hypermarcas",1);

SELECT * FROM tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produto WHERE preco > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60 ; 

-- Faça um select  utilizando LIKE buscando os Produtos com a letra B.// mudei para a letra D
SELECT * FROM tb_produto WHERE nome LIKE "%D%";

-- Faça um um select com Inner join entre  tabela categoria e produto
SELECT tb_produto.nome,tb_categoria.tarja FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica
-- (exemplo todos os produtos que são cosméticos).
SELECT tb_produto.nome,tb_categoria.tarja FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.id_categoria
WHERE tb_categoria.id =1;



