CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes (
	ra bigint,
    nome varchar(255) not null,
    aprovado boolean,
    materia varchar(255) not null,
    nota decimal (3,1),
    PRIMARY KEY (ra)
);

INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (23451,"Maria Paula", true, 'Sociologia',10.0);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (12345,"Jorge Mello", true, 'Filosofia',9.5);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (22345,"João Claudio", false, 'Ingles',6.5);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (32345,"José Ferreira", false, 'Ciências',5.5);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (42345,"Bruno Oliveira", true, 'Matemática',7.5);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (52345,"Luciana Santos", true, 'Geografia',7.5);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (62345,"Leonardo Silva", true,'História',8.5);
INSERT INTO tb_estudantes (ra,nome,aprovado,materia,nota) VALUES (72345,"Barbara Fernandes", false, 'Português',6.5);


SELECT * FROM tb_estudantes WHERE nota < 7;
SELECT * FROM tb_estudantes WHERE nota > 7;

UPDATE tb_estudantes
SET nota = 8
WHERE ra = 42345;

SELECT * FROM tb_estudantes;





