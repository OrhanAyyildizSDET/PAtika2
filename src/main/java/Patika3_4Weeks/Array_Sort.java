package Patika3_4Weeks;
/*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve
dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99*/

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number for size ");
        int size = scanner.nextInt();

        int numbers[] = new int[size];
        for (var i = 0; i < numbers.length; i++){
            System.out.print("Please enter the "+(i+1)+". number ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(sortArray(numbers)));
    }
    public static int[] sortArray(int[] numbers){
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            int a = numbers[i];
            int b = numbers[numbers.length - i -1];
            numbers[i] = b;
            numbers[numbers.length - i - 1] = a;
        }
        return numbers;
    }
}
