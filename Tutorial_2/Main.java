public class Main {
    public static void main(String[] args) {
        int age = 30;
        boolean isThursday = true;
        String city = "Warsaw";
        double discount = GetDiscount(age, city, isThursday);
        double ticket_price = GetTicketPrice(discount);

        System.out.println("Data: " + city + ", " + age + " years old, " + "weekday Ticket price: " + ticket_price);
        System.out.println("Discount: " + (discount*100) + "%" );
    }
    public static double GetTicketPrice(double discount){
        double ticket_price = 40;

        if (discount == 1.0){
            ticket_price = 0;
        }

        if (discount > 0 ) {
            ticket_price = ticket_price - (ticket_price * discount);
        }
        return ticket_price;

    }
    public static double GetDiscount (int age, String city, boolean isThursday) {
        if (age < 10 ) return 1;
        if (isThursday) return 1;

        double discount = 0;
        if (age<=18) {
            discount = 0.5;
        }
        if (city.equals("Warsaw")) {
            discount = discount + 0.1;
        }
        return discount;
    }
}