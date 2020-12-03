import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LineDrawingExample extends JPanel {
    void drawLines(Graphics g) {
        var g2d = (Graphics2D)g;
        g2d.drawLine(120, 50, 360, 50);
        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawLines(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                var app = new JFrame("Line Drawing Demo");
                app.setSize(500, 400);
                app.add(new LineDrawingExample(), BorderLayout.CENTER);
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.setLocationRelativeTo(null);
                app.setVisible(true);
            }
        });
    }
}
