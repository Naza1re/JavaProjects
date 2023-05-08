package org.example.Streams_API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) throws InterruptedException {


        Predicate<Integer> testapi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0){
                    return true;
                }
                else {
                    return false;
                }
            }
        };


        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,12,42,42,42,42,42,42,42,4,24,14,124,12);
        nums.stream()
                .map(n->n*10)
                .filter(testapi)
                .sorted()
                .forEach(n-> System.out.println(n));










    }
}
