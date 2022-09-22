/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

import java.util.ArrayList;

/**
 *
 * @author Monster
 */
public class Supplier implements CropKeeper {

    private String name;
    private int ID = (int) (Math.random() * 10);
    private int budget;
    private ArrayList<Crop> cropList;

    Supplier(String name, int ID, int budget) {

        this.name = name;
        this.ID = ID;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getBudget() {
        return budget;
    }

    public ArrayList<Crop> getCropList() {
        return cropList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setCropList(ArrayList<Crop> cropList) {
        this.cropList = cropList;
    }

    public void buyCrop(Crop c) {
        if(budget - ((Fruit)c).getPrice() >= 0 && cropList != null){
            for (int i = 0; i < cropList.size(); i++) {
                
            }
        }
    }

    public void sellCrop(Crop c) {

    }

    @Override
    public String howToStore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
