package assignment2;

public class Address {
    private String streetNumber;
    private String city;
    private String zipCode;
    private String state;
    private String country;

    public Address(String streetNumber, String city, String zipCode, String state, String country) {
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
