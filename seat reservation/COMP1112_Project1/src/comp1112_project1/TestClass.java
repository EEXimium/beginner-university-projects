/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_project1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author efe_19comp1035
 */
public class TestClass {

    public static void main(String[] args) {

        
        ArrayList<Passenger> passengerList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        

        for (int i = 0; i < 1;) {
            System.out.println("CHOICE 1: Passenger options. Create a passenger, or view the passenger list");
            System.out.println("CHOICE 2: Reservation options.");
            System.out.println("CHOICE 3: Display reservation");
            System.out.println("CHOICE 4: Cancel reservation");
            System.out.println("CHOICE 5: EXIT");

            System.out.print("coice: ");
            int choice = s.nextInt();
            

            if (choice == 1) {

                System.out.println("1. Create a passenger\n2. View passenger list");
                int choicePerson = s.nextInt();
                if (choicePerson == 1) {

                    System.out.println("Create a person. enter person info \nenter name");
                    String name = s.next();
                    System.out.println("enter adress");
                    String addres = s.next();
                    System.out.println("enter phone number");
                    int phoneNumber = s.nextInt();
                    System.out.println("enter a password");
                    String password = s.next();
                    Password pass = new Password(password);
                    Passenger p1 = new Passenger(name, addres, phoneNumber, pass);
                    passengerList.add(p1);
                    System.out.println("Person Created!");
                    //System.out.println(passengerList.ge);
                    //System.out.println(pass.displayPas());
                    System.out.println("---------------------------");
                } else if (choicePerson == 2) {
                    for (int j = 0; j < passengerList.size(); j++) {
                        System.out.println(passengerList.get(j));
                        System.out.println("------------------------");
                    }
                }

            } else if (choice == 2) {

                System.out.println("Login. Enter your ID:");
                int loginId = s.nextInt();
                System.out.println("Login. Enter your password:");
                String loginPass = s.next();

                for (int j = 0; j < passengerList.size(); j++) {

                    if (passengerList.get(j).Login(loginPass) == true && passengerList.get(j).getAccountId() == loginId) {
                        System.out.println("You logged in! You can add a (1) reservation or you can (2) reset your password.");
                        int newchoice = s.nextInt();
                        if (newchoice == 2) {
                            for (int k = 0; k < passengerList.size(); k++) {
                                if (passengerList.get(k).getAccountId() == loginId) {
                                    passengerList.get(k).getPassengerPassword().resetPassword();
                                    System.out.println("You can reserve now!");
                                }
                            }
                        }
                        System.out.println("Enter number of seats:");

                        int numOSeat = s.nextInt();
                        System.out.println("Enter type of seat: ");
                        String typeOSeat = s.next();
                        System.out.println(((Passenger) passengerList.get(j)).addReservation(numOSeat, typeOSeat));

                        break;
                    } else {
                        System.out.println("ID or password is wrong. Try again");
                        break;
                    }
                }

            } else if (choice == 3) {
                System.out.println("To display your reservation, enter your ID: ");
                int enterId = s.nextInt();
                for (int j = 0; j < passengerList.size(); j++) {
                    if (enterId == passengerList.get(i).getAccountId()) {
                        
                        passengerList.get(i).displayReservation();
                        
                    }
                }

            } else if (choice == 4) {
                System.out.println("to cancel your reservation please log in, enter your ID: ");
                int loginId = s.nextInt();
                System.out.println("Login. Enter your password:");
                String loginPass = s.next();

                for (int j = 0; j < passengerList.size(); j++) {

                    if (passengerList.get(j).Login(loginPass) == true && passengerList.get(j).getAccountId() == loginId) {
                        System.out.println("You logged in! You can cancel a reservation");
                        System.out.println("enter reservation code to be canceled");
                        int enterrescode=s.nextInt();
                        //çalışmıyor
                       
                        for (int k = 0; k < passengerList.size(); k++) {
                            passengerList.get(i).getListOfReservations().get(enterrescode).cancelMe();
                        }

                        break;
                    } else {
                        System.out.println("ID or password is wrong. Try again");
                        break;
                    }
                }
                
            } else if (choice == 5) {
                i++;
            }else{
                System.out.println("enter a valid choice");
            }


        }//end of for

    }//end of main
}//end of test class
