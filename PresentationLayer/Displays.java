package PresentationLayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BusinessLogicLayer.AccountHandler;

public class Displays {

    public String[] LoginDisplay(){
        clrscr();

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String userName = iScanner.next();

        System.out.println("Enter Password: ");
        String password = iScanner.nextLine();

        String[] userInfo = {userName,password};

        iScanner.close();

        return userInfo;
    }

    public int initialMenu(){
        clrscr();

        boolean flag = false;
        int a = 0;
        Scanner iScanner = new Scanner(System.in);

        while (!flag) {
            System.out.println("====== Welcome to Booker ======");
            System.out.println("Already a user ?\n1 - Yes\n2 - No");
            System.out.println("==============================="); 
            //Validate anwser either 1 or 2
            a = iScanner.nextInt();

            if (a == 1 || a == 2) {
                flag = true;
            }
            
        }

        iScanner.close();
        return a;
    }

    public boolean RegisterMenu(){
        clrscr();

        boolean flag = false;
        List<String> list = RegisterQuickDisplay();

        //Create a new instance of a user template that is going to be stored
        AccountHandler AH = new AccountHandler(list.get(0), list.get(1),list.get(2), list.get(3), list.get(4), list.get(5));

        while (!flag) {
            if (AH.Register()) {
                flag = true;
            }
            else {
                list = RegisterQuickDisplay();
                AH = new AccountHandler(list.get(0), list.get(1),list.get(2), list.get(3), list.get(4), list.get(5));
            }
        }

        System.out.println("====== Welcome to Booker ======");
        System.out.println("Username : " + list.get(4));
        System.out.println("====== Welcome to Booker ======");
        AH = null;
        return flag;
    }

    public List<String> RegisterQuickDisplay(){
        List<String> list = new ArrayList<>();

        Scanner iScanner = new Scanner(System.in);

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

        iScanner.close();

        return list;
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