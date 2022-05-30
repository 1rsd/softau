package Task1SoftkaU;

/**
 * Task week 1 Sofka U
 * Class 5: Office
 */

public class Office {
    public int officeId; //Office Id
    private String nameOffice; //Name of the office
    protected String address; //Address of the office
    public Office(int officeId, String nameOffice, String address) {
        //Constructor from the object Office
        this.officeId = officeId;
        setNameOffice(nameOffice);
        this.address = address;
    }
        /**
         * This is the constructor for the object car. It incomes the variables (in majority) String and a int variable
         */
    public String getNameOffice() {
        return nameOffice;
    }
    public void setNameOffice(String nameOffice) {
        this.nameOffice = nameOffice;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
//main method
    public static void main(String[] args) {
    Office o= new Office(5, "Medellin", "Kr 5 #24-100 Sur");
    System.out.println("Id Office: "+o.officeId);
    System.out.println("Name office: "+o.getNameOffice());
    System.out.println("Address Office: "+o.getAddress());

}
}
