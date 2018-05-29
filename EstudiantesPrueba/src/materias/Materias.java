/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materias;

/**
 *
 * @author ESFOT
 */
public class Materias {

    private String materias;
    private int nivel;

    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Materias(String materias) {
        this.materias = materias;
        
    }

    public Materias(int nivel) {
        this.nivel = nivel;
    }
     
    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public Materias(String materias, int nivel) {
        this.materias = materias;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materias:" + materias + "Nivel:" + nivel;
    }

  
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
