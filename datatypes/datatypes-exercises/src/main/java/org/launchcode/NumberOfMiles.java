package org.launchcode;
import java.util.Scanner;

public class NumberOfMiles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the mils you have drive: ");
        Double userMilesNum = input.nextDouble();
        System.out.println("The amount of gas you used: ");
        Double userGasNum = input.nextDouble();

        System.out.println("Your miles-per-gallon is " + (userMilesNum/userGasNum) + "mpg.");
    }
}
