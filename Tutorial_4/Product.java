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
}
