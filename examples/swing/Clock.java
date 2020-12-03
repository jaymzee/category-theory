import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Clock extends JPanel {
    public static final int cx = 200;
    public static final int cy = 200;
    public static final int r1 = 180;
    public static final int r2 = 130;

    void drawClock(Graphics2D g) {
        var cal = Calendar.getInstance();
        int s = cal.get(Calendar.SECOND);
        int m = cal.get(Calendar.MINUTE);
        int h = cal.get(Calendar.HOUR);
        double ss = 2 * Math.PI * s / 60.0;
        double mm = 2 * Math.PI * m / 60.0;
        double hh = 2 * Math.PI * h / 12.0;

        g.drawOval(5, 5, 390, 390);
        g.setColor(Color.RED);
        g.drawLine(cx, cy,
                cx + (int)(r1 * Math.sin(ss)), cy - (int)(r1 * Math.cos(ss)));
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawLine(cx, cy,
                cx + (int)(r1 * Math.sin(mm)), cy - (int)(r1 * Math.cos(mm)));
        g.setStroke(new BasicStroke(3));
        g.drawLine(cx, cy,
                cx + (int)(r2 * Math.sin(hh)), cy - (int)(r2 * Math.cos(hh)));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawClock((Graphics2D)g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                var app = new JFrame("Line Drawing Demo");
                app.setSize(400, 435);
                app.add(new Clock(), BorderLayout.CENTER);
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.setLocationRelativeTo(null);
                app.setVisible(true);

                var task1 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        app.repaint();
                    }
                };
                new Timer(500, task1).start();
                // new Timer(500, evt -> { app.repaint(); }).start();
            }
        });
    }
}
