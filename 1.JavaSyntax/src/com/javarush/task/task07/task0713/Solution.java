package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ArrayMult3 = new ArrayList<>();
        ArrayList<Integer> ArrayMult2 = new ArrayList<>();
        ArrayList<Integer> ArrayOther = new ArrayList<>();

        for (int i = 0; i != 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();

        for (Integer index : list ){
            if (index % 3 != 0 && index % 2 != 0 ){
                ArrayOther.add(index);

            }else {
                if (index % 2 == 0){
                ArrayMult2.add(index);
            }
                if (index % 3 == 0) {
                ArrayMult3.add(index);
              }
            }
        }
        printList(ArrayMult3);
        printList(ArrayMult2);
        printList(ArrayOther);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer index : list){
            System.out.println(index);
        }

    }
}
