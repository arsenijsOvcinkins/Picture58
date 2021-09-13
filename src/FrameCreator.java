import javax.swing.*;

public class FrameCreator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Picture 58");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PictureMaker pm = new PictureMaker();
        f.add(pm);
        f.setSize(620,690);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
