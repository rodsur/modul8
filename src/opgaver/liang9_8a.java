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
public class liang9_8a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fan fan1 = new Fan(3, 10.0, "yellow", true);
        Fan fan2 = new Fan(2, 5.0, "blue", false);
        
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    
}
