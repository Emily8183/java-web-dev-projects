package org.launchcode;
import java.util.Scanner;

public class AliceAdventures1 {
    public static void main(String[] args){
        String aliceQuote = "You may want to write the string above on more than one line in your solution. Java 17 and IntelliJ gives you a few options to do so. The easiest, thanks to your IDE, is to press Enter as you type the string. IntelliJ will close the string and concatenate it with the next line to create one longer string.";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a term you want to search: ");
        String userTerm = input.nextLine();

        Boolean hasUserTerm = aliceQuote.toUpperCase().contains(userTerm.toUpperCase());
        System.out.println(hasUserTerm);

        Integer index = aliceQuote.indexOf(userTerm);
        Integer length = userTerm.length();

        System.out.println(index);
        System.out.println(length);

        String newSentence = aliceQuote.replace(userTerm,"");
        System.out.println(newSentence);

    }
}



