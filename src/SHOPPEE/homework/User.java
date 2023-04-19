package SHOPPEE.homework;

public class User {
    private int id;
    private String userName;
    private  String password;
    private  String phone;

    private Address address;

    public User() {
    }

    public User(int id, String userName, String password, String phone, Address address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
