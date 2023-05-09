package drawingproject;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {
    public static void drawImage(Graphics graphics) {

        // size of every step is 16
        int size = WIDTH / 20;
        // size of the canvas
        int width = WIDTH / 2;
        int x1 = 0;
        int y1 = 0;

        // loop for lines
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                graphics.setColor(Color.magenta);
                graphics.drawLine(i * size, y1, width,i * size);
                graphics.setColor(Color.green);
                graphics.drawLine(x1, j * size, j * size, width);

                graphics.setColor(Color.magenta);
                graphics.drawLine(width + (i * size), y1, width * 2,i * size);
                graphics.setColor(Color.green);
                graphics.drawLine(width, j * size, width + (j * size), width);

                graphics.setColor(Color.magenta);
                graphics.drawLine(i * size, width, width,width + (i * size));
                graphics.setColor(Color.green);
                graphics.drawLine(x1, width + (j * size), j * size, width * 2);

                graphics.setColor(Color.magenta);
                graphics.drawLine(width + (i * size), width, width * 2,width + (i * size));
                graphics.setColor(Color.green);
                graphics.drawLine(width, width + j * size, width + (j * size), width * 2);
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