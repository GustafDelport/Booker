package DataAccessLayer;

import java.io.*;

public class Deserialiser {
    
    public user Deserialise(String username){
        user user = new user();

        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\" + username + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            user = (user)ois.readObject();

            fis.close();
            ois.close();

        } catch (Exception mes) {
            System.out.println("Error " + mes);
        }

        return user;
    }
}
