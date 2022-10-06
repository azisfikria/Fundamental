package UjianMingguPertama;
import java.util.Scanner;
public class Soal8LoopDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int i = 0;
        do {
            System.out.print((i * 2) + " ");
            i++;
        } while ((i * 2) <= x);

        System.out.println();
        //y = ;
        do {

            if ((y % 4) == 0) {
                System.out.print(y + " ");
            }

            y = y - 2;
        } while (y >= 0);
    }
}



//        int angka = scanner.nextInt();
//        // outer
//        do {
//            for (int i = 0; i < angka; i++) {
//                // inner
//                for (int j = 0; j < i + 1; j++) {
//                    System.out.print((j + 1) + " ");
//                }
//                System.out.println();
//            }
//        }


