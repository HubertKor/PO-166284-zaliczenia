package zadanie1termin3a;

import java.util.ArrayList;
import java.util.Date;

public class Doktorant extends Student implements Named , Clonable{
    private final int id;
    private Date dateOfStart = null;
    private ArrayList<Integer> points = null;

    public Doktorant(String name, int id, ArrayList<Integer> points) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
        this.points = points;
    }

    public int getId() {
        return id;
    }
    public ArrayList<Integer> getPoints() {
        return points;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + ", points = " + points;
    }

}
