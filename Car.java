class Car {
    private Engine engine;
    private int speed;
    private boolean isRunning;

    public Car(Engine engine) {
        this.engine = engine;
        this.speed = 0;
        this.isRunning = false;
    }

    public void start() {
        speed = 0;
        isRunning = true;
        System.out.println("Engine started.");
    }

    public void stop() {
        if (speed == 0) {
            isRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Cannot stop, speed is not 0.");
        }
    }

    public void accelerate() {
        if (!isRunning) return;
        
        speed += 20;
        if (speed > 200) {
            speed = 200;
        }
        System.out.println("Car accelerated to " + speed + " km/h");
        adviseEngine();
    }

    public void brake() {
        if (!isRunning) return;
        
        speed -= 20;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Car braked to " + speed + " km/h");
        adviseEngine();
    }

    public void setEngine(Engine newEngine) {
        this.engine = newEngine;
        if (isRunning) {
            adviseEngine();
        }
    }

    private void adviseEngine() {
        if (engine instanceof HybridEngine) {
            ((HybridEngine) engine).checkEngineSwitch(this.speed);
        }
        
        while (engine.getSpeed() < this.speed) {
            engine.increase();
        }
        while (engine.getSpeed() > this.speed) {
            engine.decrease();
        }
    }
}
