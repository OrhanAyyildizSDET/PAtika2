package Patika3_4Weeks;
/*Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.*/

import java.util.HashMap;
import java.util.Map;

public class Recursive_Numbers {
    public static void main(String[] args) {
        int[] numbers = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52,11,7,15,2,2,2};
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (var i = 0; i < numbers.length; i++) {
            int flag = 0;
            for (var j = i ; j < numbers.length ; j++){
                if (numbers[i] == numbers[j]){
                    flag++;
                }
            }
            if (!map.containsKey(numbers[i])){
                map.put(numbers[i],flag );
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            System.out.println(i.getKey()+" is "+i.getValue()+" times written");
        }
    }
}
