package PresentationLayer;

import BusinessLogicLayer.AccountHandler;

public class Home {
    public static void main(String[] args) {
        Displays displays = new Displays();
        boolean login = false;

        while (!login) {
            //Give option to register or login here

            String[] userInfo = displays.LoginDisplay();
            AccountHandler AH = new AccountHandler(userInfo[0], userInfo[1]);
            login = AH.LoginAuth();
        }
    }
}
