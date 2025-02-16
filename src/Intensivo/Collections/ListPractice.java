package Intensivo.Collections;


import java.util.*;

public class ListPractice {
    public static int indexOf(String target, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String target, List<String> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    public static int put(String value, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                list.set(i, value);
                return i;
            }
        }
        return -1;
    }

    public static int remove(String target, List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                list.set(i, "");
                count++;
            }
        }
        return count;
    }
}
