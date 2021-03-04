package DataAccessLayer.Serialisation;

import java.io.*;

import DataAccessLayer.DataObjets.*;

public class Deserialiser {
    
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

    public bookings DeserialiseBooking(String bookingID) {
        bookings booking = new bookings();

        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\" + bookingID + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            booking = (bookings)ois.readObject();

            fis.close();
            ois.close();

        } catch (Exception mes) {
            System.out.println(mes);
        }
        return booking;
    }
}

