package DataAccessLayer;

import java.sql.Date;

public class bookings {
    private String bookingID;
    private String clientUsername;
    private Date date;

    public bookings(){}

    public bookings(String BookingID, String ClientUsername, Date Date){
        this.bookingID = BookingID;
        this.clientUsername = ClientUsername;
        this.date = Date;
    }

    //LOL
    public void IgnoreMe(){
        System.out.println(bookingID + clientUsername + date);
    }

    //args constructor later
}
