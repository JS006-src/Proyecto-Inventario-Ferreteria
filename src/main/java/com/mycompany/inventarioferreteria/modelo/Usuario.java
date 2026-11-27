package com.mycompany.inventarioferreteria.modelo;

/*@author alexh*/
public class Usuario {
    private final String name;
    private final String pass;
    
    public Usuario(String name, String pass){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.name = name;
        if (pass == null || pass.isBlank()){
            throw new IllegalArgumentException("La contraseña no puede estar vacia");
        }
        this.pass = pass;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean verifyPass(String attempt){
        return pass.equals(attempt);
    }
}
