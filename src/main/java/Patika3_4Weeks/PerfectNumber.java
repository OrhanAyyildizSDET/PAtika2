package Patika3_4Weeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/
public class PerfectNumber {
    //    here ı created  list to store my divided numbers
    private static List<Integer> list = new ArrayList<>();
    //    here ı create j variable from 1 and increase it by 1
    private static int j = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int sayı = scanner.nextInt();

        perfect(sayı);

        System.out.println(list);
//        here ı used for loop and make addition for compare total and numbers is equal or not
        int total = 0;
        for(var i = 0;i<list.size();i++){
            total += list.get(i);
        }
        System.out.println(total == sayı ?"Perfect Number":"Not perfect number");
    }
    //    ı used here recursive method
    static void perfect(int number) {
        if (number>j){
            if (number%j == 0){
                list.add(j);
                j++;
                perfect(number);
            }
            else {
                j++;
                perfect(number);
            }
        }
    }
}
