package comp1112_project1;

import java.util.ArrayList;

/**
 *
 * @author efe_19comp1035
 */
public class Passenger {

    private String name;
    private String address;
    private int phoneNumber;
    private Password passengerPassword;
    private ArrayList<Reservation> listOfReservations = new ArrayList<>();
    private int accountId = 1000;
    private static int counter;

    public Passenger(String name, String address, int phoneNumber, Password passengerPassword) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.passengerPassword = passengerPassword;
        accountId += counter;
        counter++;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Password getPassengerPassword() {
        return passengerPassword;
    }

    public ArrayList<Reservation> getListOfReservations() {
        return listOfReservations;
    }

    public int getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return ("name: " + name + "\naddres: " + address + "\nphonenumber: " + phoneNumber + "\npassword: " + passengerPassword.displayPas() + "\nID: " + accountId);
    }

    public int addReservation(int numSeat, String typeSeat) {
        Reservation res = new Reservation(numSeat, typeSeat);
        if (typeSeat.equals("first")) {
            res.setFirstClassSeat(numSeat);
            System.out.println("Reservation created, your reservation number is: ");
            listOfReservations.add(res);
        } else if (typeSeat.equals("normal")) {
            res.setNormalSeat(numSeat);
            System.out.println("Reservation created, your reservation number is: ");
            listOfReservations.add(res);
        } else {
            System.out.println("Enter a valid seat type");
        }

        return res.getReservationCode();

    }//end addres

    public boolean Login(String password) {
        if (password.equals(passengerPassword.displayPas())) {
            return true;
        } else {
            return false;
        }
    }

    public void displayReservation() {
        for (int i = 0; i < listOfReservations.size(); i++) {
            System.out.println("Reservation code: " + listOfReservations.get(i).getReservationCode());
            System.out.println("from: " + listOfReservations.get(i).getFrom());
            System.out.println("to: " + listOfReservations.get(i).getTo());
            System.out.println("date of travel: " + listOfReservations.get(i).getDateOfTravel());
            System.out.println("reservation date: " + listOfReservations.get(i).getReservationDate());
            System.out.println("type of seat: " + listOfReservations.get(i).getTypeOfSeats());
            System.out.println("----------------------------------------------------------------------------");
        }
}
    
    
     public void cancelReservation() {
        for (int i = 0; i < listOfReservations.size(); i++) {
            listOfReservations.get(i).cancelMe();
        }
    }

}//end of Passenger class
