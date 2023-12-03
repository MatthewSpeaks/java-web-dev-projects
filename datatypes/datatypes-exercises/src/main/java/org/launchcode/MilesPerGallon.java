package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles: ");
        double miles = input.nextDouble();

        System.out.println("How much gas: ");
        double gallons = input.nextDouble();

        double milesPerGallon = miles / gallons;
        System.out.println("You have " + milesPerGallon + "miles per gallon.");
    }
}
