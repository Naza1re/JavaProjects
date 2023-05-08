package org.example.Collections;

import java.util.*;

public class Tets {


    public static void main(String[] args) {
        String myString;

        Set set = new HashSet();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите набор чисел через запятую ");
        myString = in.next();

        String[] str  = myString.split(",");
        for(int i = 0;i<str.length;i++){
            set.add(str[i]);
        }
        printSet(set);




    }
    public static void printSet(Set list){
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.print("["+iterator.next()+"]");
        }
    }

}
