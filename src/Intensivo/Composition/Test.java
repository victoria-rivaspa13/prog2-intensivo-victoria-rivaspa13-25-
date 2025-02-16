package Intensivo.Composition;
import java.util.*;

import java.util.HashMap;

class Test{
    private List <String> list = new ArrayList<>();
    private Set <String> set = new HashSet<>();
    private Map <String, PhoneBill> map = new HashMap<>();


    public Test() {

        list.add("Facundo");
        list.remove("Facundo");

        List<String> alumnos = list.subList(0, 1);

        for (int i = 0; i < list.size(); i++) { System.out.println(i + " " + list.get(i));
        }
        for (String s : list) {
            System.out.println("s = " + s);
        }
        int i = 0;
        while (i < list.size()) {
        System.out.println(list.get(i));
        i++;
    }
    }
}

