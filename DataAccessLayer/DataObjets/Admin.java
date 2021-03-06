package DataAccessLayer.DataObjets;

import java.util.List;

public class Admin {
    private String name;
    private List<String> notifications;

    public Admin(String name, List<String> notifications) 
    {
        this.setName(name);
        this.setNotifications(notifications);
    }

    public Admin() {}

    public List<String> getNotifications() 
    {
        return notifications;
    }

    public void setNotifications(List<String> notifications)
    {
        this.notifications = notifications;
    }

    public String getName() 
    {
	return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}
