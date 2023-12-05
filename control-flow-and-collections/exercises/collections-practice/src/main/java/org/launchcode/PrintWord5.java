package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintWord5 {

    public static void main(String[] args){

        String wordArray = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> wordArrayList = new ArrayList<>();
        String[] wordSplit = wordArray.split(" ");

        wordArrayList.addAll(Arrays.asList(wordSplit));

        //System.out.println(wordArrayList);

        Scanner input = new Scanner(System.in);
        System.out.println("Input a word length: ");
        int wordLength = input.nextInt();
        input.close();


        for (String words : wordArrayList) {
            if (words.length() == wordLength) {
                System.out.println(words);
            }
        }



    }
}
