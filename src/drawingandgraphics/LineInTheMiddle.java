package drawingandgraphics;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
    public static void drawImage(Graphics graphics){
        // bigger lines
        Graphics2D graphics2D = (Graphics2D) graphics;

        // draw a red horizontal line to the center of the canvas
        graphics.setColor(new Color(200,0,0,150));
        graphics.drawLine(0, 160, 160, 160);
        // draw a green vertical line to the center of the canvas
        graphics.setColor(new Color(0,200,0,150));
        graphics.drawLine(160, 0, 160, 160);

        // bigger lines
        graphics2D.setStroke(new BasicStroke(10));

        // draw oval
        int ovalSizeX = 300;
        int ovalSizeY = 100;
        graphics.fillOval(WIDTH/2 - ovalSizeX / 2, HEIGHT/2 - ovalSizeY / 2, ovalSizeX, ovalSizeY);
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