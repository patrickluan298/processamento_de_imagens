package app;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipulaImagem.abrirImagem("./imagens/pikachu.jpg");

        double[] kernelGaussiano = { 0.0625, 0.125, 0.0625, 0.125, 0.25, 0.125, 0.0625, 0.125, 0.0625 };
        int[] horizontal = { -1, -2, -1, 0, 0, 0, 1, 2, 1 };
        int[] vertical = { -1, 0, 1, -2, 0, 2, -1, 0, 1 };
        int[] linhaOeste = { 1, 1, -1, 1, -2, -1, 1, 1, -1 };
        int[] laplaciano = { 0, -1, 0, -1, 4, -1, 0, -1, 0 };

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
                OperacoesPontuais.negativoY(imagem),

                OperacoesLocais.mediaVizinhanca(imagem, 7),
                OperacoesLocais.medianaVizinhanca(imagem, 7),
                OperacoesLocais.convolucao(imagem, kernelGaussiano, 7),
                OperacoesLocais.convolucao(imagem, horizontal, 7),
                OperacoesLocais.convolucao(imagem, vertical, 7),
                OperacoesLocais.convolucao(imagem, linhaOeste, 7),
                OperacoesLocais.convolucao(imagem, laplaciano, 7)
        );
    }
}