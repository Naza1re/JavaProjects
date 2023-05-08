package org.example.Сomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataBase {




    public static void main(String[] args) {



        List<Students> studentsList = new ArrayList<>();

        Students a1 = new Students(12,"Гурко Павел");
        Students a2 = new Students(16,"Кибицкий Денис");
        Students a3 = new Students(22,"Гончаров Артём");
        Students a4 = new Students(24,"Демидов Виталий");
        Students a5 = new Students(19,"Вассерман Анталоий");


        studentsList.add(a1);
        studentsList.add(a2);
        studentsList.add(a3);
        studentsList.add(a4);
        studentsList.add(a5);


        Comparator<Students> comparator1 = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o2.getAge()-o1.getAge();
            }
        };

        Comparator<Students> comparator2 = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o2.getAge()-o1.getAge();
            }
        };
        printlist(studentsList);
        studentsList.sort(comparator1);
        System.out.println("После сортировке по убыванию ");
        printlist(studentsList);





    }
    public static void printlist(List<Students> studentsList){
        for (int i =0;i<studentsList.size();i++) {
            System.out.print("ФИО :" + studentsList.get(i).getName());

            System.out.print(" Возраст : "+studentsList.get(i).getAge()+" лет");
            System.out.println("");

        }


    }

}
