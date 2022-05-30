package Task1SoftkaU;
/**
 * Task week 1 Sofka U
 * Class 4: Car
 */
public class Car {
    public String brand; //brand car
    private String reference; //reference car
    protected int model; //model car
    protected String carLicense; //A mix of letters and numbers emited by a governmental entity
    private int motor; //capacity of the motor

    public Car(String brand, String reference, int model, String carLicense, int motor) {
        /**
         * This is the constructor for the object car. It incomes the variables (in majority) String and a int variable
         */
        this.brand = brand;
        setReference(reference);
        setModel(model);;
        setCarLicense(carLicense);;
        setMotor(motor);
    }
    /**
     * In this section we've the set and get methods. It's necessary for asign and obtain the information
     * from this variables
     */
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setCarLicense(String carLicense) {
        this.carLicense=carLicense;
    }
    public String getCarLicense() {
        return carLicense;
    }
    public void setModel(int model) {
        this.model=model;
    }
    public int getModel() {
        return model;
    }

    //main method
    public static void main(String[] args) {
        Car c= new Car("Kia", "Picanto", 2010, "XYA721", 1600);
        System.out.println("brand: "+c.brand);
        System.out.println("Reference: "+c.getReference());
        System.out.println("Model: "+c.getModel());
        System.out.println("Car License:"+c.getCarLicense());

    }
}
