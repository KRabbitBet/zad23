package customerPackage;


public class Person {

    private String name;
    private String lastName;
    private Address address;
    private int phoneNumber;

    public Person(String name, String lastName, Address address, int phoneNumber){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
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
}