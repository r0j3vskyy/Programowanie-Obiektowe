package Zestaw8;

public class ElectricCar extends Car{
    private int pojemnoscBaterii;

    public ElectricCar(String model, int pojemnoscBaterii){
        super(model);
        this.pojemnoscBaterii = pojemnoscBaterii;
    }
    public String getModel(){
        return super.getModel();
    }

    @Override
    public String toString() {
        return "Electric car: " + getModel() + ", capacity:" +pojemnoscBaterii;
    }
}
