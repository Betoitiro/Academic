WITH usuario AS (
  -- Seleciona informa��es do usu�rio
  SELECT
    usuarios.cod_usuario AS "C�digo do Usu�rio",
    data_cadastro AS "Data de Cadastro",
    faixa_etaria AS "Faixa Et�ria",
    cidade AS "Cidade",
    estado AS "Estado"
  FROM usuarios
),
produtos AS (
  -- Seleciona informa��es do produto
  SELECT
    cod_produto AS "C�digo do Produto",
    nome_produto AS "Nome do Produto",
    categoria_produto AS "Categoria do Produto",
    valor_produto AS "Valor do Produto"
  FROM produtos p
),
vendas AS (
  -- Seleciona informa��es da venda
  SELECT
    data_compra AS Data_da_Compra,
    cod_usuario AS Codigo_do_Usuario,
    cod_produto AS "C�digo do Produto",
    forma_pagamento AS "Forma de Pagamento",
    quantidade AS "Quantidade",
    valor_compra AS "Valor da Compra"
  FROM vendas v
)
-- Une as tabelas e retorna todas as colunas
SELECT *
FROM usuario 
INNER JOIN vendas ON usuario."C�digo do Usu�rio" = vendas.Codigo_do_Usuario
INNER JOIN produtos ON vendas."C�digo do Produto" = produtos."C�digo do Produto";