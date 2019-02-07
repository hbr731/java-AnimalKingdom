package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractAnimal> myList = new ArrayList<>();

        myList.add(new Mammal("Panda", 1869));
        myList.add(new Mammal("Zebra",1778));
        myList.add(new Mammal("Koala",1816));
        myList.add(new Mammal("Sloth",1804));
        myList.add(new Mammal("Armadillo",1758));
        myList.add(new Mammal("Raccoon",1758));
        myList.add(new Mammal("Bigfoot",2021));

        myList.add(new Bird("Pigeon",1837));
        myList.add(new Bird("Peacock",1821));
        myList.add(new Bird("Toucan",1758));
        myList.add(new Bird("Parrot",1824));
        myList.add(new Bird("Swan",1758));

        myList.add(new Fish("Salmon",1758));
        myList.add(new Fish("Catfish",1817));
        myList.add(new Fish("Perch",1758));

        System.out.println();
        System.out.println("\t\t --- The List ---");
        System.out.println(myList.toString());
        System.out.println();

    }
}
