package BusinessLogicLayer;

import DataAccessLayer.Deserialiser;
import DataAccessLayer.Serialiser;
import DataAccessLayer.user;

public class StorageHandler {

    public void StoreUser(user user){
        Serialiser s = new Serialiser();
        s.Serialise(user);
    }

    public user RetrieveUser(){
        Deserialiser dh = new Deserialiser();
        return dh.Deserialise("Gus");
    }
}
