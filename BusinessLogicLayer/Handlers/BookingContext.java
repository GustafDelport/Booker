package BusinessLogicLayer.Handlers;

public class BookingContext {
    private BookingInterface bInterface;

    public BookingContext(BookingInterface BInterface){
        this.bInterface = BInterface;
    }

    public void Execute(){
        bInterface.MakeBooking();
    }

}
