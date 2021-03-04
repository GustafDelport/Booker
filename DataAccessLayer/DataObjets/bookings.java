package DataAccessLayer;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

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

    public List<bookings> GetBookings(){

        // Temporary - used instead of "null"
        return Collections.emptyList();
    }

    //LOL
    public void IgnoreMe(){
        System.out.println(bookingID + clientUsername + date);
    }
}
