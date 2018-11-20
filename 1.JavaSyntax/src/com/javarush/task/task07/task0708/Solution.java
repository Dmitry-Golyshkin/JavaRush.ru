package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;



    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i != 5; i++){
            strings.add(input.readLine());
        }
        input.close();

        int max = strings.get(0).length();

        for (int i = 1; i != 5; i++){
            if (max < strings.get(i).length())
                max = strings.get(i).length();

        }
        for (String s :
                strings) {
            if (s.length() == max) {
                System.out.println(s);
            }
        }

    }
}
