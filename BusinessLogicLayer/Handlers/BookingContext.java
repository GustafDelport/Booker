package BusinessLogicLayer.Handlers;

import DataAccessLayer.DataObjets.bookings;

public class BookingContext 
{
    private BookingInterface bInterface;

    public BookingContext(){}

    public BookingContext(BookingInterface BInterface)
    {
        this.bInterface = BInterface;
    }

    public void Execute(bookings booking)
    {
        bInterface.MakeBooking(booking);
    }

    public void ExecuteTwo(bookings booking)
    {
        bInterface.EditPrice(booking);
    }

}
