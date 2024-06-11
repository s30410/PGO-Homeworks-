public class Item {
    private int ID;
    private String name;
    public Item (int ID, String name){
        this.ID=ID;
        this.name = name;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Item Name: " + name);
    }

    @Override
    public String toString() {
        return "Item " + name + " with ID: " + ID;
    }
}



