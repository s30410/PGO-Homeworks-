public class Parallelogram implements Figure{
    public final double baseSide;
    public final double height;
    public final double side;

    public Parallelogram (double baseSide, double height,double side) {
        this.baseSide = baseSide;
        this.height = height;
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        return 2 * (baseSide + side);
    }

    @Override
    public double getArea() {
        return baseSide * height;
    }
}
