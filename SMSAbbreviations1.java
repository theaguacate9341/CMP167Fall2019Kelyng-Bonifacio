package com.company;
import java.util.Scanner;
public class SMSAbbreviations1 {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the SMS Abbreviation: ");
        String abbreviation = scnr.nextLine();

        String Translation = "";

        if (abbreviation.equals("LOL") || abbreviation.equals("lol")) {
            Translation = "Laughing Out Loud";
        }
        else if (abbreviation.equals("TMI") || abbreviation.equals("tmi")){
            Translation = "Too Much Information";
        }
        else if (abbreviation.equals("SMH") || abbreviation.equals("smh")){
            Translation = "Shaking My Head";
        }
        else {
            Translation = "Unknown Abbreviation";
        }



        System.out.println(abbreviation + " means " + Translation);
        return;

    }
}
