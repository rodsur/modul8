/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;
import java.util.Date;
/**
 *
 * @author rodsur
 */
public class liang9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dato = new Date(10000);
        System.out.println(dato.toString());
        dato.setTime(100000);
        System.out.println(dato.toString());
        dato.setTime(1000000);
        System.out.println(dato.toString());
        dato.setTime(1000000);
        System.out.println(dato.toString());
        dato.setTime(10000000);
        System.out.println(dato.toString());
        dato.setTime(100000000);
        System.out.println(dato.toString());
        dato.setTime(1000000000);
        System.out.println(dato.toString());
        dato.setTime(10000000000l);
        System.out.println(dato.toString());
        dato.setTime(100000000000l);
        System.out.println(dato.toString());
    }
    
}
