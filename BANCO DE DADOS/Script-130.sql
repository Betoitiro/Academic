WITH usuario_compra AS (
  SELECT
    usuarios.cod_usuario,
    usuarios.faixa_etaria,
    usuarios.estado    
  FROM usuarios
),
produtos as (
  select 
    p.cod_produto,
    p.nome_produto
  from produtos p 
), 
vendas as (
  select
  	v.cod_usuario,
  	v.cod_produto,
    v.quantidade,
    v.valor_compra
    from vendas v
)
select uc.cod_usuario as "hyfhjfh",
	  produtos.nome_produto,
	  vendas.quantidade
from usuario_compra uc
INNER JOIN vendas ON uc.cod_usuario = vendas.cod_usuario
INNER JOIN produtos ON vendas.cod_produto = produtos.cod_produto







