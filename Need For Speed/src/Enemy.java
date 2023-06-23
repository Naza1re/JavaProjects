import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Enemy {

    int x;
    int y;
    int v;
    Image img = new ImageIcon("resources/imgonline-com-ua-Resize-l6Psd8sBkL.png").getImage();
    Road road;

    public Rectangle getRect() {
        return new Rectangle(x, y, 350, 150);
    }//Определение гайбаритов врагов

    public Rectangle getRectForMoney() {
        return new Rectangle(x, y, 450, 200);
    }

    Enemy(int x, int y, int v, Road road) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.road = road;
    }

    public void move() {
        x = x - road.player.v + v;
    }//изменение координатов врагов

}
