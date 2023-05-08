package org.example.absractclass.absractclass;

public class Cat extends Animal {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(int age) {
        super(age);
        System.out.println("Создается кошка");
    }


    @Override
    public void say() {
        System.out.println("мяу-мяу");
    }
}
