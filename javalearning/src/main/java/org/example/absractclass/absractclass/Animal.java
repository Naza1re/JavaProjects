package org.example.absractclass.absractclass;

public abstract class Animal {
    int age;
     abstract public void say();
    public Animal(int age){
        this.age=age;
        System.out.println("Создается животное");
    }
    public void run(){
        System.out.println("Животное бежит");
    }
}
