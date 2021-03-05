
import java.io.FileNotFoundException;
import java.util.List;
import BusinessLogicLayer.Handlers.*;
import PresentationLayer.Displays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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
                            //Notifications
                            NotificationHandler nHandler = new NotificationHandler();
                            switch (displays.NotiMenu()) {
                                case 1:
                                    {
                                        Displays.clrscr();
                                        List<String> list = nHandler.GetNotifications();

                                        for (String string : list) {
                                            String[] aStrings = string.split(",");
                                            String line = String.format("|ID: \t%s | Username: \t%s | Date: \t%s | Type: \t%s |", aStrings[0],aStrings[1],aStrings[2],aStrings[3]);
                                            System.out.println(line);
                                        }
                                    }
                                    break;
                            
                                case 2:
                                    {
                                        Displays.clrscr();
                                        //Admin Aproves Message Here
                                        List<String> list = nHandler.GetNotifications();
                                        int target = displays.NotificationSettings(list)-1;
                                        
                                        //We get username here to edit status of a booking
                                        String[] aStrings = list.get(target).split(",");
                                        username = aStrings[1];

                                        //We remove the selected notification and push the new list
                                        list.remove(target);
                                        nHandler.PushNotifications(list);

                                        //Here we are going to update status of a booking
                                        bHandler.UpdateStatus(username);  
                                    }
                                    break;
                                case 3:
                                    {
                                        displays.AdminMenu();
                                    }
                                    break;
                            }
                            
                        }
                        break;
                    case 2:
                        {
                            switch (displays.AdminViewOptions()) {
                                case 1:
                                    {
                                        System.out.println("============ Non Confirmed ============");
                                        for (String string : bHandler.ViewBookingsByStatus("Non")) {
                                            System.out.println(string);
                                        }
                                        System.out.println("=======================================");
                                    }
                                    break;
                                case 2:
                                    {
                                        System.out.println("============== Confirmed ==============");
                                        for (String string : bHandler.ViewBookingsByStatus("Con")) {
                                            System.out.println(string);
                                        }
                                        System.out.println("=======================================");
                                    }
                                    break;
                            }
                        }
                        break;
                    case 3:
                        {
                            System.exit(0);
                        }
                        break;
                    default:
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
                            Displays.clrscr();
                            //View Bookings
                            List<String> lBookings = bHandler.ViewBookings(username);

                            for (String string : lBookings) {
                                System.out.println(string);
                            }
                        }
                        break;
                    case 2:
                        {
                            Displays.clrscr();
                            //Make Booking
                            List<String> lStrings = displays.BookingMenu();
                            //0 = Name 1 = Date 2 = Type 3 = NoP
                            bHandler = new BookingHandler(lStrings.get(0), lStrings.get(1), lStrings.get(2), Integer.parseInt(lStrings.get(3)) , displays.FoodMenu(), displays.DecoMenu());
                
                            bHandler.MakeBooking(username);
                        }
                        break;
                    case 3:
                        {
                            Displays.clrscr();
                            int c = displays.EditBookingMenu();

                            switch (c) {
                                case 1:
                                    {
                                        //Edit Date
                                        bHandler = new BookingHandler();
                                        System.out.println(bHandler.EditDate(username, displays.NewDate()));
                                    }
                                    break;
                                case 2:
                                    {
                                        //Edit Number of people
                                        bHandler = new BookingHandler();
                                        System.out.println(bHandler.EditPrice(username, displays.NewPrice()));
                                    }
                                    break;
                                case 3 :
                                    {
                                        //Delete Booking
                                        bHandler = new BookingHandler();
                                        System.out.println(bHandler.DeleteBooking(username));
                                    }
                                    break;
                            }
                        }
                        break;
                    case 4:
                        {
                            System.exit(0);
                        }
                        break;
                    default:
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
