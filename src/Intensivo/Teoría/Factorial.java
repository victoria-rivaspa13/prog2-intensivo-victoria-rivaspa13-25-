package Intensivo.Teoría;

class Factorial{

    int factorial (int n){
        int e = n, fac = 1;
        while (e > 0){
            fac = fac * e;
            e = e - 1;
        }
        return fac;
    }

    }

