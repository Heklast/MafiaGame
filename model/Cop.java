/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafiagame.model;

/**
 *
 * @author hekla
 */
public class Cop extends Human {
    private int noOfArrests;
    private int yearsOnTheJob;
    
    public Cop(String name, 
            int age, 
            Gender gender, 
            String adjective,
            Drink favoriteDrink, int noOfArrests, int yearsOnTheJob){
        
        super(name, age, gender, adjective, favoriteDrink);
        this.noOfArrests=noOfArrests;
        this.yearsOnTheJob=yearsOnTheJob;
    }
    
    @Override
    public void introduce(){
        System.out.print("Hi, I am detective "+ this.getName() +" and I am " + this.getAdjective());
    }

    public void arrest(){
        System.out.print("You are under arrest !");
    }
    
    public int getNoOfArrests() {
        return noOfArrests;
    }

    public int getYearsOnTheJob() {
        return yearsOnTheJob;
    }
    
    
    
    
}
