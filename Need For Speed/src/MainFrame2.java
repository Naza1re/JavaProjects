import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class MainFrame2 extends JFrame {
    JFrame frame = new JFrame("ИгРЫ");
    JButton button = new JButton("Играть");
    JButton button2 = new JButton("Выйти из игры");


    MainFrame2() throws IOException {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setBounds(0, 0, 1600, 1000);
        frame.add(new Image());
        frame.setVisible(true);
        frame.setLayout(null);


        button.setBounds(200, 450, 300, 100);
        button.setFont(new Font("Verdana", Font.PLAIN, 40));
        button.setBackground(new Color(133, 13, 255));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Main();

            }
        });
        frame.add(button);


        button2.setBounds(200, 580, 300, 100);
        button2.setFont(new Font("Verdana", Font.PLAIN, 32));
        button2.setBackground(new Color(84, 13, 231));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(2);
            }

        });
        frame.add(button2);


    }


}
