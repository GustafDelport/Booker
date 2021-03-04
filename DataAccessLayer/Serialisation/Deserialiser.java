package DataAccessLayer.Serialisation;

import java.io.*;

import DataAccessLayer.DataObjets.*;

public class Deserialiser implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public user DeserialiseUser(String username) {
        user user = new user();

        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\" + username + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            user = (user)ois.readObject();

            fis.close();
            ois.close();

        } catch (Exception mes) {
            System.out.println(mes);
        }
        return user;
    }
}

