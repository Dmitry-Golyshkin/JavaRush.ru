package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap< String,String > map = new HashMap<>();
        for (int i = 0; i != 10; i++) {
            map.put("Don" + i, "Nod" + i + "!");
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        Iterator<HashMap.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()) {
            //получение «пары» элементов
            HashMap.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();        //значение
            iterator.remove();
            if (copy.containsValue(value)) {
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
