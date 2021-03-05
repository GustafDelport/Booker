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
        String username = "";

        BookingHandler bHandler = new BookingHandler();
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

                        username = userInfo[0];
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
                        username = list.get(0);
                        
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
            //Displays.clrscr();

            if (admin) {
                menuOpt = displays.AdminMenu();
                switch (menuOpt) {
                    case 1:
                        {
                            //SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
                            //Date date = new Date(System.currentTimeMillis());
                            
                            //Get user input from displays
                            // BookingHandler bHandler = new BookingHandler("Jan", date, "Wedding", 50);
                            // bHandler.MakeBooking();


                            
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
            }
            else{
                menuOpt = displays.ClientMenu();
                switch (menuOpt) {
                    case 1:
                        {
                            //View Bookings
                            List<String> lBookings = bHandler.ViewBookings(username);

                            for (String string : lBookings) {
                                System.out.println(string);
                            }
                        }
                        break;
                    case 2:
                        {
                            //Make Booking
                            List<String> lStrings = displays.BookingMenu();
                            bHandler = new BookingHandler(lStrings.get(0), lStrings.get(1), lStrings.get(2), Integer.parseInt(lStrings.get(3)));

                            bHandler.MakeBooking(username);
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
            }
        }
        

        //#endregion
    }

}
