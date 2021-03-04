package BusinessLogicLayer.Handlers;

import java.io.File;

import DataAccessLayer.DataObjets.*;

//Handles Logins and Registrations
public class AccountHandler {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String password;
    private String username;

    //Called when we want to Login
    public AccountHandler(String Password, String Username){
        this.password = Password;
        this.username = Username;
    }

    //Called when we want to Register
    public AccountHandler(String Name, String Surname, String Phone, String Email, String Username, String Password){
        this.name = Name;
        this.surname = Surname;
        this.phone = Phone;
        this.email = Email;
        this.username = Username;
        this.password = Password;
    }

    public boolean Register(){
        //use try to see if we can retrieve a user
        if (ValidateUsername(username)) {
            return false;
        }
        else {
            StorageHandler sHandler = new StorageHandler();
            user user = new user(name, surname, phone, email, username, password);

            sHandler.StoreUser(user);
            return true;
        }     
    }

    public boolean LoginAuth(){
        boolean flag = false;

        //Access DataHandler here to retrieve user info.
        StorageHandler sHandler = new StorageHandler();
        user user = sHandler.RetrieveUser(username);

        if (password.equals(user.getPassword()) && username.equals(user.getUsername())){
            flag = true;    
        }
        else flag = false;

        //Close on heap
        sHandler = null;

        return flag;
    }

    public boolean ValidateUsername(String username){
        boolean flag = false;
        File file = new File(System.getProperty("user.dir") + "\\SerialisedObjects\\" + username + ".ser");

        if (!file.exists()) {
            flag = false;
        }else flag = true;

        return flag;
    }
}