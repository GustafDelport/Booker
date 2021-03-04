package BusinessLogicLayer;

import DataAccessLayer.user;

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
        //Get users to authenticate if they already exists (Username)

        System.out.println(name + surname + phone + email + password + username);//Test
        return false;
    }

    public boolean LoginAuth(){
        boolean flag = false;
        //Access DataHandler here to retrieve user info.

        if (password == "admin" && username == "admin"){
            flag = true;    
        }

        return flag;
    }

    public user getUser(int ID){

        return null;
    }


}