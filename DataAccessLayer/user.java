package DataAccessLayer;

import java.util.List;

//import BusinessLogicLayer.*;

public class user {
    private String name;
    private String surname;
    private String phone;
    private String email;
    //private String password;
    //private String username;

    public user(){}

    public user(String Name, String Surname, String Phone, String Email){
        this.name = Name;
        this.surname = Surname;
        this.phone = Phone;
        this.email = Email;
    }

    public List<user> getUsers(){

        return null;
    }

    public user getUser(){
        return null;
    }
}
