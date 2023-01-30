package zadanie1;

import java.util.*;

public class Student extends Person implements Cloneable{
    private final int id;
    private Date dateOfStart = null;

    public Student(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfStart = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + "]";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        return cloned;
    }


}
