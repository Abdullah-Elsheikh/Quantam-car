class HybridEngine extends Engine {
    private GasEngine gasEngine;
    private ElectricEngine electricEngine;
    private Engine currentEngine;

    public HybridEngine() {
        gasEngine = new GasEngine();
        electricEngine = new ElectricEngine();
        currentEngine = electricEngine;
    }

    public void checkEngineSwitch(int targetSpeed) {
        if (targetSpeed < 50) {
            if (currentEngine != electricEngine) {
                electricEngine.speed = gasEngine.speed;
                currentEngine = electricEngine;
                System.out.println("(Hybrid) Switched to Electric Engine");
            }
        } else {
            if (currentEngine != gasEngine) {
                gasEngine.speed = electricEngine.speed;
                currentEngine = gasEngine;
                System.out.println("(Hybrid) Switched to Gas Engine");
            }
        }
    }

    @Override
    public void increase() {
        currentEngine.increase();
        this.speed = currentEngine.getSpeed();
    }

    @Override
    public void decrease() {
        currentEngine.decrease();
        this.speed = currentEngine.getSpeed();
    }
}
