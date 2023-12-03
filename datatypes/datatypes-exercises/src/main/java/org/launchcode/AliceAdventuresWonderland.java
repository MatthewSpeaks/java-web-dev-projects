package org.launchcode;
import java.util.Scanner;

        // Part E.Strings

public class AliceAdventuresWonderland {
    public static void main(String[] args) {
        String aliceAdventure = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, ‘and what is the use of a book,’ thought " +
                "Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to search for? ");
        String searchTerm = input.nextLine();

        boolean isTrue = aliceAdventure.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println("Alice's story includes term: " + isTrue);
        int searchResultIndex = aliceAdventure.toLowerCase().indexOf(searchTerm.toLowerCase());
        int searchLength = searchTerm.length();
        int endIndex = searchResultIndex + searchLength;
        System.out.println("Your term is located at index " + searchResultIndex + " and has a length of " + searchLength);

        System.out.println(aliceAdventure);
        System.out.println("\n Now with it removed: \n");
        String removedStringOne = aliceAdventure.substring(0, searchResultIndex);
        String removedStringTwo = aliceAdventure.substring(endIndex);
        System.out.println(removedStringOne + removedStringTwo);
    }
}
