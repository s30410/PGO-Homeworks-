import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Pen"));
        items.add(new Item(2, "Phone"));
        items.add(new Item(3, "laptop"));
        items.add(new Item(4, "Notebook"));
        items.add(new Item(5, "Bottle"));

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            item.show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getID(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

}
