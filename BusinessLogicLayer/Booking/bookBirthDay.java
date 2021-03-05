package BusinessLogicLayer.Booking;

import java.util.Random;

import BusinessLogicLayer.Handlers.*;
import DataAccessLayer.DataObjets.bookings;

public class bookBirthDay implements BookingInterface {
    public String type = "Birthday";
    private int pricePerPerson = 55;

    @Override
    public void MakeBooking(bookings booking) {
        Random rnd = new Random();

        String bID = String.format("BTY%04d", rnd.nextInt(1000));
        booking.setBookingID(bID);

        if (booking.getNumberOfPeople() >= 40) {
            booking.setPrice((pricePerPerson * booking.getNumberOfPeople())*0.85);
        }
        else booking.setPrice((pricePerPerson * booking.getNumberOfPeople()));

        booking.setStatus("Pending");
        
        StorageHandler sHandler = new StorageHandler();
        sHandler.StoreBooking(booking);
    }

    @Override
    public bookings EditPrice(bookings booking) {
        bookings b = booking;
        
        if (booking.getNumberOfPeople() >= 40) {
            booking.setPrice((pricePerPerson * booking.getNumberOfPeople())*0.85);        
        }
        else booking.setPrice((pricePerPerson * booking.getNumberOfPeople()));

        return b;

    }
}
