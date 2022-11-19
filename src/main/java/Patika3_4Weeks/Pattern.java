package Patika3_4Weeks;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int number = scanner.nextInt();
        int pattern = number;
        pattern(number,pattern,true);
    }
    static void pattern(int a,int b,boolean flag){
//        ı used c variable for stable a value to compare it again when ı increase the number
        int c = b;
//ı need flag to change my increase-decrease direction
        System.out.print(a+"  ");
        if (a-5>-5 && flag){
            a -= 5;
            pattern(a,c,true);
        }
//        ı send my values and false boolean so my recursive method go only else part
        else {
            if (a<c){
                a += 5;
                pattern(a,c,false);
            }
        }

    }
}
