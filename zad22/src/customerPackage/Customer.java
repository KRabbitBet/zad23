package customerPackage;

public class Customer extends Person{

    String id;
    String ordersList;

    public Customer(String name, String lastName, Address address, int phoneNumber) {
        super(name, lastName, address, phoneNumber);
    }
}