package Patika3_4Weeks;

public class Letter {
    public static void main(String[] args) {
        String letter[][] = new String[7][4];

        for(var i = 0; i < letter.length; i++) {
            for (var j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == letter.length-1 || i == (letter.length-1)/2){
                    letter[i][j] = " * ";
                }
                else {
                    letter[i][0] = " * ";
                    letter[i][letter[i].length-1] = " * ";
                }
            }
        }
        for (var i = 0 ; i<letter.length ; i++) {
            for (var j : letter[i]) {
                if ( j == " * "){
                    System.out.print(j);
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

}
