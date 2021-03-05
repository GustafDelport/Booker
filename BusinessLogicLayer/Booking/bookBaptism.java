package BusinessLogicLayer.Booking;

import java.util.Random;

import BusinessLogicLayer.Handlers.*;
import DataAccessLayer.DataObjets.bookings;

public class bookBaptism implements BookingInterface {
    public String type = "Baptism";
    private int pricePerPerson = 75;

    @Override
    public void MakeBooking(bookings booking) {
        Random rnd = new Random();

        String bID = String.format("BTM%04d", rnd.nextInt(1000));
        booking.setBookingID(bID);

        if (booking.getNumberOfPeople() >= 40) {
            booking.setPrice((pricePerPerson * booking.getNumberOfPeople())*0.85);        }

        StorageHandler sHandler = new StorageHandler();
        sHandler.StoreBooking(booking);
    }
}
