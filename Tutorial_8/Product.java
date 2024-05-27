public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }
    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }

    public void changeNumberOfPieces (int newNumbrOfPieces) {
        if (newNumbrOfPieces >= 0) {
            this.numberOfPieces=newNumbrOfPieces;
        } else {
            System.out.println("Number can not be negative");
        }
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }


    public void displayInfo () {
        System.out.println(" ");
        System.out.print("Product name: ");
        System.out.println(getName());
        System.out.print("Price: ");
        System.out.println(getPrice());
        System.out.print("Product Code: ");
        System.out.println(getProductCode());
        System.out.print("Number of pieces: ");
        System.out.println(getNumberOfPieces());

    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getProductCode() {
        return productCode;
    }
    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public String toString() {
        return name;
    }
}