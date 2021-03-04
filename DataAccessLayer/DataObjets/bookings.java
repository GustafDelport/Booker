package DataAccessLayer.DataObjets;

import java.sql.Date;

public class bookings {
    private String bookingID;
    private String clientUsername;
    private String status;
    private Date date;

    
    public bookings(String bookingID, String clientUsername, String status, Date date) {
        this.bookingID = bookingID;
        this.clientUsername = clientUsername;
        this.status = status;
        this.date = date;
    }

    public bookings(){}

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