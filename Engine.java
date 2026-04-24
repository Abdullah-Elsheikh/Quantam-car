abstract class Engine {
    protected int speed = 0;

    public abstract void increase();
    public abstract void decrease();

    public int getSpeed() {
        return speed;
    }
}
