import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList;
    private User user;

    // Default constructor
    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    // Constructor with User parameter
    public ShoppingCart(User user) {
        this.user = user;
        this.productList = new ArrayList<>();
    }

    // Constructor with User and productList parameters
    public ShoppingCart(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    // Add product to the cart
    public void addProduct(Product product) {
        if (product.getNumberOfPieces() > 0) {
            this.productList.add(product);
            product.changeNumberOfPieces(product.getNumberOfPieces() - 1);
        } else {
            System.out.println("Cannot add product. Not enough stock.");
        }
    }

    // Remove product from the cart
    public void removeProduct(Product product) {
        if (this.productList.remove(product)) {
            product.changeNumberOfPieces(product.getNumberOfPieces() + 1);
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    // Calculate total price of products in the cart
    public double pay() {
        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
        return totalPrice;
    }

    // Display cart info
    public void displayCartInfo() {
        System.out.println(" ");
        System.out.println("Shopping Cart Info:");
        if (user != null) {
            System.out.println("User: " + user.getEmail());
        } else {
            System.out.println("No user assigned to this cart.");
        }
        System.out.println("Products in the cart:");
        for (Product product : productList) {
            product.displayInfo();
        }
    }
}