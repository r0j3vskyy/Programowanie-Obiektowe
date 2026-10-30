package PrzykladoweZadania.Nr2.StaticNonStatic;

public class TestBuildingMaterial {
    public static void main(String[] args) {
        BuildingMaterial mat = new BuildingMaterial("kamien", "10", 150);
        BuildingMaterial mat2 = new BuildingMaterial("kwarc", "15", 80);

        System.out.println(mat.isSufficientQuantity());
        System.out.println(BuildingMaterial.isSufficientQuantity(mat2));
    }
}
