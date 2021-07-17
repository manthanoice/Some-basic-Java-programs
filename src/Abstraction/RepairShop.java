package Abstraction;

public class RepairShop {
//    public static void repairedCar(Ferrari car) {                      This is used when we don't extend car class to ferrari and audi.
//        System.out.println("Ferrari is repaired");
//    }
//    public static void repairedCar(Audi car){
//        System.out.println("Audi is repaired.");
//    }
    public static void repairedCar(Car car){        //The function to repair the cars! XD, it'll repair whichever class is passed inside it (Car car)
        System.out.println("Car is repaired.");
    }
    public static void main(String[] args) {
        Ferrari f = new Ferrari();
        Audi a = new Audi();
        repairedCar(f);
        repairedCar(a);
        f.price();
        f.repair();
    }
}
