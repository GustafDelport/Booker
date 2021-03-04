package DataAccessLayer.DataObjets;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

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

    public List<bookings> GetBookings(){

        // Temporary - used instead of "null"
        return Collections.emptyList();
    }

    //LOL
    public void IgnoreMe(){
        System.out.println(bookingID + clientUsername + date + status);
    }

}
