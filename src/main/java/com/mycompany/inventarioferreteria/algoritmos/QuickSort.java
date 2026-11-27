package com.mycompany.inventarioferreteria.algoritmos;
/*@author alexh*/
import com.mycompany.inventarioferreteria.modelo.Producto;
import java.util.Collections;
import java.util.List;
public class QuickSort {
    public static void sortByName(List<Producto> list){
        quickSort(list, 0, list.size() - 1);
    }
    private static void quickSort(List<Producto> list, int low, int high){
        if(low < high){
            int p = partition(list, low , high);
            quickSort(list, low, p-1);
            quickSort(list, p+1, high);
        }
    }
    private static int  partition(List<Producto> list, int low, int high){
        String pivot = list.get(high).getName();
        int i = low;
        for(int j = low; j<high; j++){
            if (list.get(j).getName().compareToIgnoreCase(pivot)<0){
                Collections.swap(list, i ,j);
                i++;
            }
        }
        Collections.swap(list, i, high);
        return i;
    }
}
