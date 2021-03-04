package DataAccessLayer;

import java.io.*;

public class Serialiser {
    
    public void Serialise(){
        try {
            File resourceFile = new File("../.ser");

            FileOutputStream fos = new FileOutputStream("C:/Users/gusta/Documents/GitHub/Booker/SerialisedObjects/username.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            
            //oos.writeObject(item);
            oos.reset();

            oos.close();
            fos.close();

        } catch (Exception mes) {
            System.out.println("Error" + mes);
        }
    }
}
