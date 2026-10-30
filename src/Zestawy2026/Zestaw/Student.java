package Zestawy2026.Zestaw;

//package pl.uwm;
public class Student implements Comparable<Student> {
    private String name;
    private double grade;
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }
    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}