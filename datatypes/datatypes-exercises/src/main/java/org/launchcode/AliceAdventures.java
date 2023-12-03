package org.launchcode;
import javax.naming.directory.SearchResult;
import java.util.Scanner;

public class AliceAdventures {
    public static void main(String[] args) {
        String aliceStory = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to search for? ");
        String searchTerm = input.nextLine();

        boolean searchResult = aliceStory.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println("String is part of Alice's story: " + searchResult);
    }
}
