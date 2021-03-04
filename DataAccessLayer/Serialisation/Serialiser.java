package DataAccessLayer.Serialisation;

import java.io.*;
import DataAccessLayer.DataObjets.user;

public class Serialiser {
    public void Serialise(user user){
        try {
            String username = user.getUsername(); 
            
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\" + username + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.reset();

            oos.close();
            fos.close();

        } catch (Exception mes) {
            System.out.println("Error" + mes);
        }
    }
}
