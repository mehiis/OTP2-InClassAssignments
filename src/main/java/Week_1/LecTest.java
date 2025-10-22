package Week_1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LecTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Language:"); //ja, sv, fi
        String lang = sc.nextLine();

        System.out.println("\nEnter Country:");//JP, SE, US, UK
        String country = sc.nextLine();

        System.out.println("\nWelcome to localization " + lang + "  " + country);

        Locale myLocale = new Locale(lang, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", myLocale);

        String message = rb.getString("wish");
        System.out.println(message);
    }
}