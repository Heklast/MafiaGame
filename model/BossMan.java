/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafiagame.model;

import mafiagame.behavior.IllegalActivity;

/**
 *
 * @author hekla
 */
public class BossMan extends MafiaMember implements IllegalActivity {
    
    private int noOfKills;
    //int amountOfDrugsSold, skip because we have money? goal to get an x amount of money and kills
    private Money money;
    private int noOfKidnappings; //skip?
    
    
    public BossMan(
            String name, 
            int age, 
            Gender gender, 
            String adjective,
            Drink favoriteDrink,
            int yearsInMafia, //skip?
            String hairColor,
            String favoriteColor,
            int noOfKills, 
            Family belongsToFamily,
            //int amountOfDrugsSold, skip because we have money? goal to get an x amount of money and kills
            Money money,
            int noOfKidnappings //skip?
){
        
        super(name, age, gender, adjective, favoriteDrink, yearsInMafia, hairColor, favoriteColor, belongsToFamily);
        this.noOfKills=noOfKills;
        this.money=money;
        this.noOfKidnappings=noOfKidnappings;
    }
    
    

    public int getNoOfKills() {
        return noOfKills;
    }

    public Money getMoney() {
        return money;
    }

    public int getNoOfKidnappings() {
        return noOfKidnappings;
    }
    
}
