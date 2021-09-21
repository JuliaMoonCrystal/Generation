CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

-- DROP DATABASE db_generation_game_online;

CREATE TABLE tb_classe(
id BIGINT auto_increment NOT NULL,
tipo VARCHAR(100) NOT NULL,
equip_inicial VARCHAR(100),
caracter VARCHAR(100),
PRIMARY KEY(id)
);


CREATE TABLE tb_personagem(
id BIGINT auto_increment NOT NULL,
nome VARCHAR(100) NOT NULL,
raca VARCHAR(50) NOT NULL,
nivel INT NOT NULL,
pontos_vida INT NOT NULL,
pontos_mana INT NOT NULL,
id_classe BIGINT NOT NULL,
ponto_atq INT NOT NULL,
ponto_def INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(id_classe) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe(tipo,equip_inicial,caracter)VALUES
("Guerreiro","Espada","Combatente corpo a corpo"),
("Paladino","Machado","Combatente corpo a corpo e usuário de magia"),
("Mago","Cajado","Usuários de de poderes naturais"),
("Animago","Cajado","Poderes de transformações animalescas"),
("Invocador","Espada curta e adagas","Combatente suporte");

SELECT *FROM tb_classe;

INSERT INTO tb_personagem(nome,raca,nivel,pontos_vida,pontos_mana,id_classe,ponto_atq,ponto_def)VALUES
("Jorge","Elfo",1,250,300,1,2500,3000),
("Luca","Duende",2,250,300,5,1500,2000),
("Luis","Metamorfo",10,200,400,3,2000,4000),
("Yohan","Humano",20,200,300,4,3000,3000),
("Josuke","Anão",15,350,300,2,6000,5000),
("Caique","Elfo",1,250,300,3,2000,4000),
("Jonathan","Draconato",30,500,700,1,6000,7000),
("Jolyne","Humano",50,1050,200,1,10000,11000);

SELECT * FROM tb_personagem;

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT * FROM tb_personagem WHERE ponto_atq >2000;

-- Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000.
INSERT INTO tb_personagem(nome,raca,nivel,pontos_vida,pontos_mana,id_classe,ponto_atq,ponto_def)VALUES
("Alucard","Vampiro",10,250,300,5,2500,1500);
SELECT * FROM tb_personagem WHERE ponto_def BETWEEN 1000 AND  2000;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagem WHERE nome LIKE "C%"; -- C% começo  %Cfinal %C% TUDO

-- Faça um um select com Inner join entre  tabela classe e personagem.
SELECT tb_personagem.nome, tb_personagem.nivel,tb_classe.equip_inicial 
FROM tb_personagem INNER JOIN tb_classe 
ON tb_classe.id = tb_personagem.id_classe;

-- Faça um select onde traga todos os personagem de uma classe específica
-- (exemplo todos os personagens que são arqueiros).

SELECT tb_personagem.nome,tb_personagem.raca,tb_classe.tipo
FROM tb_personagem INNER JOIN tb_classe 
ON tb_classe.id= tb_personagem.id_classe
WHERE tb_classe.tipo = "Guerreiro";
