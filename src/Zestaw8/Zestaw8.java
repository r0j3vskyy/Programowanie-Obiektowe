package Zestaw8;

public class Zestaw8 {

    // https://pjastr.github.io/zbior-zadan-java/data/zbior2023.pdf

    public static void main(String[] args) {
        // Zadanie 1 test
        Box<String> boxS = new Box<String>();
        boxS.set("Test");
        System.out.println(boxS.get());

        Box<Integer> boxI = new Box<Integer>();
        boxI.set(12);
        System.out.println(boxI.get());

        // Zadanie 2 test
        Integer ob1 = 10;
        Integer ob2 = 20;
        Integer ob3 = 10;
        String s1 = "123";
        String s2 = "2137";
        System.out.println(Utils.isEqual(ob1, ob2));
        System.out.println(Utils.isEqual(ob1, ob3));
        System.out.println(Utils.isEqual(s1, s2));

        // Zadanie 4 test
        Triple<String, Integer, Double> osoba = new Triple<String,Integer,Double>("Tomasz", 30, 1.80);
        String imie = osoba.getFirst();
        Integer wiek = osoba.getSecond();
        Double wzrost = osoba.getThird();
        System.out.println("Osoba: " +imie+ ", wiek: " +wiek+ ", wzrost: " +wzrost);

        // Zadanie 12 test
        Integer[] array = {1, 2, 3, 4};
        for (Integer i: array){
            System.out.print(i + " ");
        }
        ArrayUtils.swap(array, 0, 2);
        for (Integer i: array){
            System.out.print(i + " ");
        }

        // Zadanie 15 test
        Integer[] ints = {3, 1, 9, 0, 2};
        Integer maxInt = Utils.maxValue(ints);
        System.out.println(maxInt);

        Float[] floats = {3.14f, 22.1f, 1.1f, 12.3f, 5.91f};
        Float maxFloats = Utils.maxValue(floats);
        System.out.println(maxFloats);

        String[] strings = {"jablko", "banan", "kiwi", "gruszka", "cebula"};
        String maxStrings = Utils.maxValue(strings);
        System.out.println(maxStrings);

        Vehicle[] vehicles = {
            new Vehicle("BMW", 250),
            new Vehicle("Ferrari", 350),
            new Vehicle("Kia", 50)
        };
        Vehicle maxVehicle = Utils.maxValue(vehicles);
        System.out.println(maxVehicle);

        // Zadanie 22 test
        Car c1 = new Car("Ford Mondeo");
        Car c2 = new Car("Audi A4");
        ElectricCar ec1 = new ElectricCar("Tesla 3", 1000);
        ElectricCar ec2 = new ElectricCar("Nie wiem", 500);

        System.out.println(Utils.compareObjects(c1, c2));
        System.out.println(Utils.compareObjects(ec1, ec2));
        System.out.println(Utils.compareObjects(c1, ec1));

        // Zadanie 24 test
        TripleBird<Eagle> eagles = new TripleBird<Eagle>(
            new Eagle("Tomasz", 5.5, 13), 
            new Eagle("Robert", 6.1, 11),
            new Eagle("Kokos", 4.7, 7)
        );
        Bird minEagle = Utils.findMin(eagles);
        System.out.println("Najmniejszy orzel: " +minEagle);

        TripleBird<Bird> mixedBirds = new TripleBird<>(
            new Bird("Riko", 3.3, 5),
            new Eagle("Rambo", 5.3, 7),
            new Bird("Bambo", 7.1, 5)
        );
        Bird minMixedBirds = Utils.findMin(mixedBirds);
        System.out.println("Najmniejszy mixed bird: " +minMixedBirds);
        // Zadanie 29 test
        Tree[] forest = {
            new Tree("Oak", 23),
            new Tree("Pine", 18),
            new Tree("Birch", 14),
            new Tree("Maple", 27),
            new Tree("Spruce", 41)
        };
        Pair<Tree> treeResult = new Pair<>(null, null);
        Utils.findMinMaxHeight(forest, treeResult);
        System.out.println("Wynik dla Pair<Tree>: " +treeResult);

        Pair<Plant> plantResult = new Pair<>(null, null);
        Utils.findMinMaxHeight(forest, plantResult);
        System.out.println("Wynik dla Pair<Plant>: " +plantResult);
    }
}
