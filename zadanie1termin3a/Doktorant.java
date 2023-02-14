package zadanie1termin3a;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Doktorant extends Student implements Named , Cloneable, Comparable<Doktorant> ,Comparator<Doktorant>{
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

    @Override
    public Doktorant clone() throws CloneNotSupportedException {
        Doktorant cloned = (Doktorant) super.clone();
        cloned.dateOfStart = (Date) dateOfStart;
        return cloned;
    }

    public int suma(ArrayList<Integer> points){
        int suma = 0;
        for(int i = 0 ; i<this.points.size();i = i+1){
            suma = suma + this.points.get(i);
        }
        return suma;
    }

    @Override
    public int compareTo(Doktorant o) {
        int result = 0;
        Doktorant o1 = (Doktorant) o;
        if(this.getName().compareTo(o1.getName())==0){
            return Integer.compare(this.suma(this.points),o1.suma(this.points));
        }
        return result;
    }

    @Override
    public int compare(Doktorant o1, Doktorant o2) {
        Doktorant s1 = (Doktorant) o1;
        Doktorant s2 = (Doktorant) o2;
        if(s1.suma(this.points)==s2.suma(this.points)){
            return 0;
        }
        if(s1.suma(this.points)>s2.suma(this.points)){
            return 1;
        }
        else return -1;

    }
}
