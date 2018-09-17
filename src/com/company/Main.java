package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Type in your first word.");
        String wordOne = kbReader.next();
        System.out.println("Type in your second word.");
        String wordTwo = kbReader.next();

        if (wordOne.length() == wordTwo.length()) {
            

        }

        else {
            System.out.println("Your words are not anagrams of each other.");
            System.exit(0);
       }


    }
}
