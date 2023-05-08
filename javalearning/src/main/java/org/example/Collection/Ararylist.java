package org.example.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ararylist implements Comparator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3122);
        list.add(12);
        list.add(222);
        list.add(1312);
        list.add(3212);
        list.add(1312);
        list.add(32321);
        list.add(1312);

        printlist(list);
        sort(list);
        System.out.println(" ");
        printlist(list);



    }

    public static void printlist(List list) {

        Iterator iterator = list.iterator();


        while (iterator.hasNext()){
            System.out.print("["+iterator.next()+"]");
        }

    }

    public static List sort(List list) {

        boolean issorted = false;

        while (!issorted){
            issorted = true;
            for(int i = 0 ;i<list.size()-1;i++){
                if((Integer)list.get(i)>(Integer) list.get(i+1)){
                    issorted = false;
                    int tmp = (Integer) list.get(i);
                    list.set(i,(Integer) list.get(i+1));
                    list.set(i+1,(tmp));

                }
            }


        }
        return list;


    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
