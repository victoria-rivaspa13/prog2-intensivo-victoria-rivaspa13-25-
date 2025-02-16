package Intensivo.Composition;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        // Si el año es divisible por 400, es bisiesto
        if (year % 400 == 0) {
            return true;
        }
        // Si el año es divisible por 100 pero no por 400, no es bisiesto
        if (year % 100 == 0) {
            return false;
        }
        // Si el año es divisible por 4, es bisiesto
        if (year % 4 == 0) {
            return true;
        }
        // Si no se cumple ninguna de las condiciones anteriores, no es bisiesto
        return false;
    }
}
