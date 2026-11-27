package com.mycompany.inventarioferreteria.modelo;
/*@author alexh*/
import java.time.LocalDateTime;
public class Baja {
    private final Producto item;
    private final String reason;
    private final LocalDateTime date;
    private final Usuario user;
    public Baja(Producto item, String reason, Usuario user){
        if (item == null){
            throw new IllegalArgumentException("No se puede dar una baja sin objeto");
        }
        this.item = item;
        if (reason == null || reason.isBlank()){
            throw new IllegalArgumentException("No se puede realizar una baja sin razon");
        }
        this. reason = reason;
        this.date = LocalDateTime.now();
        if (user == null){
            throw new IllegalArgumentException("No se puede dar una baja sin usuario");
        }
        this.user = user;
    }
    public Producto getItem(){
        return item;
    }
    public  String getReason(){
        return reason;
    }
    public LocalDateTime getDate(){
        return date;
    }
    public Usuario getUser(){
        return user;
    }
}

