package comp1112_project1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author efe_19comp1035
 */
public class Reservation {

    Scanner s = new Scanner(System.in);
    private final String from = "A";
    private final String to = "B";
    private final Date dateOfTravel = new Date(2021, 6, 13, 16, 0);
    private Date reservationDate;
    private int numberOfSeats = 1;
    private String typeOfSeats = "Normal";
    private int reservationCode = 1;
    private static int counter; //for reservation code to be unique;
    private ArrayList<Integer> firstClassSeat = new ArrayList<Integer>(50);
    private ArrayList<Integer> normalSeat = new ArrayList<Integer>(500);
    

    public Reservation(int numberOfSeats, String typeOfSeats) {
        //makes a reservation for the user with a unique reservation code.
        reservationCode += counter;
        counter++;
        this.numberOfSeats = numberOfSeats;
        this.typeOfSeats = typeOfSeats;
        reservationDate = new Date();

        for (int i = 0; i <= 500; i++) {
            normalSeat.add(null);
        }
        
        for (int i = 0; i <= 50; i++) {
            firstClassSeat.add(null);
        }
        

    }//end of Reservation constructor

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setFirstClassSeat(int numberOfSeats) {
        
        for (int i = 0; i < numberOfSeats; i++) {
            if (firstClassSeat.get(i) == null) { //tamamen doluysa, reservation eklenmemesini amaçlıyorum bunu yaparak ama beceremedim
                firstClassSeat.add(1);
            } else {
                System.out.println("It is full");
            }
        }
        
    }//end

    public void setNormalSeat(int numberOfSeats) {
        for (int i = 0; i < numberOfSeats; i++) {
            if (normalSeat.get(i) == null) { //tamamen doluysa, reservation eklenmemesini amaçlıyorum bunu yaparak ama beceremedim
                normalSeat.add(1);
            } else {
                System.out.println("It is full");
            }
        }
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfSeats() {
        return typeOfSeats;
    }

    public int getReservationCode() {
        return reservationCode;
    }

    
    public void cancelMe() {
        if (typeOfSeats.equals("Normal")) {
            System.out.println("how many seats you want to cancel?");
            int cancelwant = s.nextInt();

            for (int i = 1; i <= cancelwant; i++) {
                System.out.println("enter the seat number you want to cancel");
                int seatnumber = s.nextInt();
                normalSeat.set(seatnumber, null);
            }

        } else if (typeOfSeats.equals("First")) {
            System.out.println("how many seats you want to cancel?");
            int cancelwant = s.nextInt();

            for (int i = 1; i <= cancelwant; i++) {
                System.out.println("enter the seat number you want to cancel");
                int seatnumber = s.nextInt();
                firstClassSeat.set(seatnumber, null);
            }
        }
    }//end of cancelMe
    

    @Override
    public String toString() {
        return "";
    }//end of toString

}//end of reservation
