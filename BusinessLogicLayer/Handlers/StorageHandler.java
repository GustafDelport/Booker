package BusinessLogicLayer.Handlers;

import DataAccessLayer.user;
import DataAccessLayer.Serialisation.*;

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
