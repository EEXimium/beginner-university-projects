/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author efe_19comp1035
 */
public class MDate {
    private int day;
    private int month;
    private int year;
    private String timezone = "+03:00"; //türkiyenin timezone'u
    private int hour;
    private int minute;
    
    MDate(int day, int month, int year, int hour, int minute){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        
        
        
    }//ref point a day + - to change name
    
    public String getDateInfo(){
        //System.out.println("DATE INFO: DAY/MONTH/YEAR: " + day + "/" + month + "/" + year +"\nTIME ZONE: " + timezone);
        return "DATE INFO: DAY/MONTH/YEAR: " + day + "/" + month + "/" + year +"\nTIME ZONE: " + timezone;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getTimezone() {
        return timezone;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    } 
    
}
