package BusinessLogicLayer.Handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import BusinessLogicLayer.Booking.bookBaptism;
import BusinessLogicLayer.Booking.bookBirthDay;
import BusinessLogicLayer.Booking.bookParty;
import BusinessLogicLayer.Booking.bookWedding;
import BusinessLogicLayer.Booking.bookYearEnd;
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

    public BookingHandler() {
    }

    public void MakeBooking(String username) {

        bookings booking = new bookings(bookingID, username, status, date, type, numberOfPeople);

        switch (type) {
            case "Baptism": {
                BookingContext ctx = new BookingContext(new bookBaptism());
                ctx.Execute(booking);
            }
                break;
            case "Birthday": {
                BookingContext ctx = new BookingContext(new bookBirthDay());
                ctx.Execute(booking);
            }
                break;
            case "Party": {
                BookingContext ctx = new BookingContext(new bookParty());
                ctx.Execute(booking);
            }
                break;
            case "Wedding": {
                BookingContext ctx = new BookingContext(new bookWedding());
                ctx.Execute(booking);
            }
                break;
            case "Year-End":
                BookingContext ctx = new BookingContext(new bookYearEnd());
                ctx.Execute(booking);
                break;
        }
    }

    // One implement that why its not part of the interface
    public List<String> ViewBookings(String username) {

        List<String> list = new ArrayList<>();
        StorageHandler sHandler = new StorageHandler();

        bookings b = sHandler.RetrieveBooking(username);

        if (Objects.isNull(b)) {
            list.add("You Dont Have Any Bookings");
        } else {
            String line = String.format(
                    "Booking ID: \t\t%s \nType: \t\t%s \nPrice: \t\t%f \nDate: \t\t%s \nStatus: \t%s", b.getBookingID(),
                    b.getType(), b.getPrice(), b.getDate(), b.getStatus());
            list.add(line);
        }
        return list;
    }

    public String EditDate(String username, String date) {
        StorageHandler sHandler = new StorageHandler();
        bookings b = sHandler.RetrieveBooking(username);
        String message = "";

        if (Objects.isNull(b)) {
            message = "You Dont Have Any Bookings";
        } else {
            b.setDate(date);
            message = "Your Booking Date Has Been Changed";
        }

        sHandler.StoreBooking(b);

        return message;
    }

    public String EditPrice(String username, int NoP) {
        StorageHandler sHandler = new StorageHandler();
        bookings b = sHandler.RetrieveBooking(username);
        String message = "";

        if (Objects.isNull(b)) {
            message = "You Dont Have Any Bookings";
        } else {
            b.setNumberOfPeople(NoP);

            switch (b.getType()) {
                case "Baptism": {
                    BookingContext ctx = new BookingContext(new bookBaptism());
                    ctx.ExecuteTwo(b);
                }
                    break;
                case "Birthday": {
                    BookingContext ctx = new BookingContext(new bookBirthDay());
                    ctx.ExecuteTwo(b);
                }
                    break;
                case "Party": {
                    BookingContext ctx = new BookingContext(new bookParty());
                    ctx.ExecuteTwo(b);
                }
                    break;
                case "Wedding": {
                    BookingContext ctx = new BookingContext(new bookWedding());
                    ctx.ExecuteTwo(b);
                }
                    break;
                case "Year-End": {
                    BookingContext ctx = new BookingContext(new bookYearEnd());
                    ctx.ExecuteTwo(b);
                }
                    break;
            }

            message = "Your Booking Has Been Changed";
        }

        sHandler.StoreBooking(b);

        return message;
    }

    public String DeleteBooking(String username) throws FileNotFoundException {

        StorageHandler sHandler = new StorageHandler();
        bookings b = sHandler.RetrieveBooking(username);
        String message = "";

        if (Objects.isNull(b)) {
            message = "You Dont Have Any Bookings";
        }
        else{
            File file = new File(System.getProperty("user.dir") + "\\SerialisedObjects\\BookingData\\" + username + ".ser");
            file.delete();
            message = "Your Booking Has Been Deleted";
        }
        return message;
    }
}
