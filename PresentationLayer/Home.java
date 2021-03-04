package PresentationLayer;

import java.util.List;

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
                    while (!register) {
                        List<String> list = displays.RegisterMenu();
                        AccountHandler AH = new AccountHandler(list.get(0), list.get(1),list.get(2), list.get(3), list.get(4), list.get(5));
                        
                        register = AH.Register();

                        AH = null;
                    }

                    //DO Current user passing
                }
                break;
            default:
                break;
        }
    }
}
