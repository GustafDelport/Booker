package DataAccessLayer.Serialisation;

import java.io.*;

import DataAccessLayer.DataObjets.*;

public class Deserialiser {
    
    public user DeserialiseUser(String username) {
        user user = new user();

        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\ClientsData\\" + username + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            user = (user)ois.readObject();

            fis.close();
            ois.close();

        } catch (Exception mes) {
            System.out.println(mes);
        }
        return user;
    }

    public bookings DeserialiseBooking(String cName) {
        bookings booking = new bookings();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\BookingData\\" + cName +".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            booking = (bookings)ois.readObject();

            fis.close();
            ois.close();

        } catch (Exception mes) {
            //System.out.println(mes);
            booking = null;
        }
        return booking;
    }
}

