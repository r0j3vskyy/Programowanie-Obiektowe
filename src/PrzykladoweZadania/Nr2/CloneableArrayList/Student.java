package PrzykladoweZadania.Nr2.CloneableArrayList;

import java.util.ArrayList;

public class Student implements Cloneable{
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void changeFirstGrade(int grade){
        ArrayList<Integer> newGrades = new ArrayList<>(grades);
        newGrades.set(0, grade);
        this.grades = newGrades;
    }

    @Override
    public String toString() {
        return "Student: [" +name+ ", " +grades+ "].";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        if (this.grades != null){
            cloned.grades = new ArrayList<>(grades);
        }
        return cloned;
    }
}
