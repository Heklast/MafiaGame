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
public class BadDetective extends Detective implements IllegalActivity{
    
    public BadDetective(String name, 
            int age, 
            Gender gender, 
            String adjective,
            Drink favoriteDrink, 
            int noOfArrests, 
            int yearsOnTheJob,
    
            String partner){
         super(name, age, gender, adjective, favoriteDrink, noOfArrests, yearsOnTheJob, partner);
    }
    
}
