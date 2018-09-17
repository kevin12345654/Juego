
import models.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Animal animal=new Animal();
    
         animal.setColor("Azul");
         animal.setNombre("kevin"); 
         animal.setRaza("123");
         animal.setTipo("1234");
         animal.setTamanio("Grande");
         
         
         System.out.println(animal.toString());
    
    }
    
}
