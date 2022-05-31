package ru.skypro;

public class Griffindor extends Hogwarts {
    private int blagorodstvo;
    private int chest;
    private int hrabrost;

    public Griffindor(String name, int magic, int transgression, int blagorodstvo, int chest, int hrabrost) {
        super(name, magic, transgression);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }

    public void setHrabrost(int hrabrost) {
        this.hrabrost = hrabrost;
    }

    public int ability() {
        return blagorodstvo + chest + hrabrost;
    }


    public void compareGriffindor (Griffindor griffindor) {
        int ability1 = ability();
        int ability2 = griffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s luchshe studenta %s%n", getName(), griffindor.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s huje studenta %s%n", griffindor.getName(), getName());
        } else {
            System.out.printf("Student %s takoi je, kak student %s%n", griffindor.getName(), getName());
        }
    }


    @Override
    public String toString() {
        return String.format("%s; blagorodstvo: %d; chest: %d; hrabrost: %d", super.toString(), blagorodstvo, chest, hrabrost);
    }
}
