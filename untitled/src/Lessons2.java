import java.util.Arrays;
public class Lessons2 {
        public static void main(String[] args) {
            int [][] numbers = new int[10][10];
            // объявляем массив размером 10*10
            for (int a =0; a<numbers.length; a++ ){
                for (int b=0; b<numbers[a].length;b++){
                    System.out.print(numbers [a][b] +" ");
                }
                System.out.println();
            }
            // проверка
            System.out.println(Arrays.asList(numbers[3][8]).indexOf(0));
            System.out.println(Arrays.asList(numbers[4][6]).indexOf(0));
            System.out.println(Class.forName());
        }
}
