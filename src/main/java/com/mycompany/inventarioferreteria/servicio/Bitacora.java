package com.mycompany.inventarioferreteria.servicio;
/*@author alexh*/
import com.mycompany.inventarioferreteria.modelo.Baja;
import java.util.ArrayList;
import java.util.List;
public class Bitacora {
    private final List<Baja> bajas = new ArrayList<>();
    public Bitacora (){}
    public List<Baja> getBajas(){
        return new ArrayList<>(bajas);
    }
    public void addBaja(Baja baja){
        if (baja == null){
            throw new IllegalArgumentException("No se puede agregar una baja vacia");
        }
        bajas.add(baja);
    }
}
