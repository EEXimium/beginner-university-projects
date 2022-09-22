/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.ArrayList;

/**
 *
 * @author efe_19comp1035
 */
public class Meeting {

    MDate date;
    ArrayList<Person> attendees = new ArrayList<Person>();
    Person host;
    boolean isOnline;
    String url;
    String location;
    String name;

    Meeting(String name, MDate date, Person host, boolean isOnline, String url, String location, Person attendees) {
        this.name = name;
        this.date = date;
        this.host = host;
        this.isOnline = isOnline;
        this.url = url;
        this.location = location;
        //this.attendees = attendees;
    }
    


    public String getName() {
        return name;
    }

    public MDate getDate() {
        return date;
    }

    public Person getHost() {
        return host;
    }

    public boolean isIsOnline() {
        return isOnline;
    }

    public String getUrl() {
        return url;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Person> getAttendees() {
        return attendees;
    }

    boolean addAttendee(Person m, Meeting n) {
        
        for (int i = 0; i < m.myMeetings.size(); i++) {
            if (m.myMeetings.get(i).getName().equals(n.getName())) {
                return true;
            }else{
                m.addMeeting(n);
                return true;
            }
        }
        return false;
    }
    
    boolean removeAttendee(Person m, Meeting n){
        for (int i = 0; i < m.myMeetings.size(); i++) {
            if (m.myMeetings.get(i).getName().equals(n.getName())) {
                m.removeMeeting(n);
                return true;
            }else{
                return true;
            }
        }
        return false;
    }
}
