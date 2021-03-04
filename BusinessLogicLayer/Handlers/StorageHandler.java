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

    public void StoreBooking(){
        
    }

    public bookings RetrieveBooking(){

        return null;
    }
}
