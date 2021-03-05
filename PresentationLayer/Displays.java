package PresentationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import BusinessLogicLayer.Handlers.StorageHandler;

public class Displays {

    Scanner iScanner = new Scanner(System.in);

    public String[] LoginDisplay() {
        System.out.println("Enter Username: ");
        String userName = iScanner.next();

        System.out.println("Enter Password: ");
        String password = iScanner.next();

        System.out.println("\n");

        String[] userInfo = { userName, password };

        return userInfo;
    }

    public int initialMenu() {
        clrscr();

        boolean flag = false;
        int a = 0;

        while (!flag) {
            System.out.println("====== Welcome to Booker ======");
            System.out.println("Already a user ?\n1 - Yes\n2 - No");
            System.out.println("===============================");
            // Validate anwser either 1 or 2
            a = iScanner.nextInt();

            if (a == 1 || a == 2) {
                flag = true;
            } else
                System.out.println("That was not a valid input");

        }
        return a;
    }

    public List<String> RegisterMenu() {
        List<String> list = new ArrayList<>();

        System.out.println("Enter Name: ");
        list.add(iScanner.next());

        System.out.println("Enter Surname: ");
        list.add(iScanner.next());

        System.out.println("Enter Phone: ");
        list.add(iScanner.next());

        System.out.println("Enter Email: ");
        list.add(iScanner.next());

        System.out.println("Enter Username: ");
        list.add(iScanner.next());

        System.out.println("Enter Password: ");
        list.add(iScanner.next());

        System.out.println("\n");

        return list;
    }

    public int AdminMenu() {

        System.out.println("============ Booker ============");
        System.out.println("Menu Items\n1 - Notifications\n2 - View Bookings\n3 - Exit");
        System.out.println("================================");

        // Validate anwser either 1 or 2
        int a = iScanner.nextInt();

        if (a == 1 || a == 2 || a == 3) {
            // flag = true;
        } else
            System.out.println("That was not a valid input");
        return a;
    }

    public int ClientMenu() {
        System.out.println("============ Booker ============");
        System.out.println("Menu Items\n1 - View Booking\n2 - Make Booking\n3 - Edit Booking");
        System.out.println("================================");

        // Validate anwser either 1 or 2 or 3 or 4
        int a = iScanner.nextInt();

        if (a == 1 || a == 2 || a == 3 || a == 4) {
            // flag = true;
        } else
            System.out.println("That was not a valid input");
        return a;
    }

    public int EditBookingMenu() {
        boolean flag = true;
        int a = 0;

        while (flag) {
            clrscr();
            System.out.println("============ Make Booking ============");
            System.out.println("Booking Options \n1 - Edit Date\n2 - Edit Number Of People\n3 - Delete Booking");
            System.out.println("======================================");
            a = iScanner.nextInt();

            if (a == 1 || a == 2 || a == 3) {
                flag = false;
            } else
                flag = true;
        }
        return a;
    }

    public List<String> BookingMenu() {
        // Questions and stuff
        List<String> lStrings = new ArrayList<>();

        System.out.println("============ Make Booking ============");

        System.out.println("Enter Name: ");
        lStrings.add(iScanner.next());

        System.out.println("Enter Date: <DD/MM/YYYY>");
        lStrings.add(iScanner.next());

        System.out.println("\nType of Event?\nChoose One");
        lStrings.add(BookingTypes());

        System.out.println("Enter number of people at event: ");
        lStrings.add(iScanner.next());

        System.out.println("======================================");

        return lStrings;
    }

    public String BookingTypes() {

        System.out.println("1 - Baptism\n2 - Birthday\n3 - Party\n4 - Wedding\n5 - Year-End");
        String type = "";

        switch (iScanner.nextInt()) {
            case 1:
                type = "Baptism";
                break;
            case 2:
                type = "Birthday";
                break;
            case 3:
                type = "Party";
                break;
            case 4:
                type = "Wedding";
                break;
            case 5:
                type = "Year-End";
                break;

            default:
                break;
        }

        return type;
    }

    public List<String> FoodMenu() throws FileNotFoundException {
        List<String> sList = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            clrscr();
            System.out.println("============ Choose Food ============");

            List<String> foodRaw = new ArrayList<>();

            StorageHandler sHandler = new StorageHandler();
            foodRaw = sHandler.RetrieveFoodMenu();
            
            for (String string : foodRaw) {
                System.out.println(string);
            }

            String line = "Item: ";

            line += iScanner.next();

            System.out.println("How much?");

            line += "Amount: " + iScanner.next();

            sList.add(line);
            
            System.out.println("\nWant to order More? \n1 - Yes\n2 - No");
            int opt = iScanner.nextInt();

            if (opt == 1) {
                flag = true;
            }
            else flag = false;

            System.out.println("=====================================");
        }

        return sList;
    }

    public List<String> DecoMenu() throws FileNotFoundException {
        List<String> sList = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            clrscr();
            System.out.println("============ Choose Decorations ============");

            List<String> DecoRaw = new ArrayList<>();

            StorageHandler sHandler = new StorageHandler();
            DecoRaw = sHandler.RetrieveDecorations();
            
            for (String string : DecoRaw) {
                System.out.println(string);
            }
            
            String line = "Item: ";

            line += iScanner.next();

            System.out.println("How much?");

            line += "Amount: " + iScanner.next();

            sList.add(line);
            
            System.out.println("\nWant to order More? \n1 - Yes\n2 - No");
            int opt = iScanner.nextInt();

            if (opt == 1) {
                flag = true;
            }
            else flag = false;
            System.out.println("===========================================");
        }

        return sList;
    }

    public String NewDate(){
        System.out.println("\nPlease Enter The New Date : <DD/MM/YY>");
        return iScanner.next();
    }

    public int NewPrice(){
        System.out.println("\nPlease Enter The New Number Of People : ");
        return iScanner.nextInt();
    }

    public int NotiMenu(){
        clrscr();
        boolean flag = true;
        int a = 0;

        while (flag) {
            System.out.println("============ Notifications ============");
            System.out.println("Notification Options\n1 - View Notifications\n2 - Approve Bookings\n3 - Back");
            System.out.println("======================================");
            a = iScanner.nextInt();
    
            if (a == 1 || a == 2 || a == 3) {
                flag = false;
            }
            else flag = true;
        }
        return a;
    }
    
    public int NotificationSettings(List<String> list){
        clrscr();
        boolean flag = true;
        int a = 0;

        while (flag) {
            System.out.println("============ Choose Notification ============");

            int n = 1;

            for (String string : list) {
                String[] aStrings = string.split(",");
                String line = String.format("%d: |ID: \t%s | Username: \t%s | Date: \t%s | Type: \t%s |",n,aStrings[0],aStrings[1],aStrings[2],aStrings[3]);
                System.out.println(line);
                n++;
            }
            
            System.out.println("=============================================");
            a = iScanner.nextInt();

            if (a < 1 && a > list.size()) {
                flag = true;
            }else flag = false;
        }

        return a;
    }

    public int AdminViewOptions(){
        boolean flag = true;
        int a = 0;
        while (flag) {
            System.out.println("============ Booker ============");
            System.out.println("Menu Items\n1 - View Non-Confirmed Bookings\n2 - View Confirmed Bookings");
            System.out.println("================================");

            a = iScanner.nextInt();

            if (a == 1 || a == 2) {
                flag = false;
            } else  System.out.println("That was not a valid input");
        }


        return a;

    }
    public static void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
