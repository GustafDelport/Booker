package PresentationLayer;

import BusinessLogicLayer.AccountHandler;

public class Home {
    public static void main(String[] args) {
        //Variables
        //#region
        Displays displays = new Displays();
        boolean login = false;
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
                    }
                }
                break;
            case 2:
                {

                }
                break;
            default:
                break;
        }
    }
}
