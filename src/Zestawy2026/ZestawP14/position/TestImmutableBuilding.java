package Zestawy2026.ZestawP14.position;

public class TestImmutableBuilding {
    public static void main(String[] args) {
        ImmutableBuilding build1 = new ImmutableBuilding(150, "Warszawska 100", 5);
        System.out.println(build1);
        ImmutableBuilding build2 = build1.update(5.0, " New Ave", 2);
        System.out.println(build2);
    }
}
