/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Monster
 */
public class Store implements CropKeeper {

    private int ID = (int) (Math.random() * 100000);
    private String name;
    private double maxCapacityArea;
    private static double usedCapacityArea;
    private double KGperSquareMeter = 10;
    private ArrayList<Fruit> fruitList;

    Store(int ID, String name, int maxCapacityArea, int KGperSquareMeter) {

        this.name = name;
        this.ID = ID;
        this.maxCapacityArea = maxCapacityArea;
        this.KGperSquareMeter = KGperSquareMeter;
        //this.fruitList= new ArrayList<Fruit> ();

    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxCapacityArea(int maxCapacityArea) {
        this.maxCapacityArea = maxCapacityArea;
    }

    public static void setUsedCapacityArea(int usedCapacityArea) {
        Store.usedCapacityArea = usedCapacityArea;
    }

    public void setKGperSquareMeter(int KGperSquareMeter) {
        this.KGperSquareMeter = KGperSquareMeter;
    }

    public void setFruitList(ArrayList<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getMaxCapacityArea() {
        return maxCapacityArea;
    }

    public static double getUsedCapacityArea() {
        return usedCapacityArea;
    }

    public double getKGperSquareMeter() {
        return KGperSquareMeter;
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public double availableCapacity() {
        return maxCapacityArea - usedCapacityArea;

    }

    public boolean canBeStored(Fruit f) {
        if((KGperSquareMeter * maxCapacityArea) - usedCapacityArea > 0)
            return true;
        else
            return false;
    }

    public void importCrop(Fruit f) {
        if(canBeStored(f) == true){
            fruitList.add(f);
            usedCapacityArea = ((KGperSquareMeter * maxCapacityArea) - usedCapacityArea) - f.getWeight();
            
        }else{
            System.out.println("31");
        }
    }

    public void export(Fruit f) {
        for (int i = 0; i < fruitList.size(); i++) {
            if(fruitList.get(i) == f){
                fruitList.remove(f);
                usedCapacityArea = ((KGperSquareMeter * maxCapacityArea) - usedCapacityArea) + f.getWeight();
            }else{
                System.out.println("sj");
            }
        }
    }

    @Override
    public String howToStore() {
        return "fruits in large refrigerated cooler rooms\nvegetables in sheds, not listed";
    }
}
