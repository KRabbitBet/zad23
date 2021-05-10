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
    int id;
    private static int count;
    public String addCustomer() {
        this.customer=customer;
        count++;
        id=count;

        System.out.println("Aby utworzyć nowego klienta, podaj dane w kolejności: imię, nazwisko, adres, numer telefonu. Wpisywanie zakończ znakiem  - ");

        List<String> listOfCustomer = new ArrayList<>();
        Set<List<String>> humanData = new HashSet<>();
        Scanner input = new Scanner(System.in);
        do {
            listOfCustomer = new ArrayList();
            if (!listOfCustomer.equals(SMTH_WRONG)) {
                humanData.add(listOfCustomer);
            }
        } while (!listOfCustomer.equals(SMTH_WRONG));


        System.out.println("Konto nowego klienta zostało utworzone, przypisane ID: ");

        return null;
    }

}