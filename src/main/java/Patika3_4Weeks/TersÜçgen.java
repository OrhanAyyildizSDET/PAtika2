package Patika3_4Weeks;

import java.util.Scanner;

public class TersÜçgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the row size");
        int rowSize = scanner.nextInt();
        for (var i = 0 ; i < rowSize ; i++) {
            for (var k = 0 ; k < i+1 ; k++) {
                System.out.print(" ");
            }
            for (var j = 0 ; j < (rowSize-i-1)*2 + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
