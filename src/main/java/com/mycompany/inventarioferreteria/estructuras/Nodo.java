package com.mycompany.inventarioferreteria.estructuras;
/*@author alexh*/
import com.mycompany.inventarioferreteria.modelo.Producto;
public class Nodo {
    private Producto data;
    private Nodo left;
    private Nodo right;
    
    public Nodo (Producto data){
        this.data = data;
    }
    public Producto getData(){
        return data;
    }
    public Nodo getLeft(){
        return left;
    }
    public void setLeft(Nodo left){
        this.left = left;
    }
    public Nodo getRight(){
        return right;
    }
    public void setRight(Nodo right){
        this.right = right;
    }

    public void setData(Producto data){
        this.data = data;
    }
}
