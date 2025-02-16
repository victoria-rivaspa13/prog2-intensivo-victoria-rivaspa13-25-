package Intensivo.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Sets {
    // se usa un Set<String> para almacenar los nombres de ingredientes alcohólicos
    // se inicializa con un HashSet que permite búsquedas rápidas

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco", "aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));

    // el metodo checkDrinks recibe el nombre de la bebida y la lista de ingredientes de la bebida
    public static String checkDrinks(String name, List<String> ingredients) {
        // se recorre la lista de ingredients
        for (String ingredient : ingredients) {
            // se verifica si cada ingrediente esta en el set ALCOHOLS
            if (ALCOHOLS.contains(ingredient)) {
                // si el ingrediente esta en el set ALCOHOLS se devuelve el nombre de la bebida + Cocktail
                return name + " Cocktail";
            }
        }
        // si el ingrediente no está en el set ALCOHOLS se devuelve el nombre de la bebida + Mocktail
        return name + " Mocktail";
    }
}

