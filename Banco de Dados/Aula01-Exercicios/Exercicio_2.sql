CREATE DATABASE db_ecommerce;-- Criando o bd
USE db_ecommerce;

CREATE TABLE tb_Produto(
id BIGINT auto_increment NOT NULL,
nome VARCHAR(100) NOT NULL,
valor_unidade DECIMAL(7,2) NOT NULL,
tipo_Produto VARCHAR(100) NOT NULL,
estoque INT NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO tb_Produto(nome,valor_unidade,tipo_Produto,estoque) VALUES
("Pen-drive",50.50,"artigo eletrônico",12000),
("Creme Facial",40,"Produto de beleza",8000),
("TV",5500.50,"Eletrônicos",6000),
("NoteBook DELL",1050.50,"artigo eletrônico",2000),
("Mouse ",29.90,"artigo eletrônico",900),
("Jogo Uno",14.99,"Jogos",12000),
("Horizon Forbidden West",329.90,"Games e Consoles",2000),
("Coleira Seresto",60,"Pet Shop",6000);

SELECT * FROM tb_Produto;

-- valores maiores que 500
SELECT nome,valor_unidade AS preço ,tipo_Produto AS tipo,estoque FROM tb_Produto WHERE valor_unidade > 500;

-- valores menores que 500
SELECT nome,valor_unidade AS preço ,tipo_Produto AS tipo,estoque FROM tb_Produto WHERE valor_unidade < 500;

-- Atualizando um item
UPDATE tb_Produto SET valor_unidade= 400.70 WHERE id =7;
SELECT *FROM tb_Produto

