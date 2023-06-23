import javax.swing.*;

public class Main extends JFrame {
        JFrame frame = new JFrame("Гонки");
        Main(){
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.add(new Road());
            frame.setVisible(true);

        }
}