package SearchWindows;

import LibraryUnits.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBook implements ActionListener {
    JFrame frame = new JFrame("Добавление книги в библеотеку");

    JTextField name = new JTextField();
    JTextField author = new JTextField();
    JTextField id = new JTextField();
    JButton add = new JButton("Добавить");
    JButton back = new JButton("Назад");
    JLabel label = new JLabel("Добавление книги");
    JLabel NAME = new JLabel("Название");
    JLabel AUTHOR = new JLabel("Автор");
    JLabel ID = new JLabel("Id");
    public AddBook(){
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(127, 173, 169));

        label.setBounds(550,100,600,100);
        label.setFont(new Font("Verdana", Font.PLAIN, 40));
        frame.add(label);

        name.setBounds(250,300,300,50);
        name.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(name);

        author.setBounds(600,300,300,50);
        author.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(author);

        id.setBounds(950,300,300,50);
        id.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(id);

        NAME.setBounds(350,350,150,50);
        NAME.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(NAME);

        AUTHOR.setBounds(700,350,150,50);
        AUTHOR.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(AUTHOR);

        ID.setBounds(1100,350,150,50);
        ID.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(ID);
        back.setBounds(550,550,400,50);
        back.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MainSearch();
            }
        });
        add.setBounds(550,450,400,50);
        add.setFont(new Font("Verdana", Font.PLAIN, 20));
        add.addActionListener(this);
        frame.add(add);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String title1 = name.getText();
        String author1 = author.getText();
        String id1 = id.getText();
        Library.addBookToLibrary(title1, author1, id1);
        }

}
