package termin3zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vector<Java> zad1 = new Vector<>();
        Java zad2 = new Java(true,new Vector<String>(1,2));
        Java zad3 = new Java(false,new Vector<>(2,3));
        Collections.sort(zad1);
        for(Java e : zad1){
            System.out.println(e.getIsObjectOriented() + " " + e.getIsObjectOriented());
        }
    }
}
