package Zestaw8;

public class TripleBird<T> {
    private T first;
    private T second;
    private T third;

    public TripleBird(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public T getFirst() { return first;}
    public T getSecond() {return second;}
    public T getThird() {return third;}
}
