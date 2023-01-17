import java.time.LocalDate;
import java.util.Objects;

public class Publikacja {
    private String tytul;
    private double cena;
    private LocalDate dataWydania;
    private static int ile;

    public Publikacja(String tytul, double cena, int rok, int miesiac, int dzien) {
        this.tytul = tytul;
        this.cena = cena;
        this.dataWydania = LocalDate.of(rok, miesiac, dzien);
        ile++;
    }

    public Publikacja(String tytul, double cena) {
        this.tytul = tytul;
        this.cena = cena;
        this.dataWydania = LocalDate.now();
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(int rok, int miesiac, int dzien) {
        this.dataWydania = LocalDate.of(rok, miesiac, dzien);
    }

    @Override
    public String toString() {
        if(Objects.equals(this.tytul,"Publikacja Nieznana")){
            return this.getClass().getName() + " [" + this.dataWydania + "] [" + this.cena + "]";
        }
        return this.getClass().getName() + " [ " + this.tytul + "] " + " [" + this.dataWydania + "] [" + this.cena + "]";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;
        Publikacja that = (Publikacja) obj;
        return this.tytul.equals(that.tytul) && this.cena == that.cena && this.dataWydania.equals(that.dataWydania);
    }
    public void zwiekszCene(double procent){
        this.cena = this.cena +(procent/100 * this.cena);
    }

    public static int getIle() {
        return ile;
    }
}

