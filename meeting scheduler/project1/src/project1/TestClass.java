/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author efe_19comp1035
 */
public class TestClass {

    public static String loginedPersonName;
    public static Person loginedPerson = new Person(loginedPersonName);
    public static Person logoutPerson = new Person("NoPerson");

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Meeting> allMeetings = new ArrayList<Meeting>();

        Scanner s = new Scanner(System.in);

        System.out.println("Create list of users, -1 to continue with menu");
        String user = null;

        while (!"-1".equals(user)) {
            System.out.println("enter username: ");
            user = s.next();
            Person p = new Person(user);
            personList.add(p);
        }

        while (true) {
            System.out.println("0. Login\n"
                    + "1. Create/Host new Meeting\n"
                    + "2. Cancel a meeting\n"
                    + "3. Attend an existing meeting\n"
                    + "4. Leave a meeting\n"
                    + "5. Display My Meetings\n"
                    + "6. Display Meetings organized by me\n"
                    + "7. Logout\n" //STATIC LOG VARIABLE //her bir person işlemi için while person name eşleşiyoken döngüsü
                    + "8. Exit\n"
                    + "----------------------------------------");

            int choice = s.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Enter username to login:");
                    loginedPersonName = s.next();
                    for (int i = 0; i < personList.size() - 1; i++) {
                        if (loginedPersonName.equals(personList.get(i).getName())) {
                            loginedPerson.setName(loginedPersonName);
                            loginedPerson.id = personList.get(i).id;
                            loginedPerson = personList.get(i);
                            System.out.println("you logged in: " + personList.get(i).getName() + " " + personList.get(i).id);
                        }
                    }

                    break;

                case 1:
                    if (loginedPerson == logoutPerson) {
                        System.out.println("You need to log in first");
                        break;
                    } else {
                        System.out.println("Enter name of the meeting: ");
                        String meetingName = s.next();
                        System.out.println("Enter date of the meeting: dd/mm/yyyy");
                        System.out.print("Enter a year: ");
                        int year = s.nextInt();
                        System.out.print("Enter a month: ");
                        int month = s.nextInt();
                        System.out.print("Enter a day: ");
                        int day = s.nextInt();
                        MDate date = new MDate(day, month, year, 0, 0);
                        Meeting meeting = new Meeting(meetingName, date, personList.get(0), true, "a", "a", personList.get(0));
                        //System.out.println(meeting.getName() + "  " + meeting.getDate().getDateInfo());
                        loginedPerson.iOrganize.add(meeting);
                        loginedPerson.myMeetings.add(meeting);
                        loginedPerson.printAllMeetings(loginedPerson.iOrganize);
                        allMeetings.add(meeting);
                        break;
                    }

                case 2:
                    loginedPerson.printAllMeetings(loginedPerson.iOrganize); //başka aktılımcılar başka toplantıları silebiliyor bu ne aq
                    System.out.println("Enter meeting name to be cancelled:");
                    String cancelledMeeting = s.next();
                    //loginedPerson.removeMeeting(loginedPerson, cancelledMeeting); // REMOVE ALL ATTENDEES EKLEMEN LAZIM BURAYA
                    loginedPerson.printAllMeetings(loginedPerson.iOrganize);
                    for (int i = 0; i < allMeetings.size(); i++) {
                        if (allMeetings.get(i).getName().equals(cancelledMeeting)) {
                            allMeetings.remove(i);
                            loginedPerson.iOrganize.remove(i);
                            loginedPerson.myMeetings.remove(i);
                        }

                    }
                    break;

                case 3:   //MYMEETINGS ARRAYLIST I BOŞKEN NULL A EŞİT OLDUĞU İÇİN ADDATENDEE ÇALIŞMIYOR. BOŞ BİR MEETİNG EKLEYEREK
                    //YA DA BAŞKA BİR YOLLA MYMEETİING ARRAYLISTINI NULL A EŞİT OLMAKTAN ÇIKART AMA AYNI ZAMANDA BOŞ OLSUN

                    printAllMeetingsGlobal(allMeetings);

                    System.out.println("Enter meeting name you would like to attend: ");
                    String attendMeeting = s.next();

                    for (int i = 0; i < allMeetings.size(); i++) {
                        if (attendMeeting.equals(allMeetings.get(i).getName())) {
                            //allMeetings.get(i).addAttendee(loginedPerson, allMeetings.get(i));
                            if (loginedPerson.myMeetings.isEmpty()) {
                                MDate dateTemp = new MDate(0, 0, 0, 0, 0);
                                Meeting temp = new Meeting("temp", dateTemp, logoutPerson, true, user, user, loginedPerson);
                                loginedPerson.myMeetings.add(temp);
                                if (allMeetings.get(i).addAttendee(loginedPerson, allMeetings.get(i)) == true) {
                                    allMeetings.get(i).attendees.add(loginedPerson);
                                }
                                loginedPerson.myMeetings.remove(temp);
                            } else {
                                if (allMeetings.get(i).addAttendee(loginedPerson, allMeetings.get(i)) == true) {
                                    allMeetings.get(i).attendees.add(loginedPerson);
                                }
                            }
                        }
                    }
                    System.out.println("ok, the meeting has been added to your agenda");
                    break;

                case 4:
                    printAllMeetingsGlobal(allMeetings);
                    System.out.println("Enter meeting name you would like to leave: ");
                    String leaveMeeting = s.next();
                    for (int i = 0; i < allMeetings.size(); i++) {
                        if (leaveMeeting.equals(allMeetings.get(i).getName())) {
                            if (allMeetings.get(i).removeAttendee(loginedPerson, allMeetings.get(i)) == true) {
                                allMeetings.get(i).attendees.remove(loginedPerson);
                                System.out.println("Leaved a meeting");
                            }
                        }
                    }

                    break;
                case 5:
                    System.out.println("Your meetings: ");
                    loginedPerson.printAllMeetings(loginedPerson.myMeetings);
                    break;
                case 6:
                    System.out.println("Meetings that u organize: ");
                    loginedPerson.printAllMeetings(loginedPerson.iOrganize);
                    break;
                case 7:
                    loginedPerson = logoutPerson;
                    System.out.println("You logged out");
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;

            }//end of switch

        }//end of big while

    }//end of main

    public static void printAllMeetingsGlobal(ArrayList<Meeting> m) {
        int i = 0;
        while (i < m.size()) {
            System.out.println("Meeting name: " + m.get(i).getName() + "\nMeeting date: " + m.get(i).getDate().getDateInfo());
            i++;
        }
    }//end of printAllMeetingsGlobal
}//end of TestClass
