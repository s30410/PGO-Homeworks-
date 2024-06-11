import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Pen"));
        items.add(new Item(2, "Phone"));
        items.add(new Item(3, "Laptop"));
        items.add(new Item(4, "Notebook"));
        items.add(new Item(5, "Bottle"));


        items.add(new Item(6, "Mouse"));
        items.add(new Item(7, "Laptop charger"));
        items.add(new Item(8, "Phone charger"));
        items.add(new Item(9, "Pencil"));
        items.add(new Item(10, "Marker"));
        items.add(new Item(11, "Headphones"));
        items.add(new Item(12, "Bag"));
        items.add(new Item(13, "Power bank"));
        items.add(new Item(14, "Documents"));
        items.add(new Item(15, "Flash Drive"));


        List<Item> subListItems = items.subList(0, 5);


        Set<Item> itemSet = new HashSet<>(subListItems);

        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}


