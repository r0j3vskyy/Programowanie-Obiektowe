package Zestawy2026.Zestaw;
//package railway;

public class TestTrain {
    public static void main(String[] args) {
        int[] initialTimes = {830, 1015, 1245, 1500, 1820};
        Train originalTrain = new Train("Intercity Sobieski", initialTimes);
        Train clonedTrain = originalTrain.clone();
        originalTrain.setDepartureTime(0, 700);
        System.out.println("Oryginał: " + originalTrain);
        System.out.println("Klon:     " + clonedTrain);
    }
}