// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BlackMamba b = new BlackMamba(22.5, "Mamba", 0.5);
        b.start();
        b.bite();
        System.out.println(b.getName() + " with length equal " + b.getLength() + " and mass equal " + b.getMass());
        b.stop();


    }
}