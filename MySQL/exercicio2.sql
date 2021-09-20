CREATE DATABASE db_ecommerce;

CREATE TABLE tb_produtos (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(255),
  quantidade int,
  marca varchar(255),
  preco decimal(8,2),
  PRIMARY KEY (id)
);

INSERT INTO tb_produtos VALUES (1,'Camisa',10,'Nike',150.00);
INSERT INTO tb_produtos VALUES (2,'Geladeira',1,'Brastemp',2000.00);
INSERT INTO tb_produtos VALUES (3,'Blusa',3,'Adidas',150.00);
INSERT INTO tb_produtos VALUES (4,'Boné',1,'New Era',150.00);
INSERT INTO tb_produtos VALUES (5,'Celular',1,'Samsung',1500.00);
INSERT INTO tb_produtos VALUES (6,'Televisão',1,'Philips',2000.00);
INSERT INTO tb_produtos VALUES (7,'Computador',1,'Positivo',1500.00);
INSERT INTO tb_produtos VALUES (8,'Panela',10,'Tramontina',70.00);

SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos 
SET marca  = 'Dell' 
WHERE id = 7;

SELECT * FROM tb_produtos;
