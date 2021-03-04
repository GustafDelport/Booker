package PresentationLayer;

import BusinessLogicLayer.AccountHandler;

public class Home {
    public static void main(String[] args) {
        //Variables
        //#region
        Displays displays = new Displays();
        boolean login = false, register = false;
        //#endregion

        int opt = displays.initialMenu();

        switch (opt) {
            case 1:
                {
                    while (!login) {            
                        String[] userInfo = displays.LoginDisplay();
                        AccountHandler AH = new AccountHandler(userInfo[0], userInfo[1]);
                        login = AH.LoginAuth();

                        //DO Current user passing

                        //We want to clear instance to save memory i use null because garbage collector will delete it
                        AH = null;
                    }
                }
                break;
            case 2:
                {
                    displays.RegisterMenu();
                }
                break;
            default:
                break;
        }
    }
}
