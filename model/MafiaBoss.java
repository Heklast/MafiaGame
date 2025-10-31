/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafiagame.model;

/**
 *
 * @author hekla
 */
public class MafiaBoss extends MafiaMember{
    
    public enum Popularity{DEADMEAT, TOLERATED, FINE, LOVELY};
    
    private int yearsAsBoss;
    private Popularity popularity;
    
    public MafiaBoss(String name,
            int age, 
            Gender gender, 
            String adjective,
            Drink favoriteDrink,
            int yearsInTheMafia,
            String favoriteColor,
            String hairColor,
            int yearsInMafia, 
            Family belongsToFamily,
            int yearsAsBoss, 
            Popularity popularity
    ){
        super(name, age, gender, adjective, favoriteDrink, yearsInTheMafia, favoriteColor, hairColor,belongsToFamily);
        this.popularity=popularity;
        this.yearsAsBoss=yearsAsBoss;
       
    }
    
    public int getYearsAsBoss() {
        return yearsAsBoss;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    
}
