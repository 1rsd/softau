package Task1SoftkaU;
/**
 * Task week 1 Sofka U
 * Class 2: Fruit
 */
public class Fruit {
    public String name; //name fruit
    private float averageWeight;//average weight from the fruit
    private String color; //color of the fuit
    public Fruit(String name, float averageWeight, String color){
        /**
         * This is the constructor for the object fruit. It incomes the variables of type String (name and color).
         * meanwhile the variable averageWeight is a float type and the last 2 variables are private, for this reason it contains a get and set Methods
         * with the idea of assign and visualice this variables.
         */
        this.name=name;
        setAverageWeight(averageWeight);
        setColor(color);
    }
    /**
     * In this section we've the set and get methods. It's necessary for asign and obtain the information
     * from this variables
     */
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getAverageWeight() {
        return averageWeight;
    }
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
// Main Method
    public static void main(String[] args) {
        Fruit f= new Fruit("Apple",500f, "red");
        System.out.println("Fruit Name: "+f.name);
        System.out.println("Average weight of the fruit: "+f.getAverageWeight()+"g");
        System.out.println("Color fruit: "+f.getColor());
    }
}
