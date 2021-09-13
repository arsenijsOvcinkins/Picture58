import javax.swing.*;
import java.awt.*;

public class PictureMaker extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        // Red Rectangles
        g.setColor(Color.RED);
        g.fillRect(50,400,100, 200);
        g.fillRect(350,100,100, 500);

        // Blue Triangle
        g.setColor(Color.blue);
        int [] xPoints = {250, 50, 450};
        int [] yPoints = {200, 400, 400};
        int n = 3;
        Polygon p = new Polygon(xPoints,yPoints,n);
        g.fillPolygon(p);

        // Green Arc
        g.setColor(Color.green);
        g.fillArc(350,100,200,200,0,90);

        //field
        g.setColor(Color.gray);
        for (int i = 0; i <= 650 - 50; i += 50) {
            for (int j = 0; j <= 600 - 50; j += 50) {
                g.drawRect(0, 0, 50 + j, 50 + i);
            }
        }
    }
}
