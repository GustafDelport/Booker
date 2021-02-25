package BusinessLogicLayer;

import java.util.List;

import DataAccessLayer.*;

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
    public AccountHandler(String Name, String Surname, String Phone, String Email){
        this.name = Name;
        this.surname = Surname;
        this.phone = Phone;
        this.email = Email;
    }

    public boolean Register(){
        //Code Here
        System.out.println(name + surname + phone + email + password + username);//Test
        return true;
    }

    public List<user> getUser(){
        //Code Here
        return null;
    }

    public boolean LoginAuth(){
        //Concept
        return false;
    }


}