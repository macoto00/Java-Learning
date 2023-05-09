package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        // square size
        int size = 45;

        for (int i = 0; i < 7; i++) {
            // different colors every loop
            if (i == 0) {
                graphics.setColor(Color.RED);
            } else if (i == 1) {
                graphics.setColor(Color.ORANGE);
            } else if (i == 2) {
                graphics.setColor(Color.yellow);
            } else if (i == 3) {
                graphics.setColor(Color.green);
            } else if (i == 4) {
                graphics.setColor(Color.blue);
            } else if (i == 5) {
                graphics.setColor(new Color(75,0,130,150));
            } else if (i == 6) {
                graphics.setColor(new Color(238,130,238,150));
            }

            // call the function that draws square
            drawSquare(size, graphics);

            // increment size of the square
            size = size + 45;
        }

    }

    // Create a function that takes 2 parameters and draws one square
    public static void drawSquare (int size, Graphics graphics) {

        int xLine = 160 - size / 2;
        int yLine = 160 - size / 2;

        // draw square
        graphics.drawRect(xLine, yLine, size, size);
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