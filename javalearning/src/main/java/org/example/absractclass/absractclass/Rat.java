package org.example.absractclass.absractclass;

public class Rat extends Animal{
    @Override
    public void say() {
        System.out.println("Пи-Пи");

    }

    public Rat(int age){
        super(age);
        System.out.println("Создается мышь ");
    }
}
