package zadanie1;

import java.util.*;

public class Student extends Person implements Cloneable,Comparator<Student>{
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

    @Override
    public int compare(Student o1, Student o2) {
        int studentCompare = o1.compare(o1,o2);
        if(studentCompare != 0){
            return studentCompare;
        }else {
            return -1;
        }
    }
}
