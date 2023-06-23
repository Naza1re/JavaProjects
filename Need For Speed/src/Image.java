import javax.swing.*;
import java.awt.*;

public class Image extends JPanel {
    java.awt.Image img = new ImageIcon("resources/potrebnost-v-skorosti-goryachim-sledam-trassa-doroga-gonka-tachki-povorot-drift.jpg").getImage();


    public void paint(Graphics g) {//рисование всех обьектов
        g = (Graphics2D) g;
        g.drawImage(img, 0, 0, null);

    }

}
