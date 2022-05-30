package Task1SoftkaU;

/**
 * Task week 1 Sofka U
 * Class 6: Product
 */


public class Product {
    public String name;//name of the product
    private double sku; //the number of the barcode
    protected float price; //how much this product
    private float weight; //weight of the product
    public int AvQuantity; //Available quantity of the product on inventary
    
    public Product(String name, double sku, float price, float weight, int avQuantity) {
        //Constructor from the object Product
        this.name = name;
        setSku(sku);
        this.price = price;
        setWeight(weight);
        AvQuantity = avQuantity;
    }
    // set and get method
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getSku() {
        return sku;
    }

    public void setSku(double sku) {
        this.sku = sku;
    }
    //main method
public static void main(String[] args) {
    Product p= new Product("Potato Chips",7745324552d,5500f, 250f, 500);
    System.out.println("Old price: $"+p.getPrice()); //Show the initial price that with our object it was created
    p.setPrice(6000f); //inicialice a new price to our object p
    System.out.println("New price: $"+p.getPrice());  //Show the new price assigned for us.

}
}
