import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getTicketPrice() {
        double discount=0;
        double ticket_price=Main.GetTicketPrice(discount);;
        Assertions.assertEquals(40, ticket_price);
    }

    @org.junit.jupiter.api.Test
    void getTicketPrice2() {
        double discount=1;
        double ticket_price=Main.GetTicketPrice(discount);;
        Assertions.assertEquals(0, ticket_price);
    }

    @org.junit.jupiter.api.Test
    void getTicketPrice3() {
        double discount = 0.5;
        double ticket_price = Main.GetTicketPrice(discount);
        Assertions.assertEquals(20, ticket_price);
    }

    @Test
    void getDiscount() {
        int age = 9;
        boolean isThursday = false;
        String city = "Warsaw";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(1, discount);

    }

    @Test
    void getDiscount1() {
        int age = 10;
        boolean isThursday = true;
        String city = "Warsaw";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(1, discount);

    }

    @Test
    void getDiscount2() {
        int age = 18;
        boolean isThursday = false;
        String city = "Warsaw";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(0.6, discount);

    }

    @Test
    void getDiscount3() {
        int age = 18;
        boolean isThursday = false;
        String city = "Krakow";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(0.5, discount);

    }

    @Test
    void getDiscount4() {
        int age = 18;
        boolean isThursday = true;
        String city = "Krakow";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(1, discount);

    }

    @Test
    void getDiscount5() {
        int age = 30;
        boolean isThursday = false;
        String city = "Warsaw";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(0.1, discount);

    }

    @Test
    void getDiscount6() {
        int age = 30;
        boolean isThursday = true;
        String city = "Warsaw";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(1, discount);

    }

    @Test
    void getDiscount7() {
        int age = 30;
        boolean isThursday = false;
        String city = "Krakow";
        double discount = Main.GetDiscount(age, city, isThursday);
        Assertions.assertEquals(0, discount);

    }
}