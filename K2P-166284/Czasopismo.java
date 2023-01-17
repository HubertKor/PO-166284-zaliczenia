import java.util.Objects;

public class Czasopismo extends Publikacja {
    private int numer;

    public Czasopismo(String tytul, double cena, int rok, int miesiac, int dzien, int numer) {
        super(tytul, cena, rok, miesiac, dzien);
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + this.numer + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        Czasopismo s = (Czasopismo) otherObject;
        return super.equals(otherObject) && this.numer == s.numer;


    }
}

