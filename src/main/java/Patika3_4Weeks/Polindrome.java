package Patika3_4Weeks;

import java.util.Arrays;
import java.util.Scanner;

public class Polindrome {
    /* 	Create a program checks if a String is palindrome or not.
        If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
       For example, "madam" or "nurses run".	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim().replace(" ","").toLowerCase();
        String[] words = str.split("");
        String[] phrase = new String[words.length];
        var count = 0;
        for (var i = words.length - 1; i >= 0; i--) {
            phrase[count] = words[i];
            count++;
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(phrase));
        System.out.println(Arrays.equals(words, phrase) ?"Polindrome": "is not palindrome");
        //Second way
        String reverseWord = "";
        for (var i = str.length()-1; i >= 0; i--){
            reverseWord += str.charAt(i);
        }
        System.out.println(reverseWord.equals(str)?"Polindrome": "is not palindrome");
    }
}
