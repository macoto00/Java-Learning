package fractals;

import javax.swing.*;
import java.awt.*;

public class FractalTree extends JFrame {

    public FractalTree() {
        super("Fractal Tree");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawTree(g, 400, 500, 100, -Math.PI / 2, 10);
    }

    private void drawTree(Graphics g, int x1, int y1, double length, double angle, int level) {
        if (level == 0) return;

        int x2 = x1 + (int) (Math.cos(angle) * length);
        int y2 = y1 + (int) (Math.sin(angle) * length);

        g.drawLine(x1, y1, x2, y2);

        drawTree(g, x2, y2, length * 0.7, angle - Math.PI / 4, level - 1);
        drawTree(g, x2, y2, length * 0.7, angle + Math.PI / 4, level - 1);
    }

    public static void main(String[] args) {
        FractalTree fractalTree = new FractalTree();
        fractalTree.setVisible(true);
    }
}

