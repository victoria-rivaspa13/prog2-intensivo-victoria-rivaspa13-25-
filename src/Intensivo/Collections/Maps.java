package Intensivo.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    // objetivo: crear un inventario a partir de una lista de artículos
    // se declara un Map<String, Integer> llamado inventory para almacenar los artículos y sus cantidades
    public static Map<String, Integer> createInventory(List<String> articulos) {
        Map<String, Integer> inventory = new HashMap<>();
        // se recorre la lista items
        for (String item : articulos) {
            // se obtiene el valor actual del artículo con inventory.get(item)
            // si el artículo no está en el mapa, get(item) devuelve null por eso != null
            int count = inventory.get(item) != null ? inventory.get(item) : 0;
            // se incrementa el contador en 1 y se almacena en el inventory
            inventory.put(item, count + 1);
        }
        return inventory;
    }

    // objetivo: agregar artículos a un inventario existente
    public static Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        // se recorre la lista items
        for (String item : items) {
            // para cada item se obtiene la cantidad actual del artículo con inventory.get(item)
            // si get(item) es null se asume el valor de 0
            int count = inventory.get(item) != null ? inventory.get(item) : 0;
            // se suma 1 a la cantidad y se guarda de nuevo en el mapa
            inventory.put(item, count + 1);
        }
        return inventory;
    }

    // objetivo: reducir en 1 la cantidad de cada artículo en la lista items
    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        // se recorre la lista items
        for (String item : items) {
            // para cada elemento se verifica que el artículo exista en el map y si su cantidad es mayor a 0
            if (inventory.containsKey(item) && inventory.get(item) > 0) {
                // si cumple con ambas condiciones, se reduce su cantidad en 1
                inventory.put(item, inventory.get(item) - 1);
            }
        }
        return inventory;
    }

    // objetivo: eliminar completamente un artículo del inventario
    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        // se usa inventory.remove(item) para eliminar la clave y su valor del mapa
        inventory.remove(item);
        return inventory;
    }

    // objetivo: devolver una lista de artículos con cantidad mayor a 0
    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // se inicializa una lista availableItems para almacenar los elementos disponibles
        List<Map.Entry<String, Integer>> availableItems = new ArrayList<>();
        // se recorre el mapa y se verifica si el valor entry.getValue() es mayor a 0
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                // si cumple la condición se agrega el artículo a availableItems
                availableItems.add(entry);
            }
        }
        return availableItems;
    }
}




