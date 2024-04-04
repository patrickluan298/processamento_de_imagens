package app;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipulaImagem.abrirImagem("pikachu.jpg");
        ManipulaImagem.exibirImagem(imagem,
                OperacoesPontuais.bandaRed(imagem),
                OperacoesPontuais.bandaGreen(imagem),
                OperacoesPontuais.bandaBlue(imagem),
                OperacoesPontuais.negativo(imagem),
                OperacoesPontuais.greyScaleRed(imagem),
                OperacoesPontuais.greyScaleGreen(imagem),
                OperacoesPontuais.greyScaleBlue(imagem),
                OperacoesPontuais.greyScaleMedia(imagem),
                OperacoesPontuais.binarizacao(imagem, 100),
                OperacoesPontuais.alteraTonalidade(imagem, "green", -100),
                OperacoesPontuais.brilhoAditivo(imagem, 50),
                OperacoesPontuais.brilhoMultiplicativo(imagem, 0.5f),
                OperacoesPontuais.brilhoAditivoY(imagem, 50),
                OperacoesPontuais.brilhoMultiplicativoY(imagem, 0.5f),
                OperacoesPontuais.negativoY(imagem));
    }
}