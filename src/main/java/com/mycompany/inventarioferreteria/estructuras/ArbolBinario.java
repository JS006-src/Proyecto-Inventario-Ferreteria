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
    public List<Producto> searchByName(String name){
        List<Producto> result = new ArrayList<>();
        searchByNameRec(root,name.toLowerCase(),result);
        return result;
    }
    public boolean delete(String id){
        if (searchById(id) == null){
            return false;
        }
        root = deleteRec(root, id);
        return true;
    }   
    private Nodo deleteRec(Nodo current, String id){
        if (current == null){
            return null;
        }
        int comparison = id.compareTo(current.getData().getId());
        
        if (comparison < 0){
            current.setLeft(deleteRec(current.getLeft(), id));
        }else if(comparison > 0){
            current.setRight(deleteRec(current.getRight(), id));
        }else {
            if(current.getLeft() == null){
                return current.getRight();
            }
            if(current.getRight() == null){
                return current.getLeft();
            }
            Nodo successor = current.getRight();
            while (successor.getLeft() != null){
                successor = successor.getLeft();
            }
            current.setData(successor.getData());
            current.setRight(deleteRec(current.getRight(), successor.getData().getId()));
        }
        return current;
    }
    private void searchByNameRec(Nodo current, String name, List<Producto> result){
        if (current == null){
            return;
        }
        searchByNameRec(current.getLeft(),name,result);
        if (current.getData().getName().toLowerCase().contains(name)){
            result.add(current.getData());
        }
        searchByNameRec(current.getRight(),name,result);
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
