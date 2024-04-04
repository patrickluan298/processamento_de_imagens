# Documentação dos Filtros de Processamento de Imagens

Este repositório contém uma série de filtros de processamento de imagens implementados em Java, utilizando a biblioteca `java.awt` para manipulação de imagens.

## Funcionalidades Implementadas

### 1. `bandaRed`

Este filtro mantém apenas a banda vermelha da imagem, zerando as informações das bandas verde e azul.

### 2. `bandaGreen`

Este filtro mantém apenas a banda verde da imagem, zerando as informações das bandas vermelha e azul.

### 3. `bandaBlue`

Este filtro mantém apenas a banda azul da imagem, zerando as informações das bandas vermelha e verde.

### 4. `negativo`

Este filtro gera o negativo da imagem, invertendo os valores de todas as bandas de cor (vermelha, verde e azul).

### 5. `greyScaleRed`

Este filtro converte a imagem para escala de cinza, considerando apenas a banda vermelha.

### 6. `greyScaleGreen`

Este filtro converte a imagem para escala de cinza, considerando apenas a banda verde.

### 7. `greyScaleBlue`

Este filtro converte a imagem para escala de cinza, considerando apenas a banda azul.

### 8. `greyScaleMedia`

Este filtro converte a imagem para escala de cinza, calculando a média das bandas vermelha, verde e azul.

### 9. `binarizacao`

Este filtro converte a imagem para uma imagem binária (preto e branco), utilizando um limiar especificado.

### 10. `alteraTonalidade`

Este filtro altera a tonalidade da imagem em uma determinada banda (vermelha, verde ou azul), adicionando um valor especificado.

### 11. `brilhoAditivo`

Este filtro aumenta o brilho da imagem adicionando um valor especificado em todas as bandas (vermelha, verde e azul).

### 12. `brilhoMultiplicativo`

Este filtro aumenta o brilho da imagem multiplicando os valores das bandas (vermelha, verde e azul) por um fator especificado.

### 13. `brilhoAditivoY`

Este filtro aumenta o brilho da imagem na escala YIQ adicionando um valor especificado na componente Y (luminância).

### 14. `brilhoMultiplicativoY`

Este filtro aumenta o brilho da imagem na escala YIQ multiplicando o valor da componente Y (luminância) por um fator especificado.

### 15. `negativoY`

Este filtro gera o negativo da imagem na escala YIQ, invertendo o valor da componente Y (luminância).

## Como Utilizar

Cada filtro é um método estático da classe `OperacoesPontuais` e pode ser utilizado da seguinte forma:

1. Importe a classe `OperacoesPontuais` no seu código Java.
2. Carregue uma imagem em um objeto `BufferedImage`.
3. Chame o método do filtro desejado, passando a imagem como parâmetro.
4. Receba a nova imagem como resultado do método.