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
public class liang9_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        fan1.setSpeed(3);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    
}
