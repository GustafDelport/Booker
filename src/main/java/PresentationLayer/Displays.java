package PresentationLayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Displays {

    Scanner iScanner = new Scanner(System.in);

    public String[] LoginDisplay() {
        clrscr();

        System.out.println("Enter Username: ");
        String userName = iScanner.next();

        System.out.println("Enter Password: ");
        String password = iScanner.next();

        return new String[]{userName,password};
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
        clrscr();
        List<String> list = new ArrayList<String>();
        boolean flag = true;
            clrscr();
            System.out.println("Enter Name: ");
            list.add(iScanner.nextLine());
            
            System.out.println("Enter Surname: ");
            list.add(iScanner.nextLine());

            System.out.println("Enter Phone: ");
            list.add(iScanner.nextLine());

            System.out.println("Enter Email: ");
            list.add(iScanner.nextLine());

            System.out.println("Enter Username: ");
            list.add(iScanner.nextLine());
            
            System.out.println("Enter Password: ");
            list.add(iScanner.nextLine());
        return list;
    }

    private static void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
