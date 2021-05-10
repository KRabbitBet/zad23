package orderPackage;

/*  - dodawanie V
 - usuwanie (po id) V
 - edytowanie (po id),
 - wyświetlanie wszystkich,
 - wyświetlanie wszystkich przypisanych do danego klienta (po id klienta),
 - zmiana statusu (po id)
*/

import java.util.*;

public class OrderService {

    public static final String SMTH_WRONG = "-";

    public String addOrder() {
        System.out.println("Złóż zamówienie, po zakończeniu zamówienia dopisz znak -");

        List<String> listOfOrder = new ArrayList<>();
        Set<List<String>> orderData = new HashSet<>();
        Scanner input = new Scanner(System.in);
        do {
            listOfOrder = new ArrayList();
            if (!listOfOrder.equals(SMTH_WRONG)) {
                orderData.add(listOfOrder);
            }
        } while (!listOfOrder.equals(SMTH_WRONG));


        System.out.println("Zamówienie przyjęte, aktualny status: ");

        return null;
    }


    public String deleteOrder() {
        System.out.println("W celu usunięcia zamówienia, podaj ID użytkownika.");

        Scanner id = new Scanner(System.in);
        int newId = id.nextInt();
        if (newId > 0 && newId < 21) {
            final boolean remove = orderData.remove(deleteOrder());
            System.out.println("Twoje zamówienie przypisane do numeru ID: " + newId + " obecnie posiada status: " + OrderStatus.ANULOWANE + ".");
        } else {
            System.out.println("Podane ID jest nieprawidłowe, zacznij od nowa.");
        }

        return null;
    }


    public String editOrder() {
        System.out.println("W celu edytowania zamówienia, podaj ID użytkownika.");

        Scanner id = new Scanner(System.in);
        int newId = id.nextInt();
        if (newId > 0 && newId < 21) {
            System.out.println("Zamówienie przypisane do ID: " + newId + " to: " + " posiada status: " + OrderStatus.OPLACONE + ". Na co chcesz zamienić obecne zamówienie?");
            Scanner edit = new Scanner(System.in);
            String editOrder = edit.next();
            if (editOrder != null) {
                System.out.println("Twoje zamówienie zostało edytowane na: " + editOrder + " i zmieniło swój status na: " + OrderStatus.UTWORZONE);
            } else {
                System.out.println("Podane ID jest nieprawidłowe, zacznij od nowa.");
            }
        }
        return null;
    }


    public String allOrders() {
        System.out.println("Dotychczas złożone zamówienia: " + orderData);
        return null;
    }


}