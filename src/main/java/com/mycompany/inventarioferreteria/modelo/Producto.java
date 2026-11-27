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
        if(id == null || !id.matches("\\d{9}")){
            throw new IllegalArgumentException("La clave debe tener 9 dígitos");
        }
        this.id = id;
        setName(name);
        setStock(stock);
        setRack(rack);
        setPrice(price);
        setImage(image);
    }
    
    public String getId(){ 
        return id;
    }
    public String getName(){
        return name;
    }
    public final void setName(String name){
        validateText(name,100,"nombre");
        this.name = name;
    }
    public int getStock(){
        return stock;
    }
    public final void setStock(int stock){
        if (stock < 0){
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }
    public String getRack(){
        return rack;
    }
    public final void setRack(String rack){
        validateText(rack, 20, "anaquel");
        this.rack = rack;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public final void setPrice(BigDecimal price){
        if (price == null || price.signum() <= 0 || price.stripTrailingZeros().scale() > 2){
            throw new IllegalArgumentException("El precio debe ser mayor que 0 con maximo 2 decimales");
        }
        this.price = price;
    }
    public String getImage(){
        return image;
    }
    public final void setImage(String image){
        validateText(image,255,"imagen");
        String path = image.toLowerCase();
        if (!path.endsWith(".jpg") && !path.endsWith(".jpeg") && ! path.endsWith(".png")){
            throw new IllegalArgumentException ("La imagen debe ser jpg, jpeg o png");
        }
        this.image = image;
    }
    private static void validateText(String text, int maxLength, String field){
        if (text == null || text.isBlank() || text.length()>maxLength){
            throw new IllegalArgumentException("Valor no válido en el campo: " + field);
        }
    }
    
}
