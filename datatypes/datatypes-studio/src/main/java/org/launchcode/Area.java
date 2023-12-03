package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input;


        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        Circle mattCircle = new Circle();
        System.out.println("The area of the circle is: " + mattCircle.getArea(radius));

    }

}





