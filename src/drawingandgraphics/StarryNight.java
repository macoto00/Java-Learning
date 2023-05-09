package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        // set width and height of the background
        int background = WIDTH;

        // set background black and fill it with color
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, background, background);

        // set stars width and height
        int star = 5;

        // loop to draw 50 stars
        for (int i = 0; i < 50; i++) {
            // random color
            int red = (int)Math.floor(Math.random() * (255 + 1));
            int green = (int)Math.floor(Math.random() * (255 + 1));
            int blue = (int)Math.floor(Math.random() * (255 + 1));
            Color color = new Color(red,green,blue);
            graphics.setColor(color);

            // set random positions on the canvas
            int randomPosition1 = (int)Math.floor(Math.random() * (background - 10 + 1) + 10);
            int randomPosition2 = (int)Math.floor(Math.random() * (background - 10 + 1) + 10);

            // draw the stars
            graphics.fillRect(randomPosition1, randomPosition2, star, star);
        }



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}