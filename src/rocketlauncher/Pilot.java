/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocketlauncher;

import java.util.HashMap;

/**
 *
 * @author Sahan
 */
public class Pilot {
    static  HashMap <String, Pilot> PilotReg= new HashMap<>();
    
   
        
        public String name ;
        private int id ;
        
        Pilot(String name , int id ){
        
            this.name = name;
            this.id = id;
            putToMap();
        
        }
   
    private void putToMap(){
        
        PilotReg.put(this.name, this);
    
    }
    
    public static void showPilots(){
        
        System.out.println(PilotReg);
    }
}
