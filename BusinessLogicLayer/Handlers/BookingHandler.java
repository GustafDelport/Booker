package BusinessLogicLayer.Handlers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import BusinessLogicLayer.Booking.bookBaptism;
import BusinessLogicLayer.Booking.bookBirthDay;
import BusinessLogicLayer.Booking.bookParty;
import BusinessLogicLayer.Booking.bookWedding;
import DataAccessLayer.DataObjets.bookings;

public class BookingHandler {
    private String bookingID;
    private String clientUsername;
    private String type;
    private String status;
    private int numberOfPeople;
    private Date date;

    public BookingHandler(String clientUsername, Date date, String type, int numberOfPeople) {
        this.clientUsername = clientUsername;
        this.date = date;
        this.type = type;
        this.numberOfPeople = numberOfPeople;
    }

    public BookingHandler() {}

    public void MakeBooking(){
        
        bookings booking = new bookings(bookingID, clientUsername, status, date, type, numberOfPeople);

        switch (type) {
            case "Baptism":
                {
                    BookingContext ctx = new BookingContext(new bookBaptism());
                    ctx.Execute(booking);
                }
                break;
            case "Birthday":
                {
                    BookingContext ctx = new BookingContext(new bookBirthDay());
                    ctx.Execute(booking);
                }
                break;
            case "Party":
                {
                    BookingContext ctx = new BookingContext(new bookParty());
                    ctx.Execute(booking);
                }
                break;
            case "Wedding":
                {
                    BookingContext ctx = new BookingContext(new bookWedding());
                    ctx.Execute(booking);
                }
                break;
            case "Tear End":
                
                break;
        }
    }

    //One implement that why its not part of the interface
    public List<String> ViewBookings(){
        List<String> list = new ArrayList<>();
        StorageHandler sHandler = new StorageHandler();

        bookings b = sHandler.RetrieveBooking(bookingID, clientUsername);

        list.add(b.getBookingID() + " " + b.getClientUsername());
        return list;
    }
}
