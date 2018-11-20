package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<>(Arrays.asList("January","February","March","April","May","June","Jule","August","September","October","November","December"));
        int numberMonth = 0;
        String s = reader.readLine();
        for (int i = 0; i != list.size(); i++){
            if (s.equals(list.get(i))){
                numberMonth = ++i;
                break;
            }
        }
        System.out.printf("%s is %d month",s, numberMonth);
    }

}
