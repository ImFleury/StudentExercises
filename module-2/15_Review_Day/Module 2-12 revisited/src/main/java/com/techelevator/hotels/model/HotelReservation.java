package com.techelevator.hotels.model;

public class HotelReservation extends Reservation {

    public HotelReservation() {
    }

    public HotelReservation(int id, int hotelId, String fullName, String checkinDate, String checkoutDate, int guests, String hotelName) {
        super(id, hotelId, fullName, checkinDate, checkoutDate, guests);
        this.hotelName = hotelName;
    }

    private String hotelName;


    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Reservation Details" +
                "\n--------------------------------------------" +
                "\n Id: " + super.getId() +
                "\n Hotel Id: " + super.getHotelId() +
                "\n Hotel Name: " + this.hotelName +
                "\n Full Name: " + super.getFullName()+
                "\n Checkin Date: " + super.getCheckinDate() +
                "\n Checkout Date: " + super.getCheckoutDate() +
                "\n Guests: " + super.getGuests();
    }


}
