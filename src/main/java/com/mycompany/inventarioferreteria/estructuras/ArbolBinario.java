package com.mycompany.inventarioferreteria.estructuras;
/*@author alexh*/
import com.mycompany.inventarioferreteria.modelo.Producto;

public class ArbolBinario {
    private Nodo root;
    
    public ArbolBinario(){}
    public boolean insert(Producto product){
        if (searchById(product.getId())!= null){
            return false;
        }
        root = insertRec(root, product);
        return true;
    }
    public Producto searchById(String id){
        return null;
    }
    private Nodo insertRec(Nodo current,Producto product){
        
        if(current == null){
           return new Nodo(product);
        }
        
        int comparison = product.getId().compareTo(current.getData().getId());
        
        if (comparison < 0){
            current.setLeft(insertRec(current.getLeft(),product));
        }else{
            current.setRight(insertRec(current.getRight(),product));
        }
        
        return current;
    }
    
} 
