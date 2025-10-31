/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafiagame.model;

/**
 *
 * @author hekla
 */
abstract public class Human {
    
    public enum Gender{FEMALE, MALE, UNDEFINED};
    public enum Drink{BEER, WATER, FANTA};
    
    private final String name;
    private final int age;
    private final Gender gender;
    private final String adjective;
    private final Drink favoriteDrink;
    
    /**
     *
     * @param name
     * @param age
     * @param gender
     * @param adjective
     * @param favoriteDrink
     */
    public Human(
            String name, 
            int age, 
            Gender gender, 
            String adjective,
            Drink favoriteDrink ){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.adjective=adjective;

        this.favoriteDrink=favoriteDrink;
    }
    
    //ALL THE METHODS ARE WRONG, I JUST WANTED TO WRITE THEM IN!
    
    public String getsKilled(){
        return "Game Over"; //this doesnt print obvi
    }
    public String chooseGender(){
        return "Game Over"; //this doesnt print obvi
    }
    public String getDrink(){
        return "Game Over"; //this doesnt print obvi
    }
    
    abstract public void introduce();
    
    public String goToBar(){
        return "Game Over"; //this doesnt print obvi
    }
    public String changeHairColor(){
        return "Game Over"; //this doesnt print obvi
    }

    public String getAdjective() {
        return adjective;
    }

    public Drink getFavoriteDrink() {
        return favoriteDrink;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public Gender getGender(){
        return this.gender;
    }
   
}
