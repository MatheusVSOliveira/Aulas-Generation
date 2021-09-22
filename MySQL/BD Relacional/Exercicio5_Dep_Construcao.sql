CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria (
	id bigint auto_increment,
    descricao varchar(255) NOT NULL,
	ativo boolean NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria(descricao,ativo) VALUES ("Madeiras",true); -- 1
INSERT INTO tb_categoria(descricao,ativo) VALUES ("Tintas",true);  -- 2
INSERT INTO tb_categoria(descricao,ativo) VALUES ("Ferramentas",false); -- 3
INSERT INTO tb_categoria(descricao,ativo) VALUES ("Areia, Pedra Brita, Gesso, Cal e Argila",false); -- 4
INSERT INTO tb_categoria(descricao,ativo) VALUES ("Aços para Construção",false); -- 5

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos (
	id bigint auto_increment,
    nome varchar(100) NOT NULL,
    valor decimal(6,2) NOT NULL,
    quantidade bigint NOT NULL,
    desc_produto varchar(255) NOT NULL,
    categoria_id bigint,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id) -- Inclusão do atributo categoria_id como chave estrangeira que referencia a chave primária(id) da tb_categoria
);

INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Quadrado de Madeira",12.90,100,"Pinus 3x3x100cm Massol", 1);
INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Tinta Acrílica Fosco ",284.90,50,"Rende Muito Branco 20L Coral", 2);
INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Ferro de Solda",26.90,50,"30W 220V Western", 3);
INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Areia Fina Saco 20kg",3.90,60,"Lavada - Grupo Tomino", 4);
INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Arame Aço Galvanizado Multiuso",15.29,100,"Bitola 20 39m Bemfixa", 5);
INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Sapata de Aço",20.00,50,"CA-50 6 Ferros 3/8 40x40x30cm Columaster", 5);
INSERT INTO tb_produtos(nome,valor,quantidade,desc_produto,categoria_id) VALUES ("Viga Bruta Saligna",60.90,100,"5x15,2cmx3m Madvei", 1);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE valor > 50;

SELECT * FROM tb_produtos WHERE valor BETWEEN 3 AND 60;

SELECT * FROM tb_produtos WHERE nome LIKE "%B%";

SELECT tb_produtos.nome, tb_produtos.valor, tb_produtos.validade, tb_produtos.quantidade, tb_produtos.desc_produto, tb_categoria.descricao, tb_categoria.necessidade_receita
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id;


SELECT tb_produtos.nome, tb_categoria.descricao
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id
WHERE tb_categoria.id = 1;
