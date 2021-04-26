package customerPackage;

import java.util.*;
/* - dodawanie,
 - usuwanie(po id),
 - edytowanie(po id),
 - wyświetlanie wszystkich
*/

public class CustomerService {

    public static final String SMTH_WRONG = "-";

    public String addCustomer() {
        System.out.println("Aby utworzyć nowego klienta, podaj dane w kolejności: imię, nazwisko, adres, numer telefonu.");

        List<String> listOfCustomer = new ArrayList<>();
        Set<List<String>> humanData = new HashSet<>(4);
        Scanner input = new Scanner(System.in);
        do {
            listOfCustomer = new ArrayList(4);
            if (!listOfCustomer.equals(SMTH_WRONG)) {
                humanData.add(listOfCustomer);
            }
        } while (!listOfCustomer.equals(SMTH_WRONG));


        System.out.println("Konto nowego klienta zostało utworzone, wybierz swoje ID w formie liczby z przedziału 1-20.");
        Scanner id = new Scanner(System.in);
        int newId = id.nextInt();
        if (newId > 0 && newId < 21) {

            System.out.println("Twoje ID to: " + newId + ".");
        } else {
            System.out.println("Podana liczba wykracza poza ramy przedziału, zacznij od nowa.");
        }
         return null;
    }

}