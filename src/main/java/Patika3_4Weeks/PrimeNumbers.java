package Patika3_4Weeks;

import java.util.Scanner;

public class PrimeNumbers {
    /*
	 	Print prime numbers which are less than the given number
	*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner   (System.in);
        int prime = scanner.nextInt();
//        here ı eliminate the numbers which less than 3
        if (prime<4){
            if (prime == 3){
                System.out.println("Prime number is : "+2);
            } else if (prime == 2) {
                System.out.println("There is no prime number");
            } else if (prime<0) {
                System.out.println("You entered negative number");
            }
        }
        else {
            String primes = "2  ";
            int counter = 0;
            for (var i = 3; i < prime; i++) {
                for (var j = 2; j < i;) {
                    if (i%j != 0){
                        j++;
                    }
                    else {
                        counter++;
                        break;
                    }
                }
                if (counter == 0){
                    primes += i+"  ";
                }
                counter = 0;
            }
            System.out.println(primes);
        }

        //2. way ı used here two methods which bond each other

        printPrime(prime);
    }
    private static boolean isPrime(int prime){

        if (prime <= 1) {
            return false;
        }

        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrime(int prime){
        for (int i = 2; i <= prime; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
