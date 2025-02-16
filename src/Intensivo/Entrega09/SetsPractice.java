package Intensivo.Entrega09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsPractice {
}

class DrinkChecker {
    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList(
            "whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco", "aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"
    ));

    public static String checkDrinks(String drinkName, List<String> ingredients) {
        // Recorremos los ingredientes para ver si alguno es alcohólico
        for (String ingredient : ingredients) {
            if (ALCOHOLS.contains(ingredient.toLowerCase())) {
                return drinkName + " Cocktail";
            }
        }
        // Si no hay ingredientes alcohólicos, es un mocktail
        return drinkName + " Mocktail";
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<String> cocktailIngredients = Arrays.asList("vodka", "orange juice", "cranberry juice");
        System.out.println(checkDrinks("Screwdriver", cocktailIngredients)); // Screwdriver Cocktail

        List<String> mocktailIngredients = Arrays.asList("orange juice", "lemon juice", "grenadine");
        System.out.println(checkDrinks("Shirley Temple", mocktailIngredients)); // Shirley Temple Mocktail
    }
}


