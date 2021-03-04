package BusinessLogicLayer.Booking;

import java.util.Random;

import BusinessLogicLayer.Handlers.*;
import DataAccessLayer.DataObjets.bookings;

public class bookWedding implements BookingInterface {
    public String type = "Wedding";
    private int pricePerPerson = 125;

    @Override
    public void MakeBooking(bookings booking) {
        Random rnd = new Random();

        String bID = String.format("WDG%04d", rnd.nextInt(1000));
        booking.setBookingID(bID);

        if (booking.getNumberOfPeople() >= 40) {
            booking.setPrice((pricePerPerson * booking.getPrice())*0.85);
        }
        
        StorageHandler sHandler = new StorageHandler();
        sHandler.StoreBooking(booking);
    }

}