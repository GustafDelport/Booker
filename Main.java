import java.util.List;
import BusinessLogicLayer.Handlers.*;
import PresentationLayer.Displays;
public class Main {
    public static void main(String[] args) {
        //Variables
        //#region
        Displays displays = new Displays();
        boolean login = false, register = false, admin = false, run = true;
        int menuOpt;
        //#endregion

        //Login and register part
        //#region
        int opt = displays.initialMenu();

        switch (opt) {
            case 1:
                {
                    while (!login) {            
                        String[] userInfo = displays.LoginDisplay();
                        AccountHandler AH = new AccountHandler(userInfo[0], userInfo[1]);
                        login = AH.LoginAuth();
                        admin = AH.ValidateRole();
                        
                        //We want to clear instance to save memory i use null because garbage collector will delete it
                        AH = null;
                    }
                    Displays.clrscr();
                    System.out.println("Welcome");
                }
                break;
            case 2:
                {
                    while (!register) {
                        List<String> list = displays.RegisterMenu();
                        AccountHandler AH = new AccountHandler(list.get(0), list.get(1),list.get(2), list.get(3), list.get(4), list.get(5));

                        //System.out.println(list.toString());

                        register = AH.Register();
                        System.out.println("The username is taken");
                        AH = null;
                    }
                    Displays.clrscr();
                    System.out.println("Welcome");
                }
                break;
        }

        //#endregion

        //Booking displays
        //#region 
        
        while (run) {
            Displays.clrscr();

            if (admin) {
                menuOpt = displays.AdminMenu();
                switch (menuOpt) {
                    case 1:
                        {
                            StorageHandler sHandler = new StorageHandler();
                        }
                        break;
                    case 2:
                        {
                            //Confrim Bookings
                        }
                        break;
                    case 3:
                        {
                            //Notifications
                        }
                        break;
                    case 4:
                        {
                            System.exit(0);
                        }
                        break;
                }
                Displays.clrscr();
            }
            else{
                menuOpt = displays.ClientMenu();
                switch (menuOpt) {
                    case 1:
                        {
                            //View Bookings
                        }
                        break;
                    case 2:
                        {
                            //Make Booking
                        }
                        break;
                    case 3:
                        {
                            //Edit Booking
                        }
                        break;
                    case 4:
                        {
                            System.exit(0);
                        }
                        break;
                }
                Displays.clrscr();
            }
        }
        

        //#endregion
    }

}
