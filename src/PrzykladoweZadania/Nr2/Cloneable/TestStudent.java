package PrzykladoweZadania.Nr2.Cloneable;

public class TestStudent {
    public static void main(String[] args) {
        try {
            int[] oceny1 = {4, 3, 5, 2, 4};
            Student oryginal = new Student("Tomasz", oceny1);

            Student klon = oryginal.clone();
            oryginal.setGrade(0, 6);

            System.out.println(oryginal);
            System.out.println(klon);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
