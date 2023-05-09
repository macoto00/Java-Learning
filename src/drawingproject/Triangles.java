package drawingproject;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {

        // triangle size
        int triangleSize = WIDTH / 21;

        // width of the canvas
        int width = WIDTH / 2;

        // triangle height
        int triangleHeight = (int) (triangleSize * Math.sqrt(3)) / 2;

        // drawTriangle
        drawBigTriangle(width, triangleSize, triangleHeight, graphics);
    }

    // function to draw a big triangle
    public static void drawBigTriangle(int width, int size, int height, Graphics graphics) {

        // how many triangles should build the big one
        int count = 20;

        // set size of how much should be the new line moved (half of the size of the triangle)
        int step = size / 2;

        // loop for triangles
        // row drawing
        for (int row = 1; row <= count; row++) {
            // column drawing (x coordinate, y coordinate, size of the line, graphic)
            for (int column = 1; column <= row; column++) {
                drawTriangle((column * size) + (width - size), (row * height), size, graphics);
            }
            // every new line start left with size of half of the triangle
            width = width - step;
        }
    }

    // function to draw a single triangle
    public static void drawTriangle(int x, int y, int size, Graphics graphics) {

        // set heights
        int triangleHeight = (int) (size * Math.sqrt(3)) / 2;

        // draw triangle
        int[] xPoints = {x, x + (size / 2), x - (size / 2)};
        int[] yPoints = {y, y + triangleHeight, y + triangleHeight};
        int nPoints = 3;
        graphics.drawPolygon(xPoints, yPoints, nPoints);
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