package org.example.pol;

public class Cat {

    int age;
    String name;
    double speed;


    public Cat(int age, String name, double speed) {
        this.age = age;
        this.name = name;
        this.speed = speed;
    }

    String run(){
        return "Кошка бежит";
    }

}
