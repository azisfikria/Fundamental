package UjianMingguPertama;
import java.util.Scanner;

public class Soal4Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int batas = scanner.nextInt();
        for (int i = 1; ; i++) {
            if ((i * 3) >= batas)
                break;
            System.out.println( inp + " x " + (i*3) + " = " + (inp * i * 3));
        }
    }
}
