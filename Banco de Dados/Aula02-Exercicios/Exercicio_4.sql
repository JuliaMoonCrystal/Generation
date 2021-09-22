CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
qtproduto int not null,
dtvalidade date,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_categoria (descricao, ativo) values
("Frutas citricas",true),
("Frutos Carnosos",true),
("Frutos secos",true);

SELECT * FROM tb_categoria;

insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values
("Melancia",20.00,30, "2021-11-07", 2),
("Goiaba",13.09,10, "2021-12-08", 2),
("Castanha do Pará",15.00,30, "2021-01-07", 3),
("Limão",60.00,10, "2021-03-09", 2),
("Laranja",55.00,100, "2021-06-07", 1);

SELECT * FROM tb_produtos;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produtos WHERE preco >50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais
SELECT * FROM tb_produtos WHERE preco BETWEEN 3 AND 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
SELECT *FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica
-- (exemplo todos os produtos que são aves ou legumes).
SELECT *FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id
WHERE tb_categoria.id=1;


