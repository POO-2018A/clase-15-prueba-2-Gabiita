/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantesprueba;

import java.util.Scanner;
import nombre.Nombre;
import edad.Edad;
import materias.Materias;


public class EstudiantesPrueba {


    public static void main(String[] args) { 
        String ListaEstudiantes []= new String[5];
        String ListaMaterias[]=new String[2];
        int ListaNiveles[]=new int[2];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("##BIENVENIDO##");
        System.out.println("POR FAVOR INGRESE LOS DATOS DE LOS 5 ESTUDIANTES");
        
        for(int i=0; i<ListaEstudiantes.length; i++){
        System.out.println("ESTUDIANTE #: "+(i+1));
        System.out.println("NOTA:DAR ENTER ANTES DE INGRESAR EL NOMBRE DEL PRIMER ESTUDIANTE");
        System.out.print("INGRESE EL NOMBRE:");
        scan.nextLine();
        String nombreAlumno=scan.nextLine();
        System.out.print("INGRESE EL APELLIDO:");
        String apellidoAlumno=scan.nextLine();
        System.out.print("INGRESE LA EDAD:");
        int edadAlumno=scan.nextInt();
        
        System.out.println("INGRESE EL NOMBRE DE CADA MATERIA");
       
        for(int j=0; j<ListaMaterias.length; j++){
        System.out.println("MATERIA: "+(j+1));
        scan.nextLine();
        String nombreMateria=scan.nextLine();
        Materias materias=new Materias(nombreMateria);
          System.out.println(materias);
         
        }
        System.out.println("INGRESE EL NIVEL");
        for(int k=0;k<ListaNiveles.length; k++){
        System.out.println("NIVEL PARA LA MATERIA "+(k+1)+ ": ");
        int nombreNivel=scan.nextInt();
        Materias materias=new Materias(nombreNivel);
          System.out.println(materias);

                }
        
        Nombre nombre = new Nombre (nombreAlumno,apellidoAlumno);
        System.out.println(nombre);
        Edad edad=new Edad(edadAlumno);
        System.out.println(edad);
      
          
        }
    }
    
}
