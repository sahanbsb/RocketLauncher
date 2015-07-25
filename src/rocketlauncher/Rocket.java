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
public class Rocket {
    private String name;
    static HashMap<String,Rocket> rockets = new HashMap<>();
    static int RocketCount=0;

    public Rocket(String name) {
        this.name = name;
        this.createRocket();
        RocketCount++;
    }
    
    private void createRocket() {
        RocketCount++;
        rockets.put(name, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    public static void main(String[] args) {
//        Rocket r = new Rocket("rocket 1");
//        Rocket r1 = new Rocket("rocket 2");
//        System.out.println(Rocket.rockets.get("rocket 1").getName());
//        System.out.println(Rocket.rockets.get("rocket 2").getName());
//    }
}
