package org.example.Сomparator;

public class People implements Comparable<People> {

    public int age;

    String name;


    public String getName(){
        return this.name;
    }





    public People(int age,String name){
        this.age = age;
        this.name = name;
    }




    @Override
    public int compareTo(People o) {
        return o.age-this.age;
    }

}
