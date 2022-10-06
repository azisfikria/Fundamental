package UjianMingguPertama;
import java.util.Scanner;

public class Soal3IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        if (val == 7) {
            //jika true langsung keluar hasil
            System.out.print("Weird");
        } else {
            //jika kondisi false
            System.out.print("Not Weird");
        }
    }
}