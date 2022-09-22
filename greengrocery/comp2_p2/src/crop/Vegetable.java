/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;


import CanNotBeStoredException.CanNotBeStoredException;
import static java.lang.Character.getName;

/**
 *
 * @author Monster
 */
public class Vegetable extends Crop implements Comparable<Vegetable> {
private String cultivatedRegion;


    public Vegetable(String name, double weight, String cultivatedSeason,String cultivatedRegion) {
        super(name, weight, cultivatedSeason);
        this.cultivatedRegion= cultivatedRegion;
    }

    @Override
    public String toString() {
      return super.getName()+super.getWeight()+super.getCultivatedSeason()+cultivatedRegion;
    }

    @Override
    public String consumeIt() {
   return " vegetables are cooked";
    }

    
@Override
    public String storeIt()throws CanNotBeStoredException {
        throw new  CanNotBeStoredException();
    }

    @Override
    public int compareTo(Vegetable o) {
      if ( getName() ==o.getName())
        return 0;
      
      return ((int)getWeight())-((int)o.getWeight());
        
        
        
      
    }
    
}
