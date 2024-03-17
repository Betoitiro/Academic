SELECT u.cod_usuario, v.cod_produto
FROM usuarios u
JOIN vendas v ON u.cod_usuario = v.cod_produto;

select usuarios.cod_usuario , usuarios.faixa_etaria 
from  usuarios
where usuarios.faixa_etaria = 'Entre 51 a 60 anos'
;