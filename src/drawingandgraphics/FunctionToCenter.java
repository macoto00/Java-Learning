package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Fill the canvas with lines from the edges (every 20 px) to the center

        int width = WIDTH;
        int height = HEIGHT;

        singleLine(width, height, graphics);

    }

    // Create a function that takes 3 parameters and draws a single line
    public static void singleLine (int width, int height, Graphics graphics) {

        // loop
        for (int i = 0; i <= width / 20; i++) {
            for (int j = 0; j <= height / 20; j++) {
                if (i == 0 || j == 0 || i == width / 20 || j == height / 20) {
                    graphics.drawLine(i * 20, j * 20, width / 2, height / 2);
                }
            }
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