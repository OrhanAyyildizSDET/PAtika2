package Patika3_4Weeks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num = scanner.nextInt();
        fibo(num);
        fibo01(num);
        System.out.println();
        System.out.println("========================================================================");
//        3. perfect way
        int n, i=1, j=1, count=0,temp=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of elements in Fibonacci Sequence: ");
        n= input.nextInt();
        System.out.print("The result: ");
        do {
            System.out.print(temp + " ");
            temp += i;
            i= temp- i;
            count++;
        }while(count!=n);
    }
//    1. way ı used 3 variables to change my values into each others
    static void fibo(int number){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 0; i <number; i++){
            b = a + c;
            System.out.print(a+" + "+c+" = "+b+" - ");
            c = a;
            a = b;

        }
        System.out.println();
        System.out.println("================================================================================");
    }

//    2. way
    static void fibo01(int number){
        int a = 0;
        int b = 1;
        int newNumber;
        if (number%2 == 0) {
            newNumber = number / 2;
        }
        else{
            newNumber = number/2+1;
            }
        for(int i = 0; i <newNumber; i++){
            b = a+b;
            System.out.print(b+"  ");
            a = b+a;
            System.out.print(a+"  ");
        }

    }

}
