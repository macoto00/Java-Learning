package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!

        // random math
        int randomPosition = (int)Math.floor(Math.random() * (320 + 1));

        int xLine = randomPosition;
        int yLine = randomPosition;
        int rectangleSize = (int)Math.floor(Math.random() * (150 - 10 + 1) + 10);

        for (int i = 0; i < 4; i++) {
            // random color
            int red = (int)Math.floor(Math.random() * (255 + 1));
            int green = (int)Math.floor(Math.random() * (255 + 1));
            int blue = (int)Math.floor(Math.random() * (255 + 1));
            Color color=new Color(red,green,blue);
            graphics.setColor(color);

            // random rectangles
            graphics.drawRect(xLine, yLine, rectangleSize, rectangleSize);
            xLine = (int)Math.floor(Math.random() * (320 + 1));
            yLine = (int)Math.floor(Math.random() * (320 + 1));
            rectangleSize = (int)Math.floor(Math.random() * (150 - 10 + 1) + 10);
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