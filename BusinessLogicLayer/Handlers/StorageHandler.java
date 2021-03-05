package BusinessLogicLayer.Handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import DataAccessLayer.DataObjets.*;
import DataAccessLayer.Handlers.LogisticsHandler;
import DataAccessLayer.Serialisation.*;

public class StorageHandler {

    public void StoreUser(user user) {
        Serialiser s = new Serialiser();
        s.SerialiseUser(user);
    }

    public user RetrieveUser(String userName) {
        Deserialiser des = new Deserialiser();
        return des.DeserialiseUser(userName);
    }

    public void StoreBooking(bookings booking) {
        Serialiser s = new Serialiser();
        s.SerialiseBooking(booking);
    }

    public bookings RetrieveBooking(String cName) {
        Deserialiser des = new Deserialiser();
        return des.DeserialiseBooking(cName);

        // NOTE try saving all bookings of a person in a list of bookings and read
        // through list and save it as their username.ser
    }

    public List<String> RetrieveFoodMenu() throws FileNotFoundException {
        List<String> lStrings = new ArrayList<>();

        LogisticsHandler lHandler = new LogisticsHandler();
        List<Menu> menus = lHandler.getFood();

        System.out.println(menus.get(0).getFoodName());

        int n = 1;

        for (Menu item : menus) {
            String line = String.format("%d - %s : %s",n ,item.getFoodName(), item.getFoodDescription());
            lStrings.add(line);
            n++;    
        }
        return lStrings;
    }

    public List<String> RetrieveDecorations() throws FileNotFoundException {
        List<String> lStrings = new ArrayList<>();

        LogisticsHandler lHandler = new LogisticsHandler();
        List<Decorations> decorations = lHandler.getDecorations();
        int n = 1;

        for (Decorations item : decorations) {
            String line = String.format("%d - %s",n ,item.getDecoName());
            lStrings.add(line);
            n++;    
        }
        return lStrings;
    }

    //Status  : "Non" / "Con"

    public List<String> RetrieveStatusBookings(String Status){

        List<bookings> bookings = new ArrayList<bookings>();
        List<String> aList = new ArrayList<String>();

        File file = new File(System.getProperty("user.dir") + "\\SerialisedObjects\\BookingData\\");
        File[] listOfFiles = file.listFiles();

        for (File item : listOfFiles) {
            bookings.add(RetrieveBooking(item.getName()));
        }

        for (bookings item : bookings) {
            if (item.getStatus().equals(Status)){
                String line = String.format("ID: %s\nUsername: %S\nDate: %s\nType: %s\nStatus: %s\n", item.getBookingID(),item.getClientUsername(),item.getDate(),item.getType(),item.getStatus());
                aList.add(line);
            }
        }

        return aList;
    }
}
