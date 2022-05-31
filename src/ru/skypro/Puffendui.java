package ru.skypro;

public class Puffendui extends Hogwarts {

    private int trudolyubie;
    private int vernost;
    private int chestnost;


    public Puffendui(String name, int magic, int transgression, int trudolyubie, int vermost, int chestnost) {
        super(name, magic, transgression);
        this.trudolyubie = trudolyubie;
        this.vernost = vermost;
        this.chestnost = chestnost;
    }

    public int getTrudolyubie() {
        return trudolyubie;
    }

    public void setTrudolyubie(int trudolyubie) {
        this.trudolyubie = trudolyubie;
    }

    public int getVermost() {
        return vernost;
    }

    public void setVermost(int vermost) {
        this.vernost = vermost;
    }

    public int getChestnost() {
        return chestnost;
    }

    public void setChestnost(int chestnost) {
        this.chestnost = chestnost;
    }



    public int ability() {
        return trudolyubie + vernost + chestnost;
    }


    public void comparePuffendui (Puffendui puffendui) {
        int ability1 = ability();
        int ability2 = puffendui.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s luchshe studenta %s%n", getName(), puffendui.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s huje studenta %s%n", puffendui.getName(), getName());
        } else {
            System.out.printf("Student %s takoi je, kak student %s%n", puffendui.getName(), getName());
        }
    }



    @Override
    public String toString() {
        return String.format("%s; trudolyubie: %d; vernost: %d; chestnost: %d", super.toString(), trudolyubie, vernost, chestnost);
    }
}
