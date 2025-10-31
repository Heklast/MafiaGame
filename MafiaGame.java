/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mafiagame;

import mafiagame.model.Cop;
import mafiagame.model.Human;
import mafiagame.model.PoliceChief;

/**
 *
 * @author hekla
 */
public class MafiaGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cop cop=new Cop("Haraldur");
        Human human =new Human("Mahmhoud");
        PoliceChief policeChief=new PoliceChief("Hekla");
        System.out.print(cop.getName()+ human.getName()+ policeChief.getName());
    }   
    
}
