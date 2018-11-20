package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i != 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();
        int count = 1;
        int temp = 1;

       for (int i = list.size() - 1; i != 0; i--){
           if (list.get(i - 1).equals(list.get(i))){
               if (++temp > count){
                   count = temp;
               }
           }else{
               temp = 1;
           }
       }
        System.out.println(count);

    }
}