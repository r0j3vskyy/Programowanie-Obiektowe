package PrzykladoweZadania.Nr2.Cloneable;

import java.util.Arrays;

public class Student implements Cloneable{
    private String name;
    private int[] grades;

    public Student(String name, int[] grades){
        this.name = name;
        this.grades = (grades != null) ? grades.clone() : new int[5];
    }

    public int[] getGrades() {
        return grades;
    }
    public void setGrade(int index, int value) {
        if (index >= 0 && index < grades.length){
            this.grades[index] = value;
        }
    }

    @Override
    public Student clone() throws CloneNotSupportedException{
        Student cloned = (Student) super.clone();
        cloned.grades = this.grades.clone();
        return cloned;
    }
    @Override
    public String toString() {
        return "Student: " +name+ ", Oceny: " +Arrays.toString(grades);
    }
}
