package DataAccessLayer;

import java.util.ArrayList;
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

    public List<user> getUsers(ArrayList<String> Names){

        return null;
    }

    public user getUser(String Name){
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
