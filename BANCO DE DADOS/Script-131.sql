WITH usuario AS (
  -- Seleciona informações do usuário
  SELECT
    usuarios.cod_usuario AS "Código do Usuário",
    data_cadastro AS "Data de Cadastro",
    faixa_etaria AS "Faixa Etária",
    cidade AS "Cidade",
    estado AS "Estado"
  FROM usuarios
),
produtos AS (
  -- Seleciona informações do produto
  SELECT
    cod_produto AS "Código do Produto",
    nome_produto AS "Nome do Produto",
    categoria_produto AS "Categoria do Produto",
    valor_produto AS "Valor do Produto"
  FROM produtos p
),
vendas AS (
  -- Seleciona informações da venda
  SELECT
    data_compra AS Data_da_Compra,
    cod_usuario AS Codigo_do_Usuario,
    cod_produto AS "Código do Produto",
    forma_pagamento AS "Forma de Pagamento",
    quantidade AS "Quantidade",
    valor_compra AS "Valor da Compra"
  FROM vendas v
)
-- Une as tabelas e retorna todas as colunas
SELECT *
FROM usuario 
INNER JOIN vendas ON usuario."Código do Usuário" = vendas.Codigo_do_Usuario
INNER JOIN produtos ON vendas."Código do Produto" = produtos."Código do Produto";