class ElectricEngine extends Engine {
    @Override
    public void increase() {
        speed += 1;
    }

    @Override
    public void decrease() {
        speed -= 1;
    }
}
