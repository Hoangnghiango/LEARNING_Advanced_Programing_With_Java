package SHOPPEE.homework;

public class Address {
    private String street;
    private String number;

    private String ward;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String street, String number, String ward, String district, String city) {
        this.street = street;
        this.number = number;
        this.ward = ward;
        this.district = district;
        this.city = city;
    }
}
