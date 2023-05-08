package org.example.pol2;

public class PetOwner {

    public static void start(){



        Vet v = new Vet();


        Dog dog = new Dog();
        Cat cat = new Cat();

        v.giveShot(dog);
        v.giveShot(cat);

    }

    public static void main(String[] args) {
        start();



    }
}
