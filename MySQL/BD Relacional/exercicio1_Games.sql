CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe (
	id bigint AUTO_INCREMENT,
    vocacao varchar(255) NOT NULL,
    habilidade varchar(255) NOT NULL,
    primary key (id)
);
INSERT INTO tb_classe (vocacao, habilidade) VALUES ("Mago","Magia Negra");
INSERT INTO  tb_classe (vocacao, habilidade) VALUES ("Arqueiro","Arco e flecha");
INSERT INTO tb_classe (vocacao, habilidade) VALUES ("Guerreiro","Espada e Escudo");
INSERT INTO tb_classe (vocacao, habilidade) VALUES("Druida","Magia Branca");
INSERT INTO tb_classe (vocacao, habilidade) VALUES ("Barbaro","Machados");

SELECT * FROM tb_classe;

CREATE TABLE tb_personagens (
id bigint auto_increment,
nome varchar (255) not null,
ataque int not null,
defesa int not null,
nivel int not null,
classe_id bigint,
PRIMARY KEY (id),
FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Mage Brabo","2500","500",20,1);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Druida Bolado","1500","600",11,4);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Flecha Dourada","2000","1000",30,2);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Cavaleiro Bruto","1800","1800",45,3);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Barbarão","2500","1000",30,5);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Mage Full","2500","500",15,1);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Curandeiro","1500","600",23,4);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classe_id ) VALUES ("Robin Hood","2000","1000",50,2);

SELECT * FROM tb_personagens;

SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "%C%";

SELECT * FROM tb_personagens INNER JOIN tb_classe
ON tb_classe.id = tb_personagens.classe_id; 

SELECT tb_personagens.nome, tb_classe.vocacao
FROM tb_personagens  INNER JOIN tb_classe
ON tb_classe.id = tb_personagens.classe_id 
WHERE tb_classe.id =1;
