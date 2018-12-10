package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Scanner;


public class CharCount {
    private static void characterCount(String inputString){

        //remove all non alpha numeric characters from input string(Exclude non-alphabetic characters)
        String onlyAlphaNumeric = inputString.replaceAll("[^a-zA-Z]", "");

        //change input string to only lowercase(Make the counts case-insensitive)
        onlyAlphaNumeric = onlyAlphaNumeric.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = onlyAlphaNumeric.toCharArray();

        for (char c : strArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c, 1);
            }

        }
        for (Character key : charCountMap.keySet()) {
            System.out.println(key + "=" + charCountMap.get(key));
        }
    }

    public static void main(String[] args) {
        //Get the string as input from the user at the command line
        System.out.print("Enter text: ");
        Scanner inputText = new Scanner(System.in);
        String textInput = inputText.nextLine();
        characterCount(textInput);
    }
}