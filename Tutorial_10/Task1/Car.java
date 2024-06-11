class Car implements Comparable<Car>{
    private String carModel;
    private int yearManufactured;

    public Car (String carModel, int yearManufactured) {
        this.carModel =carModel;
        this.yearManufactured = yearManufactured;

    }

    public int getYearManufactured () {
        return yearManufactured;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.yearManufactured, otherCar.yearManufactured);
    }

    public String toString( ) {
        return "Car " + "model name " + carModel + " year of manufacture " + yearManufactured;
    }






}
