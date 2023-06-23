import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Player {

    public static final int MAX_V = 100;
    public static final int MAX_TOP = 10;
    public static final int MAX_BOTTOM = 600;

    Image img = new ImageIcon("resources/imgonline-com-ua-Resize-KX08cMePYGG.png").getImage();

    int v = 0;
    int dv = 0;
    int s = 0;
    int layer1 = 0;
    int layer2 = 1800;
    int x = 30;
    int y = 100;
    int dy = 0;

    public Rectangle getRect() {
        return new Rectangle(x, y, 350, 150);
    }//определение гайбаритов машины

    public Rectangle getRectForMoney() {
        return new Rectangle(x, y, 450, 200);
    }//такая же тема только для бабла

    public void move() {
        s += v;
        v += dv;
        if (v <= 0)
            v = 0;
        if (v >= MAX_V)
            v = MAX_V;
        y -= dy;
        if (y <= MAX_TOP)
            y = MAX_TOP;
        if (y >= MAX_BOTTOM)
            y = MAX_BOTTOM;
        if (layer2 - v <= 0) {
            layer1 = 0;
            layer2 = 1800;
        } else {
            layer1 -= v;
            layer2 -= v;
        }
    }


    public void keyPressed(KeyEvent e) {//Обработака нажатия кнопок
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            dv = 1;
        }
        if (key == KeyEvent.VK_LEFT) {
            dv = -1;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 5;

        }
        if (key == KeyEvent.VK_DOWN) {
            dy = -5;

        }
    }

    public void keyReleased(KeyEvent e) {//обработка отпуска кнопок
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
            dv = 0;
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_UP) {
            dy = 0;
        }
    }

}
