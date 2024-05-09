package com.pluralsight;

public class Hotel {
    private String Name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;
    private boolean isSuite;

    public  Hotel (String Name, int numberOfSuites, int numberOfRooms){
        this.bookedSuites=0;
        this.bookedRooms=0;
        this.Name = Name;
        this.numberOfRooms=numberOfRooms;
        this.numberOfSuites=numberOfSuites;
    }

    public Hotel (String Name, int bookedRooms, int bookedSuites, int numberOfRooms, int numberOfSuites) {
        this.bookedSuites=bookedSuites;
        this.bookedRooms=bookedRooms;
        this.numberOfSuites=numberOfSuites;
        this.numberOfRooms=numberOfRooms;
        this.Name=Name;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite && ((this.numberOfSuites-this.bookedSuites)>0)) {
            bookedSuites+=1;
            return true;
        } else if (!isSuite && ((this.numberOfSuites-this.bookedSuites)>0)) {
            bookedRooms+=1;
            return true;
        } else {
            System.out.println("Room Not Available.");
            return false;
        }
    }
    public int getAvailableRooms() {
        return this.numberOfRooms-bookedRooms;
    }
    public int getAvailableSuites() {
        return this.numberOfSuites-bookedSuites;
    }
}
