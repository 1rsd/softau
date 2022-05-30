package Task1SoftkaU;

/**
 * Task week 1 Sofka U
 * Class 1: Person
 */
public class Person{
    private String name; // person name
    private String lastName1;// person first last name 
    private String lastName2;// person second last name
    public String dateBirth; // person date birth
    protected float height;  //person height

    public Person() {
        /**
         * This is the constructor for the object person. It incomes the variables of type String (name, 
         * lastname1, lastname 2 and dateBirth and a variable of type float height).
         * But, almost all the variables are private or protected, for this reason it contains a get and set Methods
         * with the idea of assign and visualice this variables.
         * This object it was builded like empty with the finality from show the set methods
         */
        setName(name);
        setLastName1(lastName1);
        setLastName2(lastName2);
        this.dateBirth = dateBirth;
        setHeight(height);;
    }
    /**
     * In this section we've the set and get methods. It's necessary for asign and obtain the information
     * from this variables
     */
    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
 //Main Method
    public static void main(String[] args) {
        //Creating a object of type Person
        Person p=new Person();
        p.setName("Abelardo");
        p.setLastName1("Quintero");
        p.setLastName2("Perez");
        p.dateBirth="2010-10-10";
        p.setHeight(1.60f);
        //Showing information in console like name, datebirth and height
        System.out.println("Your name is: "+p.getName()+" "+p.getLastName1()+" "+p.getLastName2());
        System.out.println("Your Date birth is: " + p.dateBirth);
        System.out.println("And your height is: "+p.getHeight()+"m");
    }
}

