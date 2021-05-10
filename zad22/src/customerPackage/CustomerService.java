package customerPackage;

import java.util.*;
/* - dodawanie,
 - usuwanie(po id),
 - edytowanie(po id),
 - wyświetlanie wszystkich
*/

public class CustomerService {

    public static final String SMTH_WRONG = "-";
    private String customer;

    public String addCustomer() {

        System.out.println("Aby utworzyć nowego klienta, podaj dane w kolejności: imię, " +
                "nazwisko, numer telefonu oraz dane adresowe: miasto, ulica, " +
                "numer domu i mieszkania, kod pocztowy. \nWpisywanie zakończ znakiem  - ");

        List<String> listOfCustomer = new ArrayList<>();
        Set<List<String>> humanData = new HashSet<>();
        Scanner input = new Scanner(System.in);
        do {
            listOfCustomer = new ArrayList();
            if (!listOfCustomer.equals(SMTH_WRONG)) {
                humanData.add(listOfCustomer);
            }
        } while (!listOfCustomer.equals(SMTH_WRONG));

        String customer;
        int id;
        private static int count;
        public CustomerService(String customer){
            this.customer = customer;
            id++;
            id=count;
        }

        public String toString(){
            customerinfo+=customer+"Konto nowego klienta zostało utworzone, przypisane ID: "+id+"\n";
            return customerinfo;
        }


        System.out.println("Konto nowego klienta zostało utworzone, przypisane ID: ");

        return null;
    }

}