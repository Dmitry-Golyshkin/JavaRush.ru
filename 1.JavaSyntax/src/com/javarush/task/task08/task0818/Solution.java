package com.javarush.task.task08.task0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Грибоедов", 200); // 1
        map.put("Пушкин", 20000); // 2
        map.put("Крылов", 2000); // 3
        map.put("Тургенев", 600); // 4
        map.put("Толстой", 350); // 5
        map.put("Достоевский", 450); // 6
        map.put("Глинка", 400); // 7
        map.put("Гоголь", 1500); // 8
        map.put("Некрасов", 380); // 9
        map.put("Чернышевский", 440); // 10
        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Integer> iter = map.values().iterator();

        while (iter.hasNext()){
            if (iter.next() < 500){
                iter.remove();
            }

        }

    }

    public static void main(String[] args) {

    }
}