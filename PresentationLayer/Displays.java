package PresentationLayer;

import java.io.IOException;
import java.util.*;
public class Displays {

    Scanner iScanner = new Scanner(System.in);

    public String[] LoginDisplay() {
        System.out.println("Enter Username: ");
        String userName = iScanner.next();

        System.out.println("Enter Password: ");
        String password = iScanner.next();

        System.out.println("\n");

        String[] userInfo = {userName,password};

        return userInfo;
    }

    public int initialMenu(){
        clrscr();

        boolean flag = false;
        int a = 0;

        while (!flag) {
            System.out.println("====== Welcome to Booker ======");
            System.out.println("Already a user ?\n1 - Yes\n2 - No");
            System.out.println("==============================="); 
            //Validate anwser either 1 or 2
            a = iScanner.nextInt();

            if (a == 1 || a == 2) {
                flag = true;
            }
            else System.out.println("That was not a valid input");
            
        }
        return a;
    }

    public List<String> RegisterMenu(){
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

    public int AdminMenu(){

        System.out.println("============ Booker ============");
        System.out.println("Menu Items\n1 - View Bookings\n2 - Confirm Bookings\n3 - Notifications");
        System.out.println("================================"); 

        //Validate anwser either 1 or 2 or 3 or 4
        int a = iScanner.nextInt();

        if (a == 1 || a == 2 || a == 3 || a == 4) {
            //flag = true;
        }
        else System.out.println("That was not a valid input");
        return a;
    }

    public int ClientMenu(){
        System.out.println("============ Booker ============");
        System.out.println("Menu Items\n1 - View Booking\n2 - Make Booking\n3 - Edit Bookings");
        System.out.println("================================"); 

        //Validate anwser either 1 or 2 or 3 or 4
        int a = iScanner.nextInt();

        if (a == 1 || a == 2 || a == 3 || a == 4) {
            //flag = true;
        }
        else System.out.println("That was not a valid input");
        return a;
    }

    public List<String> BookingMenu(){
        //Questions and stuff
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

    public String BookingTypes(){

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
