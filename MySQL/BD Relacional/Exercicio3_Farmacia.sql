CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
	id bigint auto_increment,
    descricao varchar(255) NOT NULL,
    necessidade_receita boolean NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria(descricao,necessidade_receita) VALUES ("Tarja Vermelha",true); -- 1
INSERT INTO tb_categoria(descricao,necessidade_receita) VALUES ("Antibióticos",true);  -- 2
INSERT INTO tb_categoria(descricao,necessidade_receita) VALUES ("Analgésicos",false); -- 3
INSERT INTO tb_categoria(descricao,necessidade_receita) VALUES ("Anti-inflamatórios",false); -- 4
INSERT INTO tb_categoria(descricao,necessidade_receita) VALUES ("Antialérgicos",false); -- 5

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos (
	id bigint auto_increment,
    nome varchar(100) NOT NULL,
    valor decimal(6,2) NOT NULL,
    validade date NOT NULL,
    quantidade bigint NOT NULL,
    desc_produto varchar(255) NOT NULL,
    categoria_id bigint,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id) -- Inclusão do atributo categoria_id como chave estrangeira que referencia a chave primária(id) da tb_categoria
);

INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Amome",52.99,"2022-05-17",15,"50 mg, 60doses", 1);
INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Amoxicilina",60.00,"2022-03-11",50,"500 mg, 10cap", 2);
INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Dorflex",10.00,"2023-02-11",50,"300mg, 36comprimidos", 3);
INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Nimesulida",26.90,"2022-03-11",50,"60mg, 12comprimidos", 4);
INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Loratadina",3.99,"2023-03-11",50,"10 mg, 12comprimidos", 5);
INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Ibuprofeno",20.00,"2022-07-11",50,"400 mg, 10cap", 4);
INSERT INTO tb_produtos(nome,valor,validade,quantidade,desc_produto,categoria_id) VALUES ("Cefalexicina",30.99,"2022-03-11",50,"500 mg, 10comprimidos", 2);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE valor > 50;

SELECT * FROM tb_produtos WHERE valor BETWEEN 3 AND 60;

SELECT * FROM tb_produtos WHERE nome LIKE "%B%";

SELECT tb_produtos.nome, tb_produtos.valor, tb_produtos.validade, tb_produtos.quantidade, tb_produtos.desc_produto, tb_categoria.descricao, tb_categoria.necessidade_receita
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id;


SELECT tb_produtos.nome, tb_categoria.descricao, tb_categoria.necessidade_receita
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id
WHERE tb_categoria.id = 2;
