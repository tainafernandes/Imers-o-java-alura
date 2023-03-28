package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class GeradorFigurinha {
    public void create() throws Exception{
        //Ler imagem
        InputStream inputStream = new URL("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies_1.jpg").openStream();
        BufferedImage originalImage = ImageIO.read(inputStream);

        // Criar nova imagem em memória com transparência e com tamanho novo
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        int newHeight = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        //copiar imagem original p/ nova imagem
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(originalImage, 0,0, null);

        //configuração da font
        var font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.CYAN);
        graphics.setFont(font);

        //escrever frase na imagem
        graphics.drawString( "TOPZERA", 700, newHeight - 100);

        //escrever nova imagem em arquivo
        ImageIO.write(newImage, "png", new File("sticker.png"));
    }

    public static void main(String[] args) throws Exception{
        var generator = new GeradorFigurinha();
        generator.create();
    }
}
