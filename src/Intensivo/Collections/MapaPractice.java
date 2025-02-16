package Intensivo.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapPractice {

class InventoryManager {

    // 2.3.1. Crear un inventario basado en una lista
    public static Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventory = new HashMap<>();
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    // 2.3.2. Añadir artículos a un inventario existente
    public static Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    // 2.3.3. Decrementar artículos del inventario
    public static Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentQuantity = inventory.get(item);
                if (currentQuantity > 0) {
                    inventory.put(item, Math.max(0, currentQuantity - 1));
                }
            }
        }
        return inventory;
    }

    // 2.3.4. Eliminar por completo un artículo del inventario
    public static Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    // 2.3.5. Devolver el contenido del inventario
    public static List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> inventoryList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                inventoryList.add(entry);
            }
        }
        return inventoryList;
    }
}}
