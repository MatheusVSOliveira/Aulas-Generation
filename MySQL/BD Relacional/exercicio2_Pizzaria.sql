CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id bigint AUTO_INCREMENT,
    descricao varchar(255),
    doce boolean,
    salgada boolean,
    primary key (id)
);
INSERT INTO tb_categoria (descricao, doce,salgada) VALUES ("Queijo mussarela", false,true);
INSERT INTO tb_categoria (descricao, doce,salgada) VALUES ("Calabresa, cebola e queijo ",false,true);
INSERT INTO tb_categoria (descricao, doce,salgada) VALUES ("Mussarela, bacon e borda recheada",false,true);
INSERT INTO tb_categoria (descricao, doce,salgada) VALUES ("Mussarela,Presunto,Cebola, Catupiry",false,true);
INSERT INTO tb_categoria (descricao, doce,salgada) VALUES ("Pedaços de Chocolate e granulado",true,false);

SELECT * FROM tb_categoria;

CREATE TABLE tb_pizza (
id bigint AUTO_INCREMENT,
sabor varchar (255) NOT NULL,
preco decimal(6,2) NOT NULL,
quantidade int NOT NULL,
bordarecheada boolean NOT NULL,
categoria_id bigint,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Mussarela","30.00", 3, true, 1);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Calabresa","28.00", 1, true, 2);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Bacon","35.00", 2, false, 3);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Especial","40.00", 1, true, 4);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Brigadeiro","40.00", 2, false, 5);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Mussarela","30.00", 1, false, 1);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Calabresa","28.00", 5, false, 2);
INSERT INTO tb_pizza (sabor, preco, quantidade,bordarecheada,categoria_id ) VALUES ("Bacon","35.00", 1, true, 3);

SELECT * FROM tb_pizza;

SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";

SELECT * FROM tb_pizza WHERE preco > 45;

SELECT * FROM tb_pizza WHERE preco BETWEEN 29 and 60;

SELECT tb_pizza.sabor, tb_pizza.preco, tb_pizza.bordarecheada, tb_categoria.descricao, tb_categoria.salgada,tb_categoria.doce
FROM tb_pizza INNER JOIN tb_categoria
ON tb_categoria.id = tb_pizza.categoria_id;

SELECT tb_pizza.sabor, tb_categoria.descricao
FROM tb_pizza  INNER JOIN tb_categoria
ON tb_categoria.id = tb_pizza.categoria_id WHERE tb_categoria.id =1;
