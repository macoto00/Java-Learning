package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]

        for (int i = 0; i < 19; i++) {
            // square size
            int size = 10;

            // purple color fill, black corners
            graphics.setColor(Color.BLACK);

            // call the function that draws square
            drawSquareTwo(size, graphics);
        }

        for (int i = 0; i < 19; i++) {
            // square size
            int size = 10;

            // purple color fill, black corners
            graphics.setColor(new Color(153,50,204,150));

            // call the function that draws square
            drawSquare(size, graphics);
        }

    }

    // Create a function that takes 2 parameters and draws one square
    public static void drawSquare (int size, Graphics graphics) {

        int xLine = 20;
        int yLine = 20;

        for (int i = 0; i < 19; i++) {
            // draw square
            graphics.fillRect(xLine, yLine, size, size);
            xLine += 10;
            yLine += 10;
        }
    }

    public static void drawSquareTwo (int size, Graphics graphics) {

        int xLine = 20;
        int yLine = 20;

        for (int i = 0; i < 19; i++) {
            // draw square
            graphics.drawRect(xLine, yLine, size, size);
            xLine += 10;
            yLine += 10;
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