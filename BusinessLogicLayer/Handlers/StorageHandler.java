package BusinessLogicLayer.Handlers;

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
        int n = 1;

        for (Menu item : menus) {
            String line = String.format("%d - %s : %s",n ,item.getFoodName(), item.getFoodDescription());
            lStrings.add(line);
            n++;    
        }
        return null;
    }
}
