package org.example.absractclass.absractclass;

public class Dog extends Animal {
    private int age;
    private String name;
    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Dog(String name, int age){
        super(age);
        this.name = name;
        System.out.println("Создается собака с возрастом : " +age);
    }

}
