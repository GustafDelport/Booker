package BusinessLogicLayer.Booking;

import java.util.Random;

import BusinessLogicLayer.Handlers.*;
import DataAccessLayer.DataObjets.bookings;

public class bookYearEnd implements BookingInterface {
    public String type = "Year End";
    private int pricePerPerson = 65;

    @Override
    public void MakeBooking(bookings booking) {
        Random rnd = new Random();

        String bID = String.format("YRE%04d", rnd.nextInt(1000));
        booking.setBookingID(bID);

        if (booking.getNumberOfPeople() >= 40) {
            booking.setPrice((pricePerPerson * booking.getPrice())*0.85);
        }
        
        StorageHandler sHandler = new StorageHandler();
        sHandler.StoreBooking(booking);
    }
    
}
