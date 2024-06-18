import java.util.ArrayList;

public class Train {

    private String id;
    private String model;
    private double maxSpeed;
    private int weight;
    private int productionYear;

    private ArrayList<Car> cars=new ArrayList<Car>();

    public Train(String id, String model) {
        setId(id);
        setModel(model);
    }

    public Train(String id, String model, double maxSpeed, int weight, int productionYear) {
        setId(id);
        setModel(model);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setProductionYear(productionYear);
    }

    public void addCar(Car car){
        if(this.cars.size()== MaxCarNumber()){
            throw new IllegalArgumentException("Cannot add more cars");
        }

        if(cars.size()>0 && cars.get(cars.size()-1).isDangerous() &&
                !car.isDangerous()){
            throw new IllegalArgumentException("There are already cars for dangerous objects added as the last element");
        }

        this.cars.add(car);
    }

    public void removeCar(String id){
        Car c=findCar(id);

        if(c==null){
            throw new IllegalArgumentException("Car was not found");
        }

        this.cars.remove(c);
    }

    public void loadCargo(int weight, boolean isLiquid, boolean isDangerous){
        for(Car c : cars){
            if(c.canHandle(weight, isLiquid, isDangerous)){
                c.load(weight, isLiquid, isDangerous);
                return;
            }
        }

        throw new IllegalArgumentException("We do not have any car that would be suitable for this cargo");
    }

    private Car findCar(String id){
        for(Car c : this.cars){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    private static int MaxCarNumber() {
        return 200;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id==null){
            throw new IllegalArgumentException("Id cannot be null");
        }
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null){
            throw new IllegalArgumentException("Model cannot be null");
        }
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if(maxSpeed<0 || maxSpeed>1000){
            throw new IllegalArgumentException("Speed has to be between 0 and 1000");
        }
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight<0){
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weight = weight;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if(productionYear<0){
            throw new IllegalArgumentException("Production year cannot be less than zero");
        }
        this.productionYear = productionYear;
    }
}
