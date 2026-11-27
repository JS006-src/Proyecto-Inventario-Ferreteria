package com.mycompany.inventarioferreteria;
/*@author alexh*/
import com.mycompany.inventarioferreteria.estructuras.ArbolBinario;
import com.mycompany.inventarioferreteria.modelo.Producto;
import com.mycompany.inventarioferreteria.modelo.Usuario;
import com.mycompany.inventarioferreteria.algoritmos.QuickSort;
import java.math.BigDecimal;
import java.util.List;
public class InventarioFerreteria {

    public static void main(String[] args) {
        ArbolBinario tree = new ArbolBinario();
        BigDecimal price = new BigDecimal("10.50");
        tree.insert(new Producto("000000050", "Martillo", 5, "A1", price, "martillo.jpg"));
        tree.insert(new Producto("000000030", "Clavo", 100, "A2", price, "clavo.png"));
        tree.insert(new Producto("000000070", "Taladro", 3, "B1", price, "taladro.jpg"));
        for (Producto p : tree.inOrder()) {
            System.out.println(p.getId() + " " + p.getName());
        }
        System.out.println(tree.searchById("000000070").getName());
        System.out.println(tree.insert(new Producto("000000030", "Repetido", 1, "A3", price, "x.jpg")));
        for (Producto p : tree.searchByName("MART")) {
            System.out.println("Encontrado: " + p.getName());
        }
        System.out.println(tree.delete("000000050"));
        System.out.println(tree.delete("000000050"));
        for (Producto p : tree.inOrder()) {
            System.out.println(p.getName());
        }
        Usuario user = new Usuario("jano", "abc123");
        System.out.println(user.verifyPass("abc123")); // true
        System.out.println(user.verifyPass(".*"));     // false
        
        List<Producto> list = tree.inOrder();
        list.add(new Producto("000000090", "Broca", 8, "C1", price, "broca.jpg"));
        QuickSort.sortByName(list);
        for (Producto p : list) {
            System.out.println(p.getName());
        }
    }
}
