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
public class Colas {
    private Object []ass;
    private Object []ayuda;
    private int primero=0;
    private int ultimo=-1;
    private int size=10;
    private int tamanio=0;
    
    public Colas(){
        ass=new Object[size];
    }
    public boolean isEmpty(){
        if (primero==0 && ultimo==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(ultimo==ass.length-1)
            return true;
        else
            return false;
    }
    public void encolar(Object n){
        int i=0;
        if(isFull()==true){
           size=size+10;
           ayuda=new Object[size];
           for(i=0; i<=ass.length-1;i++)
                ayuda[i]=ass[i];
            ass=new Object[size];
            for(i=0;i<=ayuda.length-1;i++)
                ass[i]=ayuda[i];
            ultimo++;
            ass[ultimo]=n;
            tamanio++;
        }
        else{
            ultimo++;
            ass[ultimo]=n;
            tamanio++;
        }
    }
    public Object borrar(){
        Object a;
        if(isEmpty()==true){
            System.out.println("Tu cola esta vacia");
            return -1;
        }
        else{
            primero++;
            a=ass[primero];
            tamanio--;
            return a;
        }
    }
    public void imprimir(){
        int i,j;
        if(isEmpty()==true)
            System.out.println("Tu cola esta vacia");
        else
            if(primero==-1)
                for(i=0;i<=ultimo;i++)
                    System.out.println(ass[i]);
            else
                for(j=primero;j<=ultimo;j++)
                    System.out.println(ass[j]);
    }
    public Object getPrimero(){
        return ass[primero];
    }
    public Object getUltimo(){
        return ass[ultimo];
    }
    public int getSize(){
        return tamanio;
    }
}
