package PresentationLayer;

import java.util.Scanner;

public class Displays {

    public String[] LoginDisplay(){
        Scanner iScanner = new Scanner(System.in);

        System.out.println("====== Welcome to Booker ======");

        System.out.println("Enter Username: ");
        String userName = iScanner.nextLine();

        System.out.println("Enter Password: ");
        String password = iScanner.nextLine();

        String[] userInfo = {userName,password};

        iScanner.close();

        return userInfo;
    }
}
