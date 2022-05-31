package ru.skypro;

public class Slizerin extends Hogwarts {

    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int vlast;


    public Slizerin(String name, int magic, int transgression, int hitrost, int reshitelnost, int ambicioznost, int nahodchivost, int vlast) {
        super(name, magic, transgression);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambicioznost = ambicioznost;
        this.nahodchivost = nahodchivost;
        this.vlast = vlast;
    }

    public int getHitrost() {
        return hitrost;
    }

    public void setHitrost(int hitrost) {
        this.hitrost = hitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public void setReshitelnost(int reshitelnost) {
        this.reshitelnost = reshitelnost;
    }

    public int getAmbicioznost() {
        return ambicioznost;
    }

    public void setAmbicioznost(int ambicioznost) {
        this.ambicioznost = ambicioznost;
    }

    public int getNahodchivost() {
        return nahodchivost;
    }

    public void setNahodchivost(int nahodchivost) {
        this.nahodchivost = nahodchivost;
    }

    public int getVlast() {
        return vlast;
    }

    public void setVlast(int vlast) {
        this.vlast = vlast;
    }



    public int ability() {
        return hitrost + reshitelnost + ambicioznost + nahodchivost + vlast;
    }


    public void compareSlizerin (Slizerin slizerin) {
        int ability1 = ability();
        int ability2 = slizerin.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s luchshe studenta %s%n", getName(), slizerin.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s huje studenta %s%n", slizerin.getName(), getName());
        } else {
            System.out.printf("Student %s takoi je, kak student %s%n", slizerin.getName(), getName());
        }
    }


    @Override
    public String toString() {
        return String.format("%s; hitrost: %d; reshitelnost: %d; ambisioznost: %d; nahodchivost: %d; vlast: %d", super.toString(), hitrost, reshitelnost, ambicioznost, nahodchivost, vlast);
    }
}
