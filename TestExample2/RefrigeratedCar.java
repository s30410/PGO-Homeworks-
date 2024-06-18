import java.util.Objects;

public class RefrigeratedCar implements Car {

    private String id;
    private int weight;
    private boolean isLiquid;
    private  boolean isDangerous;
    private int maxWeight=10000;
    private int maxCapacity;
    private int temp;

    public RefrigeratedCar(String id, int temp, int weight, boolean isLiquid, boolean isDangerous, int maxWeight, int maxCapacity) {
        setId(id);
        setTemp(temp);
        setWeight(weight);
        setLiquid(isLiquid);
        setDangerous(isDangerous);
        setMaxWeight(maxWeight);
        setMaxCapacity(maxCapacity);
    }

    public RefrigeratedCar(String rc1, int temp, int weight) {
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMaxWeight(int maxWeight) {
        if(maxWeight<0){
            throw new IllegalArgumentException("Max weight cannot be less than zero");
        }
        this.maxWeight = maxWeight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        if(maxCapacity<0){
            throw new IllegalArgumentException("Max capacity cannot be less than zero");
        }
        this.maxCapacity = maxCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight<0){
            throw new IllegalArgumentException("Max capacity cannot be less than zero");
        }

        if(weight>maxWeight){
            throw new IllegalArgumentException("Car cannot weight more than max weight");
        }
        this.weight = weight;
    }

    public boolean isLiquid() {
        return isLiquid;
    }

    public void setLiquid(boolean liquid) {
        isLiquid = liquid;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    @Override
    public void load(int weight, boolean isLiquid, boolean isDangerous) {
        if(!canHandle(weight, isLiquid, isDangerous)){
            throw new IllegalArgumentException("Car cannot handle this cargo");
        }

        this.weight+=weight;
    }

    @Override
    public boolean canHandle(int weight, boolean isLiquid, boolean isDangerous) {
        if(this.weight+weight>maxWeight){
            throw new IllegalArgumentException("Cargo is too heavy");
        }

        if(isLiquid){
            throw new IllegalArgumentException("Car cannot contain liquid cargo");
        }

        if(isDangerous){
            throw new IllegalArgumentException("Car cannot contain dangerous cargo");
        }

        return true;
    }

    @Override
    public void unload() {
        this.weight=0;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public int getCapacity() {
        return maxCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RefrigeratedCar that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
