package Arbeitsblatt_14;

import java.util.Scanner;

public class Aufgabe_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrom = false;

        System.out.print("Bitte geben Sie ihr Wort ein: ");
        String word = scanner.next();

        for(int x = 0; x < word.length(); x++){
            if(word.charAt(x) == word.charAt(word.length()-x-1)){
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
        }

        if(isPalindrom){
            System.out.println(word + " ist ein Palindrom!");
        }else{
            System.out.println(word + " ist kein Palindrom!");
        }

    }
}
