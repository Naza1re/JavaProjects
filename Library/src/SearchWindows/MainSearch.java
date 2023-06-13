package SearchWindows;


import LibraryUnits.Book;
import LibraryUnits.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSearch extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Главное поисковое окно");
    JLabel label = new JLabel("Добро пожаловать в нашу поисковую систему");
    JButton add = new JButton("Добавить книгу");
    JButton search = new JButton("Поиск книг");
    JButton addUserToBook = new JButton("Добавить пользователя книге");
    JButton leave = new JButton("Выйти из системы");
    JLabel best = new JLabel("Популярные книги");
    JTextArea theBestOfTheBest = new JTextArea();
    JButton theBest = new JButton("Узнать");

    MainSearch(){
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(127, 173, 169));
        label.setBounds(400,100,800,100);
        label.setFont(new Font("Verdana", Font.PLAIN, 30));
        theBestOfTheBest.setBounds(1100,250,400,400);
        theBestOfTheBest.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(theBestOfTheBest);
        best.setBounds(1200,200,400,50);
        best.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(best);
        theBest.setBounds(1100,700,400,50);
        theBest.setFont(new Font("Verdana",Font.PLAIN,20));
        theBest.addActionListener(this);
        frame.add(theBest);

        frame.add(label);

        search.setBounds(500,300,500,50);
        search.setFont(new Font("Verdana",Font.PLAIN,20));

        frame.add(search);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new SearchBy();
            }
        });
        addUserToBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new AddOrDeleteUserToBook();
            }
        });


        add.setBounds(500,400,500,50);
        add.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new AddBook();
            }
        });

        addUserToBook.setBounds(500,500,500,50);
        addUserToBook.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(addUserToBook);

        leave.setBounds(500,600,500,50);
        leave.setFont(new Font("Verdana",Font.PLAIN,20));
        leave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(2);

            }
        });
        frame.add(leave);


    }

    public static void main(String[] args) {
        new MainSearch();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Book[] bookLines = Library.displayBooksFromFile("books.txt");
        StringBuilder sb = new StringBuilder();
        for (Book line : bookLines) {
            sb.append(line).append("\n");
        }
        theBestOfTheBest.setText(sb.toString());

    }
}
