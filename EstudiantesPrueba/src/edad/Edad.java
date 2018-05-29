/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import java.util.logging.Logger;

/**
 *
 * @author ESFOT
 */
public class Edad {

   private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Edad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Edad: " + edad;
    }
   
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
