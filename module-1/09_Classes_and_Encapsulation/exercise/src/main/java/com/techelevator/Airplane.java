package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;


    public Airplane( String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
        this.planeNumber = planeNumber;
    }

    public String getPlaneNumber() {
        return this.planeNumber;
    }

    public int getBookedFirstClassSeats() {
        return this.bookedFirstClassSeats;
    }

    // fix this method
    public int getAvailableFirstClassSeats() {
       int availableFirstClass = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClass;
    }

    public int getTotalFirstClassSeats() {
        return this.totalFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        return this.bookedCoachSeats;
    }

    // fix this method
    public int getAvailableCoachSeats() {
        int  availableCoachClass = totalCoachSeats - bookedCoachSeats;
        return availableCoachClass;
    }

    public int getTotalCoachSeats() {
        return this.totalCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass) {
            if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
                return false;
            }
           this.bookedFirstClassSeats += totalNumberOfSeats;
        }
        else {
            if (totalNumberOfSeats > getAvailableCoachSeats()) {
                return false;
            }
            this.bookedCoachSeats += totalNumberOfSeats;
        }
        return true;
    }

}

