package SearchWindows;

import LibraryUnits.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBy implements ActionListener {

    private final JFrame frame = new JFrame("Поиск");
    private final JTextField unit = new JTextField();
    private final JTextArea area = new JTextArea();
    private final JButton back = new JButton("Назад");
    private final JRadioButton byTitle = new JRadioButton("Название",true);
    private final JRadioButton byAuthor = new JRadioButton("Автор");
    private final JRadioButton byId = new JRadioButton("Id");
    private final JRadioButton byUser = new JRadioButton("Пользователь");
    private final JLabel writeYourUnit = new JLabel("Введите артрибут книги ");
    private final JLabel result = new JLabel("Результат поиска ");
    private final  ButtonGroup searchBy = new ButtonGroup();

    public SearchBy() {
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);


        unit.setBounds(200, 100, 400, 50);
        unit.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(unit);

        area.setBounds(850,100, 600, 600);
        area.setFont(new Font("Verdana", Font.PLAIN, 20));

        area.setEditable(false);
        frame.add(area);

        JButton search = new JButton("Поиск");
        search.setBounds(250, 550, 300, 50);
        search.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(search);
        search.addActionListener(this);

        back.setBounds(250, 650, 300, 50);
        back.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MainSearch();
            }
        });
        writeYourUnit.setBounds(200,50,400,50);
        writeYourUnit.setFont(new Font("Verdana", Font.PLAIN, 30));

        frame.add(writeYourUnit);

        result.setBounds(1000,50,400,50);
        result.setFont(new Font("Verdana", Font.PLAIN, 30));

        frame.add(result);

        byTitle.setBounds(350,200,200,20);
        byTitle.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(byTitle);

        byAuthor.setBounds(350,300,200,20);
        byAuthor.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(byAuthor);

        byId.setBounds(350,400,200,20);
        byId.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(byId);

        byUser.setBounds(350,500,200,20);
        byUser.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(byUser);

        searchBy.add(byId);
        searchBy.add(byTitle);
        searchBy.add(byAuthor);
        searchBy.add(byUser);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String unit1 = unit.getText();
        if(searchBy.isSelected(byTitle.getModel())){

            String[] bookLines = Library.readBooksFromFileByTitle("books.txt", unit1);
            StringBuilder sb = new StringBuilder();
            for (String line : bookLines) {
                sb.append(line).append("\n");
            }
            area.setText(sb.toString());

        }
        else

        if(searchBy.isSelected(byAuthor.getModel())){

            String[] bookLines = Library.readBooksFromFileByAuthor("books.txt", unit1);
            StringBuilder sb = new StringBuilder();
            for (String line : bookLines) {
                sb.append(line).append("\n");
            }
            area.setText(sb.toString());

        }
        else

        if(searchBy.isSelected(byId.getModel())){

            String[] bookLines = Library.readBooksFromFileById("books.txt", unit1);
            StringBuilder sb = new StringBuilder();
            for (String line : bookLines) {
                sb.append(line).append("\n");
            }
            area.setText(sb.toString());

        }
        else
        if(searchBy.isSelected(byUser.getModel())){

            String[] bookLines = Library.readBooksFromFileByUser("books.txt", unit1);
            StringBuilder sb = new StringBuilder();
            for (String line : bookLines) {
                sb.append(line).append("\n");
            }
            area.setText(sb.toString());

        }

    }
}
