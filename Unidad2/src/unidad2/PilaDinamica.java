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
public class PilaDinamica {
    private int tope=-1;
    private int size=10;
    Object v[];
    Object x[];

    public PilaDinamica() {
        
        v=new Object [size];
    }
    public boolean isEmpty(){
        if(tope==-1)
            return true;
        else
            return false;
    }
    public boolean nohayEspacio(){
        if(tope==v.length-1)
            return true;
        else
            return false;
    }
    public void push(Object n){
        int i;
        if(nohayEspacio()==true){//es el isFull()
            size=size+10;
            x=new Object[size];
            for(i=0; i<=v.length-1;i++)
                x[i]=v[i];
            v=new Object[size];
            for(i=0;i<=x.length-1;i++)
                v[i]=x[i];
            tope++;
            v[tope]=n;
        }
        else{
            tope++;
            v[tope]=n;
        }    
    }
    public Object pop(){
        Object a=-1;
        if(isEmpty()==true){
            System.out.println("La pila esta vacia");
        }
        else{
            a=v[tope];
            tope--;
        }
        return a;
    }
    public Object getTope(){
        Object a;
        if(isEmpty()==true){
            System.out.println("La pila esta vacia");
            return -1;
        }
        else{
            a=v[tope];
            return a;
        }
    }
    public int getSize(){
        return size;
    }
}
