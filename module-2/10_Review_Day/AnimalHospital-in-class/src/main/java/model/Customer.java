package model;

public class Customer {

    private int customerId;
    private String customerName;
    private String address;
    private String city;
    private String postalCode;
    private String email;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String address,
                    String city, String postalCode,
                    String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
