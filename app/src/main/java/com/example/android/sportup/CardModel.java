package com.example.android.sportup;

/**
 * Created by User on 11/19/2017.
 */

public class CardModel {
    private String eventID;
    private String location;
    private String time;
    private String organizer;
    private String gender;
    private String type;

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPeserta_max() {
        return peserta_max;
    }

    public void setPeserta_max(int peserta_max) {
        this.peserta_max = peserta_max;
    }

    private int peserta_max;
    //private ArrayList<String> peserta;


    public CardModel(String eventID, String location, String time, String organizer, String gender, String type, int peserta_max) {
        this.eventID = eventID;
        this.location = location;
        this.time = time;
        this.organizer = organizer;
        this.gender = gender;
        this.type = type;
        this.peserta_max = peserta_max;
    }

    public CardModel(){
        super();
    }
}
