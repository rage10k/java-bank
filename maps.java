/*###########################################################################################
##                                                                                         ##
##  ########  ##       ##  ##       ##    #####    ##     ##  ##     ## ######## ##        ##
##  ##        ###     ###  ###     ###   ##   ##   ##     ##  ##     ## ##       ##        ## 
##  ##        ####   ####  ####   ####  ##     ##  ###    ##  ##     ## ##       ##        ##
##  ##        ## ## ## ##  ## ## ## ##  ##     ##  ## #   ##  ##     ## ##       ##        ##
##  #######   ##  ###  ##  ##  ###  ##  #########  ##  #  ##  ##     ## #######  ##        ##
##  ##        ##       ##  ##       ##  ##     ##  ##   # ##  ##     ## ##       ##        ##
##  ##        ##       ##  ##       ##  ##     ##  ##    ###  ##     ## ##       ##        ##
##  ##        ##       ##  ##       ##  ##     ##  ##     ##   ##   ##  ##       ##        ##
##  ########  ##       ##  ##       ##  ##     ##  ##     ##    #####   ######## ########  ##
##                                                                                         ##
##  Date :   27.05.17                                                                      ##
##  Company: Open University                                                               ##
##  Author:  R.Emmanuel                                                                    ##
##  Email:   richemman81@gmail.com            			                           ##
##  Version: v0.1                                                                          ##
##  Source:  Java 1.8                                                                      ## 
###########################################################################################*/
/**
 * This source code has been put together to demonstrate how to use some collection Map and
 * array.
 */

import java.util.*;
import java.lang.*;
import ou.*;


class Player
{
   private int goals;
   private String name;
   
   public Player()
   {
      this.goals() = 0;
      this.name() = null;
   }
 
   public int getGoals()
   {
      return this.goals();
   }

   public String getName()
   {
      return this.name();
   }

   public void setName(String aName)
   {
      this.name = aName;      
   }
	
   public toString()
   {
      if(this.getGoals() != 0)
	{
           return “Player ”+ this.getName() + “has scored ” + this.goals;
        }
        else
        {
           return “Player ”+ this.getName() + “has scored no goals”;       
	}
   }
}



// Question 2
interface Feedable
{

  public boolean feed();
}




HungryFrog extends Frog implements Feedable
{
  private int energyLevel;
  private final int FULL = 2000;	
  
  public HungryFrog()
  {
    super();
    this.energyLevel = this.FULL;
    
  }

  public int getEnergyLevel()
  {
    return this.energyLevel;
  }

  public void setEnergyLevel(int x)
  {
    this.energyLevel = x;
  }
 

 
  @Override
  public void setPosition (int aPosition)
  {
    int x = getEnergyLevel();
    int y = aPosition * 100;

    if(x >= y)
    {
      super.position(aPosition);
      this.update("position");
      this.setEnergyLevel(this.getEnergyLevel() - (aPosition * 100));
    }
    else
    {
      OUDialog.alert(“insufficient energy levels to move!”);
    }
  }



  public boolean feed()
  {
    int x = this.getPosition();   
    System.out.println(x);
    if((x >= 1) && (x <= 10))
    {
      while (this.getEnergyLevel() < FULL )
      {
         this.croak();
         this.setEnergyLevel(this.getEnergyLevel() + (100));
      }
    }
    else
    {
      System.out.println("out of range!");
      if( x < 1)
      {
         super.setPosition(1);
         this.feed();
      }
      else if (x > 10)
      {
         super.setPosition(10);
         this.feed();
       }
    }
    return true;
  }

  
}

Question 3

int[] temp = new int[11];


Set<String> myList = new HashSet<>();

Map<String, Integer> myList = new HashMap<>();


private Map<String, List<String>> bulbMap;


public BulbCatalogue(){
   this.buldMap = new TreeMap<>();
}


public void addBulbType(String bulbType){
   this.bulbMap.put(bulbType, new ArrayList<String>());
}


public void addVariety(String bulbType, String variety){
   this.bulbMap.get(bulbType).add(Variety);
}


public void removeVariety(String bulbType, String variety){
   this.bulbMap.get(BulbType).remove(variety);
}


public void printVarieties(String bulbType){
   System.out.println(“Our varieties of ” + BulbType + are :”);
   
   for(String variety : this.bulbMap.get(bulbType)){
      System.out.println(variety);
   }
}


public void addBulbType(String bulbType){
   if(!(BulbMap.keySet().contains(bulbType))){
      bulbMap.put(bulbType, new ArrayList<String>())
   }
}





