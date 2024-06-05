public abstract class Snake {
    public final double length;
    public final String name;
    public final double mass;

    public Snake (double length, String name, double mass) {
        this.length=length;
        this.name=name;
        this.mass=mass;

    }

    public abstract String getName();
    public abstract double getLength();
    public abstract double getMass();

}
