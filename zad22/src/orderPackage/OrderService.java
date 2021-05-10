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

//    public static final String SMTH_WRONG = "-";

    public String addOrder() {


        List<String> listOfOrder = new ArrayList<>();
        Set<List<String>> orderData = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int[] order = new int[1];
        System.out.println("Złóż zamówienie.");
//        do {
        for(int i=0; i< listOfOrder.size(); i++){
            order[i]= input.nextInt();
        }
            for (int i : order){
                System.out.println("Zamówienie przyjęte, aktualny status: " + OrderStatus.UTWORZONE + ". Podaj ID użytkownika.");
            }
 //           if (!listOfOrder.equals(SMTH_WRONG)) {
 //               orderData.add(listOfOrder);
 //           }
 //       } while (!listOfOrder.equals(SMTH_WRONG));
//        input.close();

//        System.out.println("Zamówienie przyjęte, aktualny status: " + OrderStatus.UTWORZONE + ". Podaj ID użytkownika.");
        Scanner id = new Scanner(System.in);
        int newId = id.nextInt();
        if (newId > 0 && newId < 21) {
            System.out.println("Twoje ID przypisane do zamówienia: " + newId + ".");
        } else {
            System.out.println("Podane ID jest nieprawidłowe, zacznij od nowa.");
        }

        return null;
    }

    public String deleteOrder() {
        System.out.println("W celu usunięcia zamówienia, podaj ID użytkownika.");

        Scanner id = new Scanner(System.in);
        int newId = id.nextInt();
        if (newId > 0 && newId < 21) {
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
}