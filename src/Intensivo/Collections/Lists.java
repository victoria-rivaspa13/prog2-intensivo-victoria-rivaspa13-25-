package Intensivo.Collections;

import java.util.List;

public class Lists {
    // declara un atributo List de tipo lista que va a almacenar los elementos
    private List<String> list;

    // constructor
    public Lists(List<String> list) {
        this.list = list;
    }

    // objetivo: encontrar el indice de la primera ocurrencia de un String en la lista
    public int indexOf(String value) {
        // se recorre la lista con un for
        for (int i = 0; i < list.size(); i++) {
            // si el elemento en la posición i coincide con el valor se retorna i
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // objetivo: encontrar el índice de la primera ocurrencia de un string a partir de un indice especifico
    public int indexOfByIndex(String value, int index) {
        // recorre la lista desde index buscando la primera ocurrencia de value
        for (int i = index; i < list.size(); i++) {
            // si encuentra la priemra ocurrencia de value devuelve i si no -1
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // objetivo: busca el primer índice donde haya un string vacío
    public int indexOfEmpty() {
        // recorre la lista y verifica si el elemento en la posición i es ""
        for (int i = 0; i < list.size(); i++) {
            // si lo encuentra devuelve el índice, si no retorna -1
            if (list.get(i).equals("")) {
                return i;
            }
        }
        return -1;
    }

    // objetivo: colocar un string en el primer lugar vacío de la lista
    public int put (String value){
        // llama al metodo indexOfEmpty para encontrar un índice vacío
        int emptyIndex = indexOfEmpty();
        // si existe emptyIndex != -1, coloca el valor en esa posición
        if (emptyIndex != -1) {
            list.set(emptyIndex, value);
        }
        return emptyIndex;
    }

    // objetivo: eliminar todas las apariciones de un string en la lista reemplázandolas por "" y retorna cuantas eliminaciones se hicieron
    public int remove (String value){
        int count = 0;
        // se recorre la lista verificando si el elemento en i es igual al value
        for (int i = 0; i < list.size(); i++) {
            // si i = value, lo cambia a "" y aumenta count
            if (list.get(i).equals(value)) {
                list.set(i, "");
                count++;
            }
        }
        // retorna la cantidad de eliminaciones
        return count;
    }

}
