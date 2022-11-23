package Patika3_4Weeks;
/*Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
 Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin
 transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği),
  A^T (A üzeri T) ile gösterilir.
Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4
*/

import java.util.Arrays;

public class Matris {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3},{2,3,4},{4,5,6},{7,8,9}};
        int[][] matris01 = new int[matris[0].length][matris.length];


        for (var i = 0; i < matris.length; i++) {
            System.out.println(Arrays.toString(matris[i]));
        }
        System.out.println("==========================================================");

        for (var i = 0; i < matris.length; i++) {
            for (var j = 0; j < matris01.length; j++){
                matris01[j][i] = matris[i][j];
            }
        }
        for (var i = 0; i < matris01.length; i++) {
            System.out.println(Arrays.toString(matris01[i]));
        }
    }
}
