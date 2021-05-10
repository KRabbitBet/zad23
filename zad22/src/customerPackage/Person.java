package customerPackage;


public class Person {

    private String name;
    private String lastName;
    private Address address;
    private int phoneNumber;
    private int id;

    public Person(String name, String lastName, Address address, int phoneNumber, int id){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getName () {
        return name;
    }
    public String getLastName () {
        return lastName;
    }
    public Address getAddress () {
        return address;
    }
    public int getPhoneNumber () {
        return phoneNumber;
    }
    public int getId (){ return id;}
}