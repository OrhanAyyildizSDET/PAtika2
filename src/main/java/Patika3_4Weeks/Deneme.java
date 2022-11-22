package Patika3_4Weeks;

import java.util.Scanner;

public class Deneme {
    public static void pattern(int number, int temp, int signal){
        System.out.print(temp+" ");
        temp += (5*signal);

        if(signal==1){
            // sinyal 1 e döndüyse 1 le devam etsin
            if(temp<=number)
                pattern(number,temp,1);
        }else{
            // sinyal -1 se azaltam gerçekleşiyo
            if(temp>0)
                pattern(number,temp,-1);
            else{
                pattern(number,temp,1);
            }

        }





    }

    public static void main(String[] args) {
        // write your code here
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        number = scanner.nextInt();

        pattern(number,number,-1);





    }
}
