package PrzykladoweZadania.Nr2.StaticNonStatic;

public class BuildingMaterial {
    private String materialType;
    private String qualityGrade;
    private int quantityInStock;

    public BuildingMaterial(String materialType, String qualityGrade, int quantityInStock){
        this.materialType = materialType;
        this.qualityGrade = qualityGrade;
        this.quantityInStock = quantityInStock;
    }
    public String getMaterialType() {
        return materialType;
    }
    public String getQualityGrade() {
        return qualityGrade;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public static boolean isSufficientQuantity(BuildingMaterial material){
        if (material == null)
            return false;
        if (material.quantityInStock > 100)
            return true;
        return false;
    }
    public boolean isSufficientQuantity(){
        if (this.quantityInStock > 100)
            return true;
        return false;
    }
}
