package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirsStream {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();


        list.add(112);
        list.add(123);
        list.add(1232);
        list.add(132);
        list.add(12);
        list.add(1312);
        list.add(1312);
        list.add(312);
        list.add(12);
        List<Integer> list2 = list.stream().map(e->e*20).collect(Collectors.toList());
        System.out.println(list2);
        List<Integer> list3 = list2.stream().collect(Collectors.toList());





    }



}
