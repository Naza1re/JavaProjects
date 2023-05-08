package org.example.Сomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainForMan {

    public static void main(String[] args) {

        List<Man> list = new ArrayList<>();

        Man man1 = new Man(12,"nikita",1292);
        Man man2 = new Man(72,"andrei",12);
        Man man3 = new Man(22,"arnold",13292);
        Man man4 = new Man(15,"apot",129231);
        Man man5 = new Man(52,"hyblot",129323232);

        Collections.addAll(list,man1,man2,man3,man4,man5);


        Comparator<Man> comparatorofweight = new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o1.weight-o2.weight;
            }
        };


        Comparator<Man> comparatorofage = new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o1.age-o2.age;
            }
        };
        printlist(list);

        Collections.sort(list,comparatorofage);

        System.out.println(list);
        printlist(list);










    }

    public static void printlist(List<Man> list){

        for (int i = 0;i<list.size();i++){

            System.out.print("Рост : " + list.get(i).getWeight());
            System.out.println(" ");


        }


    }

}
