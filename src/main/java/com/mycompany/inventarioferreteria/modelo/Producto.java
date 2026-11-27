/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventarioferreteria.modelo;
/*@author alexh*/

import java.math.BigDecimal;
public class Producto {
    private final String id;
    private String name;
    private int stock;
    private String rack;
    private BigDecimal price;
    private String image;
    
    public Producto (String id, String name, int stock, String rack, BigDecimal price, String image){
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.rack = rack;
        this.price = price;
        this.image = image;
    }
    
    public String getId(){ 
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public String getRack(){
        return rack;
    }
    public void setRack(String rack){
        this.rack = rack;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    
}
