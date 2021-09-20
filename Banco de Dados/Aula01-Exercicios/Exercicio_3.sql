CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_estudantes(
id BIGINT auto_increment NOT NULL,
nome VARCHAR(100) NOT NULL,
ra VARCHAR(100) NOT NULL,
sala VARCHAR(10) NOT NULL,
serie VARCHAR(10) NOT NULL,
nota DECIMAL(7,2) NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO tb_estudantes(nome,ra,sala,serie,nota) VALUES
("Juliano","109228929812","102B","1-B",7.6),
("Julia","111111111111","103B","1-A",10),
("Fulano","907613907632","132A","1-A",3.8),
("Thiago","107500941285","122C","1-B",9.9),
("Josiane","185290654982","102A","1-C",7.9),
("Allex","676767676767","100B","1-B",6.9),
("Bruno","098765432145","121C","1-A",1.2),
("Raj","123456789098","102B","1-C",10);

SELECT * FROM tb_estudantes;

-- nota maior que 7
SELECT nome,ra,sala,serie,nota FROM tb_estudantes WHERE nota > 7;

-- nota menor que 7
SELECT nome,ra,sala,serie,nota FROM tb_estudantes WHERE nota < 7;

-- atualizando uma sala
UPDATE tb_estudantes SET sala ="102B" WHERE id =2;
SELECT * FROM tb_estudantes;



