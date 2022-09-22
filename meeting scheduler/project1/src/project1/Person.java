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
public class Person {
    
    String name;
    int id = 0;
    static int count = 0;
    ArrayList<Meeting> myMeetings = new ArrayList<Meeting>();
    ArrayList<Meeting> iOrganize = new ArrayList<Meeting>();
    

   
    Person(String name){
        this.name = name;
        id += count;
        count++;
    }
    
    boolean equals(Person p1, Person p2){
        if(p1.getId() == p2.getId() && p1.getName() == p2.getName())
            return false;
        return true;
    }
    
    boolean addMeeting(Meeting m){
        myMeetings.add(m); //ADD DATE CHECKER ---------------------------------
        return true;
    }
    
     public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public void printAllMeetings(ArrayList<Meeting> m){
        int i = 0;
        while(i < m.size()){
            System.out.println("Meeting name: " + m.get(i).getName() + "\nMeeting date: " + m.get(i).getDate().getDateInfo());
            i++;
        }
    }
    
    public void removeMeeting(Meeting m){
        for (int i = 0; i < myMeetings.size(); i++) {
            if (m.getName().equals(myMeetings.get(i).getName())) {
                myMeetings.remove(myMeetings.get(i));
                
            }
            
        }
    }
}
