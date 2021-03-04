package BusinessLogicLayer.Handlers;

import java.sql.Date;

public class BookingHandler {
    private String bookingID;
    private String clientUsername;
    private String status;
    private Date date;

    public BookingHandler(String bookingID, String clientUsername, String status, Date date) {
        this.bookingID = bookingID;
        this.clientUsername = clientUsername;
        this.status = status;
        this.date = date;
    }

    public BookingHandler() {}

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }    
}
