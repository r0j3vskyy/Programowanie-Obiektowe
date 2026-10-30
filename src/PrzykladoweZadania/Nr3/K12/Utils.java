package PrzykladoweZadania.Nr3.K12;

public class Utils {
    public static <T> void echoIfEquivalent(T arg1, T arg2, T arg3){
        if (arg1.equals(arg2) && arg1.equals(arg3) && arg2.equals(arg3))
            System.out.println("Wszystkie trzy są równoważne");
    }


    public static void main(String[] args) {
        Student s1 = new Student("Robert", 15);
        Student s2 = new Student("Tomasz", 16);
        Student s3 = new Student("Natalia", 15);
        Student s4 = new Student("Micha?", 15);

        Utils.echoIfEquivalent(s1, s2, s3);
        Utils.echoIfEquivalent(s1, s3, s4);
    }
}
