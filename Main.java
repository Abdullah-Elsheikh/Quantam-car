//main 
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        System.out.println(" Testing Gas Car ");
        Car gasCar = factory.createCar("gas");
        gasCar.start();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();

        System.out.println("\nTesting Hybrid Car ");
        Car hybridCar = factory.createCar("hybrid");
        hybridCar.start();
        hybridCar.accelerate(); 
        hybridCar.accelerate(); 
        hybridCar.accelerate(); 
        hybridCar.brake(); 
        hybridCar.brake(); 
        hybridCar.brake(); 
        hybridCar.stop();

        System.out.println("\n Testing Replace Engine ");
        factory.replaceEngine(hybridCar, "electric");
        hybridCar.start();
        hybridCar.accelerate();
        hybridCar.brake();
        hybridCar.stop();
    }
}
