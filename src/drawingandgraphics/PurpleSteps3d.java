package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        int xAndYLine = 10;
        int size = 10;

        drawSquareTwo(xAndYLine, size, graphics);
        drawSquare(xAndYLine, size, graphics);

    }

    public static void drawSquare(int xAndYLine, int size, Graphics graphics) {

        // loop
        for (int i = 0; i < 6; i++) {
            // draw square

            graphics.setColor(Color.BLACK);
            graphics.drawRect(xAndYLine, xAndYLine, size, size);
            size = size + 10;
            if (i < 2) {
                xAndYLine *= 2;
            } else if (i == 2) {
                xAndYLine = xAndYLine * 2 - 10;
            }else if (i == 3) {
                xAndYLine = xAndYLine * 2 - 30;
            } else if (i == 4) {
                xAndYLine = xAndYLine * 2 - 60;
            }

        }
    }
    public static void drawSquareTwo(int xAndYLine, int size, Graphics graphics) {

// loop
        for (int i = 0; i < 6; i++) {
            // draw square
            graphics.setColor(new Color(153,50,204,150));
            graphics.fillRect(xAndYLine, xAndYLine, size, size);
            size = size + 10;
            if (i < 2) {
                xAndYLine *= 2;
            } else if (i == 2) {
                xAndYLine = xAndYLine * 2 - 10;
            }else if (i == 3) {
                xAndYLine = xAndYLine * 2 - 30;
            } else if (i == 4) {
                xAndYLine = xAndYLine * 2 - 60;
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