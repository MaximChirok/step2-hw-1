package ru.skypro;

public abstract class Hogwarts {

    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }


    public int abilityHogwarst () {
        return magic + transgression;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareHogwarts (Hogwarts hogwarts) {
        int ability1 = abilityHogwarst();
        int ability2 = hogwarts.abilityHogwarst();
        if (ability1 > ability2) {
            System.out.printf("Student %s luchshe studenta %s%n", getName(), hogwarts.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s huje studenta %s%n", hogwarts.getName(), getName());
        } else {
            System.out.printf("Student %s takoi je, kak student %s%n", hogwarts.getName(), getName());
        }

    }

    public String toString () {
        return String.format("Student %s; sila magii: %d; sila transgressii: %d", name, magic, transgression);
    }

}

