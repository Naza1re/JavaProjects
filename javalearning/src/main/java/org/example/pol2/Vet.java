package org.example.pol2;

public class Vet {

    public static void giveShot(Animal a){


        a.makenoise();
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        giveShot(dog);
    }




}
