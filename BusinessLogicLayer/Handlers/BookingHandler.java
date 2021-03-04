package BusinessLogicLayer.Handlers;

import java.sql.Date;

public class BookingHandler {
    private String bookingID;
    private String clientUsername;
    private String type;
    private String status;
    private Date date;

    public BookingHandler(String bookingID, String clientUsername, String status, Date date) {
        this.bookingID = bookingID;
        this.clientUsername = clientUsername;
        this.status = status;
        this.date = date;
    }

    public BookingHandler() {}

    public void MakeBooking(){

    }
}
