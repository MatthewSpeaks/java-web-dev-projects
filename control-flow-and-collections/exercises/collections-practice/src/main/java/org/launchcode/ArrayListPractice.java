package org.launchcode;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<Integer> randomInts = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < 30; i++) {
            randomInts.add(randomNumber.nextInt());
        }
        int total = 0;

        for (int integer : randomInts) {
            if (integer % 2 == 0) {
                total += integer;
            }
            }



        System.out.println(randomInts);
        System.out.println(total);

        //Write a static method to print out each word in a list that has exactly 5 letters.
        
    }

    }

