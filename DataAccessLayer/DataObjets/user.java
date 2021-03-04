package DataAccessLayer.DataObjets;

import java.io.Serializable;
public class user implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
    private String surname;
    private String phone;
    private String email;
    private int ID;
    private String password;
    private String username;

    public user(){}

    public user(String Name, String Surname, String Phone, String Email, String Username, String Password){
        this.name = Name;
        this.surname = Surname;
        this.phone = Phone;
        this.email = Email;
        this.username = Username;
        this.password = Password;
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

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
