/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

/**
 *
 * @author Monster
 */
abstract class Crop implements CropKeeper {
    private  String name;
    private  double weight;
    private  String cultivatedSeason;

    Crop(String name,double weight,String cultivatedSeason){
     this.name= name;
     this.weight=weight;
     this.cultivatedSeason=cultivatedSeason;
    }
    
    
    @Override
    public abstract String toString();
     
    
    
    public abstract String consumeIt();
    
    public abstract String storeIt()throws CanNotBeStoredException.CanNotBeStoredException;

    @Override
    public String howToStore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getCultivatedSeason() {
        return cultivatedSeason;
    }
   
}
