package app;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class OperacoesLocais {
    public static BufferedImage mediaVizinhanca(BufferedImage imgEntrada, int tamanhoVizinhanca) {

        int qtdElementosVizinhanca = tamanhoVizinhanca * tamanhoVizinhanca;
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                if (pixelDeBorda(h, w, altura, largura, tamanhoVizinhanca)) {
                    int rgb = imgEntrada.getRGB(w, h);
                    imgSaida.setRGB(w, h, rgb);
                    continue;
                }

                int[] vizinhanca = obterVizinhanca(imgEntrada, w, h, tamanhoVizinhanca);

                int media = Arrays.stream(vizinhanca).sum() / qtdElementosVizinhanca;
                media = Math.min(255, Math.max(0, media));

                Color novaCor = new Color(media, media, media);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage medianaVizinhanca(BufferedImage imgEntrada, int tamanhoVizinhanca) {

        int qtdElementosVizinhanca = tamanhoVizinhanca * tamanhoVizinhanca;
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                if (pixelDeBorda(h, w, altura, largura, tamanhoVizinhanca)) {
                    int rgb = imgEntrada.getRGB(w, h);
                    imgSaida.setRGB(w, h, rgb);
                    continue;
                }

                int[] vizinhanca = obterVizinhanca(imgEntrada, w, h, tamanhoVizinhanca);

                Arrays.sort(vizinhanca);
                int mediana = vizinhanca[qtdElementosVizinhanca / 2];

                Color novaCor = new Color(mediana, mediana, mediana);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage convolucao(BufferedImage imgEntrada, int[] kernel, int tamanhoVizinhanca) {

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                if (pixelDeBorda(h, w, altura, largura, tamanhoVizinhanca)) {
                    int rgb = imgEntrada.getRGB(w, h);
                    imgSaida.setRGB(w, h, rgb);
                    continue;
                }

                int[] vizinhanca = obterVizinhanca(imgEntrada, w, h, tamanhoVizinhanca);

                double resultado = 0.0;
                for (int i = 0; i < 9; i++) {
                    resultado += vizinhanca[i] * kernel[i];
                }

                resultado = Math.min(255, Math.max(0, resultado));
                int resultadoInt = (int) resultado;

                Color novaCor = new Color(resultadoInt, resultadoInt, resultadoInt);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage convolucao(BufferedImage imgEntrada, double[] kernel, int tamanhoVizinhanca) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                if (pixelDeBorda(h, w, altura, largura, tamanhoVizinhanca)) {
                    int rgb = imgEntrada.getRGB(w, h);
                    imgSaida.setRGB(w, h, rgb);
                    continue;
                }

                int[] vizinhanca = obterVizinhanca(imgEntrada, w, h, tamanhoVizinhanca);

                double resultado = 0.0;
                for (int i = 0; i < 9; i++) {
                    resultado += vizinhanca[i] * kernel[i];
                }

                resultado = Math.min(255, Math.max(0, resultado));
                int resultadoInt = (int) resultado;

                Color novaCor = new Color(resultadoInt, resultadoInt, resultadoInt);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    private static int[] obterVizinhanca(BufferedImage imgEntrada, int w, int h, int tamanhoVizinhanca) {

        int[] vizinhanca = new int[tamanhoVizinhanca * tamanhoVizinhanca];
        int aux = tamanhoVizinhanca / 2;
        int count = 0;

        for (int i = -aux; i <= aux; i++) {
            for (int j = -aux; j <= aux; j++) {
                int rgb = imgEntrada.getRGB(w + j, h + i);
                Color corVizinho = new Color(rgb);
                vizinhanca[count++] = corVizinho.getRed();
            }
        }
        return vizinhanca;
    }

    private static boolean pixelDeBorda(int h, int w, int altura, int largura, int tamanhoVizinhanca) {
        int metade = tamanhoVizinhanca / 2;
        return (h <= metade - 1) || (w <= metade - 1) || (h >= altura - metade) || (w >= largura - metade);
    }

}
