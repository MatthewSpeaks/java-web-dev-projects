package org.launchcode;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What isyour name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
