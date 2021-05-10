package customerPackage;


public class Person {

    private String name;
    private String lastName;
    private int phoneNumber;
    private int id;
    String city;
    String street;
    int streetNumber;
    int flatNumber;
    int postCode;

    public Person(String name, String lastName, int phoneNumber, int id, String city, String street, int streetNumber, int flatNumber, int postCode) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.postCode = postCode;
    }


    public String getName () {
        return name;
    }
    public String getLastName () {
        return lastName;
    }
    public int getPhoneNumber () {
        return phoneNumber;
    }
    public int getId () {
        return id;
    }

    public String getCity () {
        return city;
    }
    public String getStreet () {
        return street;
    }
    public int getStreetNumber () {
        return streetNumber;
    }
    public int getFlatNumber () {
        return flatNumber;
    }
    public int getPostCode (){
        return postCode;
    }


}