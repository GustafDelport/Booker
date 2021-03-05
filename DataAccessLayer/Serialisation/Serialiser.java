package DataAccessLayer.Serialisation;

import java.io.*;
import java.util.List;

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

            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\BookingData\\" + cName + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(booking);
            oos.reset();
            
            oos.close();
            fos.close();
        } 
        catch (Exception mes) {
            System.out.println("Error" + mes);
        }
    }

    public void SerialiseNotification(List<String> list){
        try {
            //We delete the old file to replace it with a new one
            File file = new File(System.getProperty("user.dir") + "\\SerialisedObjects\\AdminFiles\\" + "Notifications.ser");
            if (file.exists()) {
                file.delete();
                FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\AdminFiles\\" + "Notifications.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
    
                oos.writeObject(list);
                oos.reset();

                oos.close();
            }
            else{ // This will only happen on first Lauch
                FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\SerialisedObjects\\AdminFiles\\" + "Notifications.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
    
                oos.writeObject(list);
                oos.reset();

                oos.close();
            }
        } 
        catch (Exception mes) {
            System.out.println("Error" + mes);
        }
    }
}

