import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Arrays;
public class Lessons2 {
        public static void main(String[] args) {
            Object
            int[][] cube = new int [10][10];
            int i = 0;
            int j = 0;
            int a = 0;
            int b = 9;
            // Заполнение массива и поиск
            for(;i < cube.length; i++) {
                for(; j < cube[i].length; j++) {
                    cube[i][j] = a;
                    cube[i + 1][j] = b;
                    a++;
                    b--;
                    if(cube[i][j] == 3 | cube[i][j] == 8) {
                        System.out.print(cube[i][j] + " ");
                    }
                    if(cube[i + 1][j] == 6 | cube[i + 1][j] == 4) {
                        System.out.print(cube[i + 1][j] + " ");
                    }
                }
            }
            // Можно посмотреть вывод всей матрицы
        System.out.println();
         for (int[] anArr : cube) {
             for (int anAnArr : anArr) {
                 System.out.print(anAnArr + " ");
             }
             System.out.println();
         }
        }
}

