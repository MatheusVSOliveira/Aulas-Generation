CREATE DATABASE sistemarh;

USE sistemarh;

CREATE TABLE tb_funcionarios (
  nome varchar(30) NOT NULL,
  cpf bigint NOT NULL,
  formacao varchar(30),
  cargo varchar(30),
  salario decimal(6,2),
  PRIMARY KEY (cpf)
  );

INSERT INTO tb_funcionarios VALUES ('Mariana Oliveira',40050040011,'Publicidade','Analista Marketing',5800.00);
INSERT INTO tb_funcionarios VALUES('Maria da Silva',41150040011,'Administração','Analista de Vendas',2800.00);
INSERT INTO tb_funcionarios VALUES('Bruno Silva',43250040011,'Ensino Médio Completo','Operador(a) de Caixa',1850.00);
INSERT INTO tb_funcionarios VALUES('Luiza Leal',43350040011,'Ensino Médio Completo','Operador(a) de Loja',1855.00);
INSERT INTO tb_funcionarios VALUES('Matheus Oliveira',45050040011,'Publicidade','Desenvolvedor Java Jr',3000.00);

SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios 
SET formacao = 'Ciências Biológicas' 
WHERE cpf = 45050040011;

SELECT * FROM tb_funcionarios;
