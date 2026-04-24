class CarFactory {
    public Car createCar(String type) {
        Engine engine = createEngine(type);
        return new Car(engine);
    }

    public void replaceEngine(Car car, String type) {
        Engine engine = createEngine(type);
        car.setEngine(engine);
        System.out.println("Engine replaced with: " + type);
    }

    private Engine createEngine(String type) {
        if (type.equalsIgnoreCase("gas")) {
            return new GasEngine();
        } else if (type.equalsIgnoreCase("electric")) {
            return new ElectricEngine();
        } else if (type.equalsIgnoreCase("hybrid")) {
            return new HybridEngine();
        }
        return null;
    }
}
