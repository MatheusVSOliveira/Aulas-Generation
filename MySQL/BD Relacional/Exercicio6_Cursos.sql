CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
	id bigint auto_increment,
    descricao varchar(255) NOT NULL,
	tempo varchar(255) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria(descricao,tempo) VALUES ("Pós-Graduação","2 anos"); -- 1
INSERT INTO tb_categoria(descricao,tempo) VALUES ("Graduação","Até 5 anos");  -- 2
INSERT INTO tb_categoria(descricao,tempo) VALUES ("Tecnólogo","Até 3 anos"); -- 3
INSERT INTO tb_categoria(descricao,tempo) VALUES ("Técnico","Até 2,5 anos"); -- 4
INSERT INTO tb_categoria(descricao,tempo) VALUES ("FIC","até 6 meses"); -- 5

SELECT * FROM tb_categoria;

CREATE TABLE tb_curso (
	id bigint auto_increment,
    nome varchar(100) NOT NULL,
    mensalidade decimal(6,2) NOT NULL,
    formato varchar(50) NOT NULL,
    categoria_id bigint,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id) -- Inclusão do atributo categoria_id como chave estrangeira que referencia a chave primária(id) da tb_categoria
);

INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Bioinformática",1200.00,"PRESENCIAL", 1);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Ciências Biológicas",700.00,"EAD", 2);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Analise e Desenvolvimento de Sistemas",300.00,"PRESENCIAL", 3);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Analise de Sistema",150.00,"SEMIPRESENCIAL", 4);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Culinária",0,"EAD - GRATUITO", 5);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Tecnologia da Informação",400.00,"PRESENCIAL", 3);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Administração",800.00,"PRESENCIAL", 2);
INSERT INTO tb_curso(nome,mensalidade,formato,categoria_id) VALUES ("Analista de vendas",150.00,"SEMIPRESENCIAL", 4);



SELECT * FROM tb_curso;

SELECT * FROM tb_curso WHERE mensalidade > 50;

SELECT * FROM tb_curso WHERE mensalidade BETWEEN 3 AND 60;

SELECT * FROM tb_curso WHERE nome LIKE "%J%";

SELECT tb_curso.nome, tb_curso.mensalidade, tb_curso.formato,tb_categoria.descricao, tb_categoria.tempo
FROM tb_curso INNER JOIN tb_categoria
ON tb_categoria.id = tb_curso.categoria_id;


SELECT tb_curso.nome, tb_categoria.descricao
FROM tb_curso INNER JOIN tb_categoria
ON tb_categoria.id = tb_curso.categoria_id
WHERE tb_categoria.id = 4;
