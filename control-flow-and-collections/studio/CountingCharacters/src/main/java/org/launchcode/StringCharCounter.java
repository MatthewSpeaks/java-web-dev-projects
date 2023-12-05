package org.launchcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StringCharCounter {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two" +
                " terms has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = input.nextLine().toLowerCase();


        char[] charactersInString = userString.toCharArray();
        ArrayList<Character> alphabeticString = new ArrayList<>();
        for ( Character characters : charactersInString) {
            if (Character.isLetter(characters)) {
                alphabeticString.add(characters);
            };
        }

        //System.out.println(charactersInString[1]);

        // Hashmap of characters
        HashMap<Character, Integer> alphaBank = new HashMap<>();

        for (char character : alphabeticString) {
            if (alphaBank.containsKey(character)) {
                alphaBank.put(character, alphaBank.get(character) +1);
            }
            else {
                alphaBank.put(character, 1);
            }
        }

        System.out.println(alphaBank);


    }


}
