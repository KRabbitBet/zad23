package customerPackage;

public class Customer extends Person{

    String ordersList;

    public Customer(String name, String lastName, Address address, int phoneNumber, int id) {
        super(name, lastName, address, phoneNumber, id);
    }
}