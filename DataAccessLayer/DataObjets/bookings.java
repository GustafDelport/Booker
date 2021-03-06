package DataAccessLayer.DataObjets;

import java.io.Serializable;
import java.util.List;

public class bookings implements Serializable {
    private static final long serialVersionUID = 1L;
    private String bookingID;
    private String clientUsername;
    private String type;
    private String status;
    private int numberOfPeople;
    private String date;
    private double price;
    private List<String> food;
    private List<String> decorations;

    public bookings(String bookingID, String clientUsername, String status, String date, String Type,int numberOfPeople, List<String> Food, List<String> Decorations) {
        this.bookingID = bookingID;
        this.clientUsername = clientUsername;
        this.status = status;
        this.date = date;
        this.type = Type;
        this.numberOfPeople = numberOfPeople;
        this.food = Food;
        this.decorations = Decorations;
    }

    public List<String> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<String> decorations) {
        this.decorations = decorations;
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
