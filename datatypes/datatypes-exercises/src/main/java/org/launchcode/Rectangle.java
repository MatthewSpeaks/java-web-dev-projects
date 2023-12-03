package org.launchcode;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        double rectLength = input.nextDouble();
        System.out.println("What is the width? ");
        double rectWidth = input.nextDouble();

        double rectArea = rectLength * rectWidth;

        System.out.println("Rectangle Area: " + rectArea);
    }
}
