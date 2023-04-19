package SHOPPEE.homework;

import java.util.Date;

public class Order {
    private int id;
    private String status;
    private double totalPrice;
    private String address;
    private String userReceive;
    private Date dateTime;

    public Order() {
    }

    public Order(int id, String status, double totalPrice, String address, String userReceive, Date dateTime) {
        this.id = id;
        this.status = status;
        this.totalPrice = totalPrice;
        this.address = address;
        this.userReceive = userReceive;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserReceive() {
        return userReceive;
    }

    public void setUserReceive(String userReceive) {
        this.userReceive = userReceive;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
