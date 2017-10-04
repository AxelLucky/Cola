/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author Propietario
 */
public class TestPila {
    public static void main(String [] args){
        Colas c=new Colas();
        for(int i=0;i<=30;i++){
            c.encolar(i);
        }  
        c.borrar();
        c.borrar();
        c.encolar("Hola");
        c.encolar(2);
        System.out.println("El primero es "+c.getPrimero()+" y el ultimo es "+c.getUltimo());
        System.out.println("La cola mide "+c.getSize());
        c.imprimir();
    }
}
