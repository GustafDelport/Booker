package DataAccessLayer.Serialisation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<bookings> DeserialiseBooking(String cName) {
        List<bookings> lBookings = new ArrayList<bookings>();
    
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\BookingData\\" + cName +".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() != -1) {
                bookings booking = (bookings)ois.readObject();//Casting as bookings Object
                lBookings.add(booking);
            }

            fis.close();
            ois.close();

        } catch (Exception mes) {
            System.out.println(mes);
        }
        return lBookings;
    }
}

