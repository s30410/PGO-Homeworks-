import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List <Product> productList;

    public Category () {
        this.productList=new ArrayList<>();
    }

    public Category (String name) {
        this.name=name;
        this.productList=new ArrayList<>();
    }

    public Category(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public void addProduct (Product product) {
        productList.add(product);

    }

    public void removeProduct (Product product) {
        productList.remove(product);

    }

    public void displayInfo () {
        System.out.println(" ");
        System.out.println("Category name: ");
        System.out.println(getName());
        System.out.println("Product list: ");
        System.out.println(getProductList());
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }





}
