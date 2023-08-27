package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter a radius of a circle: ");
        double userRadius = input.nextDouble();

        System.out.println("The area of the circle is " + Circle.getArea(userRadius));

        input.close();

    }

}
