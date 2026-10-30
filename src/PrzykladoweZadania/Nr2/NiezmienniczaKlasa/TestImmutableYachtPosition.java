package PrzykladoweZadania.Nr2.NiezmienniczaKlasa;

public class TestImmutableYachtPosition {
    public static void main(String[] args) {
        ImmutableYachtPosition yacht = new ImmutableYachtPosition(15.4, 13.8, 11.4);
        ImmutableYachtPosition yacht2 = yacht.move(1, 2, 3);
        System.out.println("yacht1: " +yacht);
        System.out.println("yacht2: " +yacht2);
    }
}
