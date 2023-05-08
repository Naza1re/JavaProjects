package org.example.Collection;

import org.example.Сomparator.Man;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<CATS> list = new ArrayList<>();



        CATS cat1 = new CATS(12,"katty");
        CATS cat2 = new CATS(14,"marry");
        CATS cat3 = new CATS(15,"maytt");


        Collections.addAll(list,cat1,cat2,cat3);
        printlist(list);
        deletefirstletter(list);
        printlist(list);

    }
    public static void deletefirstletter(List<CATS> list){

        for(int  i = 0;i<list.size();i++){

            list.get(i).setName(list.get(i).getName().substring(1,5));


        }

    }
    public static void printlist(List<CATS> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.print(" Имя : " + list.get(i).getName());
            System.out.println(" ");


        }
    }


}
