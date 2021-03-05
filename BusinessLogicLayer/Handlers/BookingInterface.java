package BusinessLogicLayer.Handlers;

import DataAccessLayer.DataObjets.bookings;

// Interface
public interface BookingInterface {
    public String type = "Booking";
    public void MakeBooking(bookings booking);
    public bookings EditPrice(bookings booking);
}
