package termin3zad1;

import jdk.nashorn.internal.runtime.Version;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;


public class Java extends ProgrammingLanguage implements Cloneable,Comparable<Java>, Comparator<Java> {
    private static LocalDate dateOfStart = null;
    private Date dateTheLatestRelease = null;
    private Vector<String> properties = null;

    {
        dateOfStart = LocalDate.of(1995, 5, 23);
    }

    public Java(boolean isObjectOriented, Vector<String> prop) {
        super(isObjectOriented);
        this.properties = prop;
        this.dateTheLatestRelease = new Date();
    }

    public Vector<String> getProperties() {
        return properties;
    }

    public String toString() {
        return "Language: " + getClass().getSimpleName()
                + ", dateOfStart = " + dateOfStart
                + ", dateTheLatestRelease = " + dateTheLatestRelease
                + ", properties = " + properties;
    }

    @Override
    public Java clone() throws CloneNotSupportedException {
        Java cloned = (Java) super.clone();
        cloned.dateTheLatestRelease = (Date) dateTheLatestRelease.clone();
        cloned.properties = (Vector<String>) properties.clone();
        return cloned;
    }

    @Override
    public int compareTo(Java o) {
        return this.dateTheLatestRelease.compareTo(o.dateTheLatestRelease);
    }

    @Override
    public int compare(Java o1, Java o2) {
        int result = o2.dateOfStart.compareTo(o1.dateOfStart);
        if (result == 0){
            return 
        }
    }
}
