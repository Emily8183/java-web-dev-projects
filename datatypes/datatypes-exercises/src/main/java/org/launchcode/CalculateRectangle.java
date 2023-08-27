package org.launchcode;
import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int userLength = input.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int userWidth = input.nextInt();

        System.out.println("The area of your rectangle is " + (userLength * userWidth));
    }
}
