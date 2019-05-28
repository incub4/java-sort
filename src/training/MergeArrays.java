package training;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        int[] a3 = new int[a1.length + a2.length]; //Итоговый массив

        int k = 0, l = 0;


        for (int i = 0; i <= a3.length - 1; i++) {

           // if (k <= a1.length-1 && l <=a2.length-1) {
                if (a1[k] > a2[l]) { //сравниваем элементы 2 массивов
                    a3[i] = a2[l]; //меньший пушим в третий массив
                    l += 1;
                }   else if (a1[k] <= a2[l]) {
                    a3[i] = a1[k];
                    k += 1;
                }
           // }

            if (l==a2.length){
                i+=1;
                while (k!=a1.length) {
                    a3[i] = a1[k];
                    i+=1;
                    k+=1;
                }
            }else if (k==a1.length){
                i+=1;
                while (l!=a2.length) {
                    a3[i] = a2[l];
                    i += 1;
                    l += 1;
                }
            }

        }

        System.out.println(Arrays.toString(a3));
        return a3;
    }
}
