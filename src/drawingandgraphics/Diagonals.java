package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function

        int x = 0;
        drawLIne(x, graphics);

    }

    // Create a function that draws a single line
    public static void drawLIne(int x, Graphics graphics) {
        int y = 0;
        int otherX = x + 80;
        int otherY = y + 80;
        int min = 0;
        int max = 320;

        for (int i = 0; i < 10; i++) {

            // If the line starts from the upper-left corner it should be green, otherwise it should be red
            if (x == 0 && y == 0) {
                graphics.setColor(Color.GREEN);
            } else {
                graphics.setColor(Color.RED);
            }

            // Use this function to draw the canvas' diagonals
            graphics.drawLine(x, y, otherX, otherY);
            int randomNumber1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            int randomNumber2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            int randomNumber3 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            int randomNumber4 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            x = randomNumber1;
            y = randomNumber2;
            otherX = randomNumber3;
            otherY = randomNumber4;
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