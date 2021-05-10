package customerPackage;

 class Customer extends Person{

    private String ordersList;
    int id;
    private static int count;
    public Customer(ordersList) {
        this.ordersList = ordersList;
        count++;
        id = count;
    }

    public Customer(String name, String lastName, int phoneNumber, int id, String city, String street, int streetNumber, int flatNumber, int postCode) {
        super(name, lastName, phoneNumber, id, city, street, streetNumber, flatNumber, postCode);
    }
}