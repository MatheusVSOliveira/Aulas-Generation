CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
PRIMARY KEY (id)
);

INSERT INTO tb_categoria (descricao, ativo) VALUES ("Bovino",true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("Suino",true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("Aves",true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("pertence feijoada",true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("imbutidos",true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("soja",true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("outros",true);

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
qtproduto int not null,
dtvalidade date,
categoria_id bigint,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Asinha",30.00,30, "2021-11-07", 3);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Picanha",50.00,30, "2021-11-08", 1);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Bacon",30.00,30, "2021-11-09", 1);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("hamburguer",20.00,30, "2021-09-07", 5);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Peito de frango",25.00,30, "2021-11-09", 3);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Orelha de porco",20.00,30, "2021-11-07", 4);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("mocoto",20.00,30, "2021-10-05", 2);
INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("chuleta",20.00,30, "2021-10-07", 1);


SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE preco > 50;

SELECT * FROM tb_produtos WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT  tb_produtos.nome,tb_produtos.preco,tb_produtos.qtProduto, tb_categoria.descricao 
FROM tb_produtos INNER JOIN tb_categoria 
ON tb_categoria.id = tb_produtos.categoria_id; 

SELECT  tb_produtos.nome,tb_produtos.preco,tb_produtos.qtProduto, tb_categoria.descricao 
FROM tb_produtos INNER JOIN tb_categoria 
ON tb_categoria.id = tb_produtos.categoria_id
WHERE tb_produtos.categoria_id = 1;

