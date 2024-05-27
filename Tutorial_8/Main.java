import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User guest1 = new User("guest1@pjwstk.edu.pl");
        User guest2 = new User("guest2@pjwstk.edu.pl");

        guest1.convertToUser("Tytan", "Nerozymnyi", "******");

        User user1 = new User("Levi", "Akerman", "leviaker@pjwstk.edu.pl", "chefirLublu");

        Product product1 = new Product("Sweets", 2, "sw1234");
        product1.displayInfo();
        Product product2 = new Product("Shirt", 80, "sh1234", 10);
        product2.displayInfo();
        Product product3 = new Product("T-Shirt", 60, "ts1234", 30);
        product3.displayInfo();
        Product product4 = new Product("Coat", 200, "ct1234", 8);
        product4.displayInfo();
        Product product5 = new Product("Scarf", 40, "sc1234", 30);
        product5.displayInfo();
        Product product6 = new Product("Pants", 70, "pt1234", 40);
        product6.displayInfo();
        Product product7 = new Product("Trousers", 80, "tr1234", 20);
        product7.displayInfo();
        Product product8 = new Product("Cloak", 100, "сд1234", 40);
        product8.displayInfo();
        Product product9 = new Product("Hat", 15, "ht1234",30);
        product9.displayInfo();
        Product product10 = new Product("Boots", 60, "tr1234", 40);
        product10.displayInfo();
        Product product11 = new Product("Shoes", 60, "tr1234", 30);
        product11.displayInfo();

        product1.changePrice(2);
        product2.changeNumberOfPieces(15);

        Category c1 = new Category();
        c1.addProduct(product1);
        c1.removeProduct(product1);
        c1.displayInfo();

        Category c2 = new Category("Formal");
        c2.addProduct(product2);
        c2.addProduct(product4);
        c2.addProduct(product5);
        c2.addProduct(product7);
        c2.addProduct(product9);
        c2.addProduct(product11);
        c2.displayInfo();

        Category c3 = new Category("Work");
        c3.addProduct(product3);
        c3.addProduct(product5);
        c3.addProduct(product6);
        c3.addProduct(product8);
        c3.addProduct(product10);
        c3.displayInfo();

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(product3);
        cart1.addProduct(product4);
        cart1.displayCartInfo();
        cart1.pay();

        ShoppingCart cart2 = new ShoppingCart(user1);
        cart2.addProduct(product5);
        cart2.addProduct(product6);
        cart2.removeProduct(product5);
        cart2.displayCartInfo();
        cart2.pay();

        List<Product> initialProducts = new ArrayList<>();
        initialProducts.add(product1);
        initialProducts.add(product2);

        ShoppingCart cart3 = new ShoppingCart(user1, initialProducts);
        cart3.displayCartInfo();
        cart3.pay();
    }
}