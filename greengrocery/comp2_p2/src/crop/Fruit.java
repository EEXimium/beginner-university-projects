/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

import java.io.Serializable;
import sun.awt.AWTAccessor;

/**
 *
 * @author Monster
 */
public class Fruit extends Crop implements Comparable<Fruit>, Serializable{
    private String taste;
    private int price;
    
    
    public Fruit(String name, double weight,
            String cultivatedSeason,String taste,int price ) {
        super(name, weight, cultivatedSeason);
        this.price= price;
        this.taste= taste;
        
    }
    

   
    
    
    
    /*
    @Override
    public String toString() {
        return super.getName()+ "\n" +super.getWeight()+
                 "\n" +super.getCultivatedSeason()+ "\n" +price+ "\n" +taste;
     }

*/
    @Override
    public String consumeIt() {
   return "fruits are consumed raw";
    }

    @Override
    public String storeIt() {
        //AWTAccessor.setFrameAccessor(getName();
        
        
        
        return "h"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Fruit o) {
 if ( getName() == o.getName())
        return 0;
      
      return ((int)getWeight())-((int)o.getWeight());
        
        
      }
    
    
    @Override
    public String toString() {
        
        return  "Fruit, taste=" + taste + " price=" + price;
    }

    public int getPrice() {
        return price;
    }
    
    
    
}
