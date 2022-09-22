/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class testClass {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Scanner s = new Scanner(System.in);
        createFile();
        writeFile();
        readFile();

        while (true) {
            System.out.println("(Press 1) Display all suppliers and their crop list, how they are stored and how they are consumed.\n"
                    + "• (Press 2) Display all stores and their fruit list, how they are stored and how they are consumed.\n"
                    + "• (Press 3) Buy a fruit crop for a Supplier and add it to the a stores’s fruitList, removing it from the\n"
                    + "related store. Ask the value of required fields from the user.\n"
                    + "• (Press 4) Sell a fruit crop of a Supplier and remove it from the supplier’s cropList, adding it to the\n"
                    + "related store’s fruitList. Ask the value of required fields from the user.\n"
                    + "• (Press 5) Remove a fruit from a store. Ask the required fields from the user.\n"
                    + "• (Press 6) Remove a crop from a supplier. Ask the required fields from the user.\n"
                    + "• (Press 7) Add crop. Ask the required fields from the user and add the new crop to a store or a\n"
                    + "supplier.\n"
                    + "• (Press 8) Show remaining budget. Print remaining budget of a given supplier. \n"
                    + "---------------------------------------------------------------");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    displayAllSuppliers();
                    //test();
                    break;
            }
        }

    }//main

    public static void createFile() {
        try {
            File myObj = new File("Suppliers.txt");
            if (myObj.createNewFile()) {
                //System.out.println("File created: " + myObj.getName());
            } else {
                //System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            FileWriter myWriter = new FileWriter("Suppliers.txt");
            myWriter.write("ArazMeyve, 1133, 1000\n"
                    + "AylarTarim, 1298, 1500\n"
                    + "HasanBey, 1322, 200\n"
                    + "ZehraCiftci, 1429, 1250");
            Store str = new Store(31, "meyve kasası", 30, 100);
            //Fruit apple = (Fruit) str.ReadObjectFromFile("Suppliers.txt");
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try {
            File myObj = new File("Suppliers.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void displayAllSuppliers() {
        readFile();
    }

    public static void test() throws ClassNotFoundException, IOException, FileNotFoundException {
        Fruit apple = new Fruit("elma", 10, "winter", "sweet", 31);
        try {
            //FileOutputStream f = new FileOutputStream(new File("Suppliers.txt"));
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Suppliers.txt"));

            // Write objects to file
            o.writeObject(apple);
            //o.writeObject(p2);

            //o.close();
            //f.close();
            // FileInputStream fi = new FileInputStream(new File("Suppliers.txt"));
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Suppliers.txt"));

            // Read objects
            //Person pr1 = (Person) oi.readObject();
            //Person pr2 = (Person) oi.readObject();
            String efe = apple.toString();
            Fruit readapple = (Fruit) oi.readObject();
            while ((apple = (Fruit) oi.readObject()) != null) {
                System.out.println("31");
                System.out.println(apple.toString());
            }
            //System.out.println(readapple.toString());

            //System.out.println(pr1.toString());
            //System.out.println(pr2.toString());
            oi.close();
            //fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block

        }

        // TODO Auto-generated catch block
    }
}
