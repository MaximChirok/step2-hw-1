package ru.skypro;

public class Kogtevran extends Hogwarts {

    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestvo;

    public Kogtevran(String name, int magic, int transgression, int umnost, int mudrost, int ostroumie, int tvorchestvo) {
        super(name, magic, transgression);
        this.um = umnost;
        this.mudrost = mudrost;
        this.ostroumie = ostroumie;
        this.tvorchestvo = tvorchestvo;
    }

    public int getUmnost() {
        return um;
    }

    public void setUmnost(int umnost) {
        this.um = umnost;
    }

    public int getMudrost() {
        return mudrost;
    }

    public void setMudrost(int mudrost) {
        this.mudrost = mudrost;
    }

    public int getOstroumie() {
        return ostroumie;
    }

    public void setOstroumie(int ostroumie) {
        this.ostroumie = ostroumie;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }

    public void setTvorchestvo(int tvorchestvo) {
        this.tvorchestvo = tvorchestvo;
    }


    public int ability() {
        return um + mudrost + ostroumie + tvorchestvo;
    }


    public void compareKogtevran(Kogtevran kogtevran) {
        int ability1 = ability();
        int ability2 = kogtevran.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s luchshe studenta %s%n", getName(), kogtevran.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s huje studenta %s%n", kogtevran.getName(), getName());
        } else {
            System.out.printf("Student %s takoi je, kak student %s%n", kogtevran.getName(), getName());
        }
    }


    @Override
    public String toString() {
        return String.format("%s; um: %d; mudrost: %d; ostroumie: %d; tvorchestvo: %d", super.toString(), um, mudrost, ostroumie, tvorchestvo);
    }
}
