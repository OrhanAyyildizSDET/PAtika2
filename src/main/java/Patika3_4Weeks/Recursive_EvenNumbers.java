package Patika3_4Weeks;

public class Recursive_EvenNumbers {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,2,12,567,22,12,4,90,188,90,13};
        String event = "";
        for (var i = 0; i < numbers.length; i++) {
            for (var j = i+1; j < numbers.length; j++) {
                if (numbers[i]%2 == 0){
                    if (numbers[i] == numbers[j]) {
                        event += numbers[i]+"  ";
                    }
                }
            }
        }
        System.out.println("Recursive event numbers are : "+event);
    }
}
