
package Patika3_4Weeks;

/*Oyun Kuralları :
Oyun metin tabanlıdır.
Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
 Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı.
 Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz,
sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi
bir mayın yok ise "0" değeri atanmalı.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.*/

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Mayın_Tarlası {
    //ı defined my data stores as two dimensional arrays
    static String[][] mineCheck;
    static String[][] minesPlace;
    static String[][] constructMapWhenPlayed;
    static int row;
    static int col;
    public static void main(String[] args) {
        startGame();
    }
    static void startGame(){
        Scanner scanner = new Scanner(in);
        out.print("Please enter a number for row size : ");
        row = scanner.nextInt();
        out.print("Please enter a number for column size : ");
        col = scanner.nextInt();
        //ı defined my mine numbers
        int mines = row * col / 4;
        out.println("You have "+mines+" times mine");
        //here ı defined the rights for enter coordination's
        int enterRight = row*col-mines;

        //ı construct my mine map and placed my mines int the map
        makeMineGameArea(row, col,mines);
        makeMineMap(row,col);

        out.println();
        out.println();
//        for (int i = 0; i <mineCheck.length;i++){
//            out.println(Arrays.toString(mineCheck[i]));
//        }
//        out.println();
//        out.println();
//
        for (int i = 0; i <minesPlace.length;i++){
            out.println(Arrays.toString(minesPlace[i]));
        }
        out.println();
        out.println();
        //here ı said to user enter coordinates for playing game
        for(var i = 0; i < enterRight;i++){
            out.print("Please enter the x coordinate : ");
            int x = scanner.nextInt();
            out.println();
            out.print("Please enter the y coordinate : ");
            int y = scanner.nextInt();
            out.println();
            //here ı check if there is mine or not
            boolean result = enterCoordinations(x,y);
            if (result){
                //here ı check if player enters the same coordinates before
                boolean status = changeMinesStatus(x,y);
                if (!status){
                    out.println("Dont enter same coordinates again!");
                    i--;
                }else {
                    if (i == enterRight-1){
                        out.println("You win game over! Congratulations!");
                    }
                    else {
                        checkMine(x,y);
                    }
                }
            }
            else {
                out.println("You found the mine and Game Over!");
                break;
            }
        }
        out.print("Do you want to play again?  (yes) (no)" );
        String answer = scanner.next();
        if (answer.equals("yes")){
            startGame();
        }
    }
    //here ı placed my mines randomly
    static void makeMineGameArea(int row, int col,int mines) {
        minesPlace = new String[row][col];
        mineCheck = new String[row][col];
        int flag = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mineCheck[i][j] = "False";
                if (flag<mines){
                    int randomRow = (int)(Math.random()*row);
                    int randomCol = (int)(Math.random()*col);
                    if ( minesPlace[randomRow][randomCol] == null ){
                        minesPlace[randomRow][randomCol] = " x ";
                        flag++;
                    }
                }
            }
        }
    }
    //here ı make  mine map for first time
    static void makeMineMap(int row, int col) {
        constructMapWhenPlayed = new String[row][col+1];
        out.print("  ||");
        for (var i = 0 ; i< col; i++) {
            out.print(" "+i+" |");
        }
        out.println();
        for (var i = 0 ; i< col*4+4; i++) {
            out.print("=");
        }
        out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col + 1; j++) {
                if (j == 0) {
                    constructMapWhenPlayed[i][j] = i + " |";
                    out.print(i + " |");
                } else {
                    constructMapWhenPlayed[i][j] = "| * ";
                    out.print("| * ");
                }
            }
            out.println("|");
            for (int a = 0; a< col*4+4; a++) {
                out.print("-");
            }
            out.println();
        }
    }
//    here ı check for mines if there are mines which surround the entered coordinates
    static void checkMine(int x,int y) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        a = x-1 >=0 ? x-1: x;
        b = y-1 >=0? y-1: y;
        c = Math.min(x + 2, col);
        d = Math.min(y + 2, row);

        int countMine = 0;

        for (var i = a; i < c; i++) {
            for (var j = b; j < d; j++) {
                if (minesPlace[i][j] != null) {
                    countMine++;
                }
            }
        }
        out.println(countMine);
        constructMapAgain(x,y,countMine);
    }
    static boolean enterCoordinations(int x,int y){
        if(minesPlace[x][y] != null){
            return false;
        }
        return true;
    }
    //here arrays default value is False when user entered coordinates if it is not entered before it return true
    //so e can check if user entered coordinates before or not
    static boolean changeMinesStatus(int row, int col){
        if (mineCheck[row][col].equals("False")){
            mineCheck[row][col] = "True";
            return true;
        }
       return false;
    }
    //here ı construct dynamic mine map
    static void constructMapAgain(int x,int y,int countMine){
        out.print("  ||");
        for (var i = 0 ; i< col; i++) {
            out.print(" "+i+" |");
        }
        out.println();
        for (var i = 0 ; i< col*4+4; i++) {
            out.print("=");
        }
        out.println();
        for (var i = 0; i < constructMapWhenPlayed.length; i++) {
            for (var j = 0; j < constructMapWhenPlayed[i].length; j++) {
                 if (i == x && j == y+1) {
                     constructMapWhenPlayed[i][j] = "| "+countMine+" ";
                     out.print(constructMapWhenPlayed[i][j]);
                 }
                 else {
                     out.print(constructMapWhenPlayed[i][j]);
                 }
            }
            out.println("|");
        }
        for (int a = 0; a< col*4+4; a++) {
            out.print("-");
        }
        out.println();
    }
}
