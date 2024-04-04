package app;

import java.awt.*;
import java.awt.image.BufferedImage;

public class OperacoesPontuais {

    public static BufferedImage deepCopy(BufferedImage original) {
        BufferedImage copy = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        for (int y = 0; y < original.getHeight(); y++) {
            for (int x = 0; x < original.getWidth(); x++) {
                copy.setRGB(x, y, original.getRGB(x, y));
            }
        }
        return copy;
    }

    public static BufferedImage bandaRed(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                Color novaCor = new Color(red, 0, 0);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaGreen(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int green = cor.getGreen();
                Color novaCor = new Color(0, green, 0);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaBlue(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int blue = cor.getBlue();
                Color novaCor = new Color(0, 0, blue);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage negativo(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(255 - red, 255 - green, 255 - blue);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage greyScaleRed(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                Color novaCor = new Color(red, red, red);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage greyScaleGreen(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int green = cor.getGreen();
                Color novaCor = new Color(green, green, green);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage greyScaleBlue(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int blue = cor.getBlue();
                Color novaCor = new Color(blue, blue, blue);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage greyScaleMedia(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (red + green + blue) / 3;
                Color novaCor = new Color(media, media, media);

                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage binarizacao(BufferedImage imgEntrada, int limiar) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (red + green + blue) / 3;
                int novoValor = media > limiar ? 255 : 0; // condicao ? (true : false)

                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage alteraTonalidade(BufferedImage imgEntrada, String banda, int valor) {

        // calistenia --> early return
        if (!banda.equalsIgnoreCase("red") && !banda.equalsIgnoreCase("green") && !banda.equalsIgnoreCase("blue")) {
            throw new IllegalArgumentException("Banda inválida");
        }

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);

                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                if (banda.equalsIgnoreCase("red"))
                    red = validaLimiteCor(red + valor);
                else if (banda.equalsIgnoreCase("green"))
                    green = validaLimiteCor(green + valor);
                else
                    blue = validaLimiteCor(blue + valor);

                Color novaCor = new Color(red, green, blue); // Inteligência do filtro
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoAditivo(BufferedImage imgEntrada, int valor) {

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);

                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                red = validaLimiteCor(red + valor);
                green = validaLimiteCor(green + valor);
                blue = validaLimiteCor(blue + valor);

                Color novaCor = new Color(red, green, blue); // Inteligência do filtro
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoMultiplicativo(BufferedImage imgEntrada, double valor) {

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);

                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                red = validaLimiteCor(red * valor);
                green = validaLimiteCor(green * valor);
                blue = validaLimiteCor(blue * valor);

                Color novaCor = new Color(red, green, blue); // Inteligência do filtro
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoAditivoY(BufferedImage imgEntrada, int valor) {

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);

                double[] yiq = convertRGBtoYIQ(rgb);
                yiq[0] += valor;

                int novaCor = convertYIQtoRGB(yiq, false);

                imgSaida.setRGB(w, h, novaCor);
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoMultiplicativoY(BufferedImage imgEntrada, double valor) {

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);

                double[] yiq = convertRGBtoYIQ(rgb);
                yiq[0] *= valor;

                int novaCor = convertYIQtoRGB(yiq, false);

                imgSaida.setRGB(w, h, novaCor);
            }
        }
        return imgSaida;
    }

    public static BufferedImage negativoY(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);

                double[] yiq = convertRGBtoYIQ(rgb);
                yiq[0] = 255 - yiq[0];

                int novaCor = convertYIQtoRGB(yiq, true);

                imgSaida.setRGB(w, h, novaCor);
            }
        }
        return imgSaida;
    }

    private static double[] convertRGBtoYIQ(int rgb) {
        Color cor = new Color(rgb);
        int red = cor.getRed();
        int green = cor.getGreen();
        int blue = cor.getBlue();

        double Y = 0.299 * red + 0.587 * green + 0.114 * blue;
        double I = 0.596 * red - 0.274 * green - 0.322 * blue;
        double Q = 0.211 * red - 0.523 * green + 0.312 * blue;

        return new double[] { Y, I, Q };
    }

    private static int convertYIQtoRGB(double[] yiq, boolean filtroNegativo) {
        double Y = yiq[0];
        double I = yiq[1];
        double Q = yiq[2];

        int red = (int) (Y + 0.956 * I + 0.621 * Q);
        int green = (int) (Y - 0.272 * I - 0.647 * Q);
        int blue = (int) (Y - 1.106 * I + 1.703 * Q);

        red = validaLimiteCor(red);
        green = validaLimiteCor(green);
        blue = validaLimiteCor(blue);

        if (filtroNegativo) {
            return new Color(255 - red, 255 - green, 255 - blue).getRGB();
        } else {
            return new Color(red, green, blue).getRGB();
        }
    }

    private static int validaLimiteCor(int banda) {
        if (banda > 255)
            banda = 255;
        else if (banda < 0)
            banda = 0;
        return banda;
    }

    private static int validaLimiteCor(double banda) {
        if (banda > 255)
            banda = 255;
        else if (banda < 0)
            banda = 0;
        return (int) banda;
    }
}