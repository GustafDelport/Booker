package PresentationLayer;

import java.io.IOException;
import java.util.Scanner;

public class Displays {

    public String[] LoginDisplay(){
        clrscr();

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String userName = iScanner.nextLine();

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
            System.out.println("Already a user ?\n1 - Yes\n2 - No\n");
    
            //Validate anwser either 1 or 2
            a = iScanner.nextInt();

            if (a == 1 || a == 2) {
                flag = true;
            }
            System.out.println("==============================="); 
        }

        iScanner.close();
        return a;
    }

    public void RegisterMenu(){
        
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
