package Week_1.in_class;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ConsoleShoppingCart {
    Scanner sc = new Scanner(System.in);
    Locale myLocale = new Locale("en", "US");
    ResourceBundle rb;

    public void Shop(){
        ChooseLanguage();

        System.out.println(rb.getString("shoppingcart.items"));
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            int round = i + 1;

            System.out.println("[" + round + "]" + rb.getString( "shoppingcart.price"));
            double price = sc.nextDouble();

            System.out.println("[" + round + "]" + rb.getString("shoppingcart.quantity"));
            int quantity = sc.nextInt();

            total += calculateTotalPrice(price, quantity);
        }

        System.out.println(rb.getString("shoppingcart.total") + total);
    }

    private void ChooseLanguage(){
        System.out.println("Choose Language:\n1.English\n2.Suomi\n3.Svenska\n4.日本語");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                myLocale = new Locale("en", "US");
                break;

            case 2:
                myLocale = new Locale("fi", "FI");
                break;

            case 3:
                myLocale = new Locale("sv", "SE");
                break;

            case 4:
                myLocale = new Locale("ja", "JP");
                break;

            default:
                myLocale = new Locale("en", "US");
                break;
        }

        rb = ResourceBundle.getBundle("MessagesBundle", myLocale);

        System.out.println(rb.getString("selected") + " " + myLocale.getDisplayCountry(myLocale) + ".");
    }

    public double calculateTotalPrice(double price ,int quantity){
        return price * quantity;
    }
}
