package DataAccessLayer.DataObjets;

import java.io.Serializable;
import java.sql.Date;

public class bookings implements Serializable{
    private static final long serialVersionUID = 1L;
    private String bookingID;
    private String clientUsername;
    private String type;
    private String status;
    private int numberOfPeople;
    private Date date;
    private double price;

    public bookings(String bookingID, String clientUsername, String status, Date date, String Type,int numberOfPeople) {
        this.bookingID = bookingID;
        this.clientUsername = clientUsername;
        this.status = status;
        this.date = date;
        this.type = Type;
        this.setNumberOfPeople(numberOfPeople);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public bookings() {
    }

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
