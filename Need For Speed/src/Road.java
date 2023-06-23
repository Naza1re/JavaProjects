import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Road extends JPanel implements ActionListener, Runnable {

    Timer maintimer = new Timer(20, this); //создание таймера который каждые 20мс перерисовывает изображение

    Image img = new ImageIcon("resources/imgonline-com-ua-Resize-8fUGtrukPs.jpg").getImage();

    Player player = new Player();

    int score = 0;
    int money = 0;
    Thread enemiesFactory = new Thread(this); //создание потока который делает this

    List<Enemy> enemies = new ArrayList<>();
    //Создание коллекции для врагов

    public Road() {
        maintimer.start(); //запуск таймера
        enemiesFactory.start(); //Запуск потока который создает врагов
        addKeyListener(new myKeyAdapter());//слушатель кнопок
        setFocusable(true);// что бы все работало
    }

    @Override
    public void run() {

        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(1500);
                enemies.add(new Enemy(2000, random.nextInt(600), random.nextInt(60), this));///добавление в рандомном порядке врагов
                score++; // счет увеличивается с каждым разом как появляется враг
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class myKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }// обработчик нажатия кнопки

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }// обработчик отпускания кнопки
    }

    public void paint(Graphics g) {//рисование всех обьектов
        g = (Graphics2D) g;
        g.drawImage(img, player.layer1, 0, null);
        g.drawImage(img, player.layer2, 0, null);
        g.drawImage(player.img, player.x, player.y, null);

        double v = 100 / Player.MAX_V * player.v;//вычисление скорости
        g.setColor(new Color(0, 0, 0));
        Font font = new Font("Arial", Font.ITALIC, 40);
        g.setFont(font);
        g.drawString("Скорость : " + v + " КМ/ч", 100, 50);


        g.setColor(new Color(0, 0, 0));
        Font font1 = new Font("Arial", Font.ITALIC, 40);
        g.setFont(font1);
        g.drawString("Счёт :" + score, 600, 50);

        Font font2 = new Font("Arial", Font.ITALIC, 40);
        g.setFont(font2);
        g.drawString("Деньги :" + money, 800, 50);

        Font font3 = new Font("Arial", Font.ITALIC, 40);
        g.setFont(font2);
        g.drawString("Банк  :" + deserializeMoney(), 1150, 50);


        Iterator<Enemy> iterator = enemies.iterator(); // Итератор стоит во главе всех коллекций, служит для перебора коллекций
        while (iterator.hasNext()) {//цикл который спавнит наших врагов, и удаляет как только они отдалятся от нас на 2400
            Enemy e = iterator.next();

            if (e.x >= 2400 || e.x <= -2400) {
                iterator.remove();
            } else {
                e.move();
                g.drawImage(e.img, e.x, e.y, null);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {// выполнение того самого этого
        player.move();
        repaint();
        try {
            testCollitionWithEnemies();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        addMoney();
    }

    private void testCollitionWithEnemies() throws IOException {// проверка на столкновение
        Iterator<Enemy> iterator = enemies.iterator();

        while (iterator.hasNext()) {
            Enemy e = iterator.next();
            if (player.getRect().intersects(e.getRect())) {
                JOptionPane.showMessageDialog(null, "Вы проиграли со счетом : " + score + "\n" + "И заработали : " + money + "$");
                serializeMoney(deserializeMoney() + money);
                new MainFrame2();
            }
        }
    }

    private void addMoney() {//Добавление денег на счет помощь бездомным животным
        Iterator<Enemy> iterator = enemies.iterator();

        while (iterator.hasNext()) {
            Enemy e = iterator.next();
            if (player.getRectForMoney().intersects(e.getRectForMoney())) {
                money += 1;
            }

        }

    }

    public static void serializeMoney(double money) {
        try {
            FileOutputStream fileOut = new FileOutputStream("money.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeDouble(money);
            out.close();
            fileOut.close();
            System.out.println("Параметр money успешно сериализован в файл ");
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации параметра money: " + e.getMessage());
        }
    }

    // Метод для десериализации параметра money из файла
    public static double deserializeMoney() {
        double money = 0;
        try {
            FileInputStream fileIn = new FileInputStream("money.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            money = in.readDouble();
            in.close();
            fileIn.close();
            System.out.println("Параметр money успешно десериализован из файла ");
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + " не найден. Создан новый файл.");
            serializeMoney(money);
        } catch (IOException e) {
            System.out.println("Ошибка при десериализации параметра money: " + e.getMessage());
        }
        return money;
    }
    public static void nullTheBank() {
        serializeMoney(0);
    }
}
