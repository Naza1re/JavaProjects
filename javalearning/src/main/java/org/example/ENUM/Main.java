package org.example.ENUM;

import org.example.Сomparator.Man;
import org.example.Сomparator.People;

import java.util.List;
import java.util.Objects;

public class Main implements Cloneable  {
    public static void main(String[] args) {

        Man man1 = new Man(12,"NIKITA",123);
    }

    public Object clone() throws CloneNotSupportedException{


        return super.clone();



    }




}


