
public class Main {
    public static void main(String[] args) {

        User guest1 = new User("guest1@pjwstk.edu.pl");
        User guest2 = new User("guest2@pjwstk.edu.pl");

        guest1.convertToUser("Tytan", "Nerozymnyi", "******");

        User user1 = new User("Levi", "Akerman", "leviaker@pjwstk.edu.pl", "chefirLublu");


        Product product1 = new Product("Sword", 120, "sw1234");
        Product product2 = new Product("Gas", 80, "gs1234");
        Product product3 = new Product("Сloak", 50, "ck1234", 1);

        product1.changePrice(100);

        product2.changeNumberOfPieces(5);



    }
}