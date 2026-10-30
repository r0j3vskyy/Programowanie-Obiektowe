package Zestaw8;

public class Bird implements Comparable<Bird>{
    private String name;
    private double weight;
    private int age;

    public Bird(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    @Override
    public int compareTo(Bird other){
        return Double.compare(this.weight, other.weight);
    }
    @Override
    public String toString(){
        return "Bird: " +name+ "(weight: " +weight+ ", age: " +age+ ")";
    }
}
