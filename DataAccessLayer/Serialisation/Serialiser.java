package DataAccessLayer.Serialisation;

import java.io.*;
import java.util.*;

import DataAccessLayer.DataObjets.bookings;
import DataAccessLayer.DataObjets.user;

public class Serialiser {

    public void SerialiseUser(user user) {
        try {
            String username = user.getUsername();

            FileOutputStream fos = new FileOutputStream(
                    System.getProperty("user.dir") + "\\SerialisedObjects\\ClientsData\\" + username + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.reset();

            oos.close();
            fos.close();
        } catch (Exception mes) {
            System.out.println("Error" + mes);
        }
    }

    public void SerialiseBooking(bookings booking) {
        try {
            String cName = booking.getClientUsername();

            List<bookings> lBookings = new Deserialiser().DeserialiseBooking(cName);

            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\BookingData\\" + cName + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            if (!lBookings.isEmpty()) {
                for (bookings item : lBookings) {
                    oos.writeObject(item);
                    oos.reset();
                }
            }
            else
            {
                oos.writeObject(booking);
                oos.reset();
            }
            
            oos.close();
            fos.close();
        } 
        catch (Exception mes) {
            System.out.println("Error" + mes);
        }
    }
}

