package SearchWindows;

import LibraryUnits.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOrDeleteUserToBook implements ActionListener {
    JFrame frame = new JFrame("Добавление пользователя книге");

    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JButton addButton = new JButton("Выполнить");
    JButton backButton = new JButton("Назад");
    JLabel label = new JLabel("Добавление / удаление пользователя книге ");
    JRadioButton remove = new JRadioButton("Удалить");
    JRadioButton add = new JRadioButton("Добавить");
    JLabel id = new JLabel("Id");
    JLabel User = new JLabel("Пользователь");

    ButtonGroup buttonGroup = new ButtonGroup();

    public AddOrDeleteUserToBook() {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(3);
        frame.getContentPane().setBackground(new Color(127, 173, 169));
        label.setBounds(300,200,1000,100);
        label.setFont(new Font("Verdana",Font.PLAIN,40));
        frame.add(label);
        backButton.setBounds(600,700,300,50);
        backButton.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainSearch();
                frame.setVisible(false);
            }
        });
        addButton.setBounds(600,600,300,50);
        addButton.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(addButton);
        addButton.addActionListener(this);
        id.setBounds(930,350,200,50);
        id.setFont(new Font("Verdana",Font.PLAIN,30));
        frame.add(id);
        textField1.setBounds(400,300,300,50);
        textField1.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(textField1);
        User.setBounds(450,350,300,50);
        User.setFont(new Font("Verdana",Font.PLAIN,30));
        frame.add(User);

        remove.setBounds(580,500,200,50);
        remove.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(remove);
        add.setBounds(780,500,150,50);
        add.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(add);


        textField2.setBounds(800,300,300,50);
        textField2.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(textField2);





        buttonGroup.add(remove);
        buttonGroup.add(add);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = textField1.getText();
        String id = textField2.getText();

        if(buttonGroup.isSelected(add.getModel())){

            Library.addUserToBook(name,id);

        }

        if(buttonGroup.isSelected(remove.getModel())){

            Library.removeUserFromBook(id);


        }

    }
}
