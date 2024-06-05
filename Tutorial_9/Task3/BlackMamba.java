import java.util.SortedMap;

public class BlackMamba extends  Snake implements Poisonous, Moveble{
    public BlackMamba(double length, String name, double mass) {
        super(length, name, mass);
    }

    @Override
    public void start() {
        System.out.println(getName() + " starts");

    }

    @Override
    public void stop() {
        System.out.println(getName()+ " stops");

    }

    @Override
    public void bite() {
        System.out.println(getName()+ " bites");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getMass() {
        return mass;
    }
}
