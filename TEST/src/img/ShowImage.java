package img;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 17:38
 ***************************************/
public class ShowImage {
    public static void main(String[] args) {

    }
    public static void show(BufferedImage url,String title) {
        JLabel image = new JLabel(new ImageIcon(url));
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(image);

        JFrame frame = new JFrame();
        frame.setSize(url.getWidth(), url.getHeight());
        frame.add(mainPanel);
        frame.setTitle(title);
        frame.setVisible(true);
    }
    public static void autoShow(BufferedImage url,int width,int height,String title) {
        JLabel image = new JLabel(new ImageIcon(url.getScaledInstance(width, height,Image.SCALE_DEFAULT)));
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(image);
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.add(mainPanel);
        frame.setTitle(title);
        frame.setVisible(true);
    }
}
