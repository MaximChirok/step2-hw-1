package ru.skypro;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Griffindor harry = new Griffindor ("Harry Potter", generate(), generate(), generate(), generate(), generate());
        Griffindor ron = new Griffindor ("Ron", generate(), generate(), generate(), generate(), generate());
        Griffindor germiona = new Griffindor ("Germiona", generate(), generate(), generate(), generate(), generate());
        Puffendui zaharia = new Puffendui("Zaharia", generate(), generate(), generate(), generate(), generate());
        Puffendui sedrik = new Puffendui("Sedrik", generate(), generate(), generate(), generate(), generate());
        Puffendui jastin = new Puffendui("Jastin", generate(), generate(), generate(), generate(), generate());
        Kogtevran padma = new Kogtevran("Padma", generate(), generate(), generate(), generate(), generate(), generate());
        Kogtevran markus = new Kogtevran("Markus", generate(), generate(), generate(), generate(), generate(), generate());
        Kogtevran chjou = new Kogtevran("Chjou", generate(), generate(), generate(), generate(), generate(), generate());
        Slizerin draco = new Slizerin("Draco", generate(), generate(), generate(), generate(), generate(), generate(), generate());
        Slizerin goil = new Slizerin("Goil", generate(), generate(), generate(), generate(), generate(), generate(), generate());
        Slizerin grekhem = new Slizerin("Grekhem", generate(), generate(), generate(), generate(), generate(), generate(), generate());

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(germiona);
        System.out.println(zaharia);
        System.out.println(sedrik);
        System.out.println(jastin);
        System.out.println(padma);
        System.out.println(markus);
        System.out.println(chjou);
        System.out.println(draco);
        System.out.println(goil);
        System.out.println(grekhem);

        System.out.println();
        harry.compareHogwarts(draco);
        harry.compareGriffindor(ron);
    }




    private static int generate() {
        return RANDOM.nextInt (100);

    }

}