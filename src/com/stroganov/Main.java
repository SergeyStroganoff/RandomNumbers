package com.stroganov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

    public static void main(String[] args) {

	// my code here

        System.out.println("Введите колличество случайных чисел");
        int number = 0;

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());

        } catch (NumberFormatException e) {
           // e.printStackTrace();
            System.out.println("Вы ввели не число");
            main(new String[]{""});
        } catch (IOException l) {

            System.out.println("Произошла ошибка ввода вывода" );
            l.printStackTrace();
        }

        Random r = new Random();

        int [] array = new int [number];


        for (int i=0; i<number; i++){
            int x = r.nextInt(100);
            //System.out.println(x);
            array[i]=x;
        }


        for (int index: array
             ) {
            System.out.println(index);
        }

        for (int index: array
        ) {
            System.out.print(index+" ");
        }


    }
}
