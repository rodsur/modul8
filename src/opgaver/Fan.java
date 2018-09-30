/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

/**
 *
 * @author rodsur
 */
public class Fan {
    
//constants
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    
//variables
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = new String("blue");
    
//constructors
    
    /*
    public Fan() {
        
    }
    */
    
    public Fan() {
        this(1, 5, "blue", false);
    }
    
    //opgave a constructor
    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
//methods
    
    public String toString() {
        String outputString = new String();
        outputString = "The fan";
        if (on == true) {
            outputString += " is currently set at speed: " + speed + ",";
        }
        outputString += " it is " + color + " and";
        outputString += " its radius is " + radius;
        
        return outputString;
    }
    
//getters and setters
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
}
