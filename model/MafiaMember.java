/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafiagame.model;

/**
 *
 * @author hekla
 */
public class MafiaMember extends Human {
    
    public enum Family{CORVETTA, JULIO};
    
    private int yearsInMafia;//skip?
    private String hairColor;
    private String favoriteColor;
    public Family belongsToFamily;
    
    
    public MafiaMember( String name, 
            int age, 
            Gender gender, 
            String adjective,
            Drink favoriteDrink,
            int yearsInMafia, 
            String hairColor,
            String favoriteColor,
            Family belongsToFamily
            
    ){
        super(name, age, gender, adjective, favoriteDrink);
        this.favoriteColor=favoriteColor;
        this.hairColor=hairColor;
        this.yearsInMafia=yearsInMafia;
        this.belongsToFamily=belongsToFamily;
    }
    
    @Override
    public void introduce(){
        System.out.print("My name is " + this.getName() + ", I'll kill you if you repeat it to someone else.");
    }
    
    public void sellDrugs(){
        
    }
    
    public void informOn(MafiaMember mafiaMember){
        
    }

    public int getYearsInMafia() {
        return yearsInMafia;
    }
    
}
