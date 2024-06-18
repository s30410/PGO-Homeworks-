public interface Car {
    void load(int weight, boolean isLiquid, boolean isDangerous);
    boolean canHandle(int weight, boolean isLiquid, boolean isDangerous);
    void unload();
    String getId();
    int getMaxWeight();
    int getCapacity();

    //I extend the interface so that we are able to check whether the car is dangerous
    boolean isDangerous();
}
