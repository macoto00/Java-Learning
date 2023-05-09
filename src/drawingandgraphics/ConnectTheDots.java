package drawingandgraphics;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    // Create a function that takes 2 parameters:
    // an array of {x, y} points and graphics
    // and connects them with green lines.
    public static void connect(int[][] points, Graphics graphics) {
        // color the lines green
        graphics.setColor(Color.GREEN);

        // connect the dots
        for (int i = 0; i < points.length - 1; i++) {
            int[] start = points[i];
            int[] end = points[i + 1];
            graphics.drawLine(start[0], start[1], end[0], end[1]);
        }
    }

    public static void drawImage(Graphics graphics) {
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        connect(box, graphics);

        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] dots = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};
        connect(dots, graphics);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
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
