package Zestaw4;

public class Trojkat {
    double a=0;
    double b=0;
    double c=0;

    public Trojkat(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obwod(){
        return a+b+c;
    }

    public double pole(){
        double p = obwod()/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        
    }
}
