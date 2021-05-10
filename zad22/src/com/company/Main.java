package com.company;

import customerPackage.CustomerService;
import orderPackage.OrderService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static final String NO_MORE = "-";

    public static void main(String[] args) {

        System.out.println("Witaj użytkowniku. Za pomocą numeru, wybierz co chciałbyś zrobić, korzystając z przedstawionego menu:\n" +
                "MENU:\n" +
                "               1. Dodaj klienta\n" +
                "               2. Usuń klienta\n" +
                "               3. Edytuj klienta\n" +
                "               4. Wyświetl wszystkich klientów\n" +
                "               5. Dodaj zamówienie\n" +
                "               6. Usuń zamówienie\n" +
                "               7. Edytuj zamówienie\n" +
                "               8. Zmień status\n" +
                "               9. Wyświetl wszystkie zamówienia\n" +
                "               10. Wyświetl wszystkie zamówienia klienta\n" +
                "               0. Zakończ program \n");

        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        switch (menuNumber) {
            case 1:
                String customer;
                Set<String> customers = new HashSet<>();
                Scanner input = new Scanner(System.in);
                do {
                    System.out.println("Podaj imie: ");
                    customer = input.next();
                    if (!customer.equals(NO_MORE)) {
                        customers.add(customer);
                    }
                } while (!customer.equals(NO_MORE));


                System.out.println("Wprowadziles " + customers.size() + " unikalnych imion.");
                break;

//                CustomerService customerService = new CustomerService();
//                System.out.println(customerService.addCustomer());


            case 2:
                System.out.println("Jeżeli chcesz usunąć konto klienta, podaj jego ID.");
                break;

            case 3:
                System.out.println("Jeżeli chcesz edytować dane klienta, podaj jego ID.");
                break;

            case 4:
                System.out.println("Oto lista wszystkich klientów: ");
                break;

            case 5:
                OrderService orderService = new OrderService();
                System.out.println(orderService.addOrder());
                break;

            case 6:
                OrderService delOrder = new OrderService();
                System.out.println(delOrder.deleteOrder());
                break;

            case 7:
                OrderService edOrder = new OrderService();
                System.out.println(edOrder.editOrder());
                break;

            case 8:
                System.out.println("W celu zmiany statusu, podaj ID użytkownika.");
                break;

            case 9:
                System.out.println("Dotychczas złożone zamówienia: ");
                break;

            case 10:
                System.out.println("W celu podsumowania wszystkich zamówień klienta, podaj ID użytkownika.");
                break;

        }
    }
}