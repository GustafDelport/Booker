package BusinessLogicLayer.Handlers;

import DataAccessLayer.DataObjets.*;
import DataAccessLayer.Serialisation.*;

public class StorageHandler{

    public void StoreUser(user user) {
        Serialiser s = new Serialiser();
        s.SerialiseUser(user);
    }

    public user RetrieveUser(String userName){
        Deserialiser des = new Deserialiser();
        return des.DeserialiseUser(userName);
    }

    public void StoreBooking(bookings booking){
        Serialiser s = new Serialiser();
        s.SerialiseBooking(booking);
    }

    public bookings RetrieveBooking(String bookingID, String cName){
        Deserialiser des = new Deserialiser();
        return des.DeserialiseBooking(bookingID,cName);
    }
}
