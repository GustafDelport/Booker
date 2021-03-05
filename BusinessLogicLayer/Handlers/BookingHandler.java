package BusinessLogicLayer.Handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import BusinessLogicLayer.Booking.bookBaptism;
import BusinessLogicLayer.Booking.bookBirthDay;
import BusinessLogicLayer.Booking.bookParty;
import BusinessLogicLayer.Booking.bookWedding;
import DataAccessLayer.DataObjets.bookings;

public class BookingHandler {
    private String bookingID;
    private String username;
    private String type;
    private String status;
    private int numberOfPeople;
    private String date;

    public BookingHandler(String Username, String date, String type, int numberOfPeople) {
        this.username = Username;
        this.date = date;
        this.type = type;
        this.numberOfPeople = numberOfPeople;
    }

    public BookingHandler() {}

    public void MakeBooking(String username){
        
        bookings booking = new bookings(bookingID, username, status, date, type, numberOfPeople);

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
            case "Year-End":
                
                break;
        }
    }

    //One implement that why its not part of the interface
    public List<String> ViewBookings(String username){

        List<String> list = new ArrayList<>();
        StorageHandler sHandler = new StorageHandler();

        bookings b = sHandler.RetrieveBooking(username);

        if (Objects.isNull(b)) {
            list.add("You Dont Have Any Bookings");
        }
        else{
            String line = String.format("Booking ID: \t%s \nType: \t%s \nPrice: \t%f \nDate: \t%s \nStatus: \t%s", b.getBookingID(),b.getType(),b.getPrice(),b.getDate(),b.getStatus());
            list.add(line);
        }
        return list;
    }
}
