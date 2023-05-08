package org.example.Сomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main



{

    public static void main(String[] args) {

        List<People> list = new ArrayList<>();


        People people1 = new People(87,"metty");
        People people2 = new People(32,"kitty");
        People people3 = new People(72,"mayer");
        People people4 = new People(62,"parry");
        People people5 = new People(25,"hello");


        Collections.addAll(list,people1,people2,people3,people4,people5);
        printpeole(list);




        Collections.sort(list);
        System.out.println("_________");
        printpeole(list);









    }
    public static void printpeole(List<People> list){

        for (int i = 0;i<list.size();i++){

            System.out.print("Имя : "+ list.get(i).getName());
            System.out.println(" ");

        }



    }


}
