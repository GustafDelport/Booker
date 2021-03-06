package BusinessLogicLayer.Handlers;

import java.util.List;

import DataAccessLayer.Serialisation.Deserialiser;
import DataAccessLayer.Serialisation.Serialiser;

public class NotificationHandler {

    //use the user to get info and send mails and conformations

    public NotificationHandler(){}

    public List<String> GetNotifications()
    {
        Deserialiser des = new Deserialiser();
        return des.DeserialiseNotification();
    }

    public void PushNotifications(List<String> list)
    {
        Serialiser ser = new Serialiser();
        ser.SerialiseNotification(list);
    }
}
