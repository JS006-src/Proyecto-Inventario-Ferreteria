package com.mycompany.inventarioferreteria.estructuras;
import java.util.ArrayList;
import java.util.List;
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
        return searchRec(root, id);
    }
    public List<Producto> inOrder(){
        List<Producto> result = new ArrayList<>();
        inOrderRec(root, result);
        return result;
    }
    private void inOrderRec(Nodo current, List<Producto> result){
        if (current == null){
            return;
        }
        inOrderRec(current.getLeft(),result);
        result.add(current.getData());
        inOrderRec(current.getRight(),result);
    }
    private Producto searchRec(Nodo current, String id){
        if (current == null){
            return null;
        }
        int comparison = id.compareTo(current.getData().getId());
        if (comparison == 0){
            return current.getData();
        }
        if (comparison < 0){
            return searchRec(current.getLeft(),id);
        }else{
            return searchRec(current.getRight(),id);
        }
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
