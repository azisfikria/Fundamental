package UjianMingguPertama;
import java.util.Scanner;

public class Soal10MemanggilFungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine();
        String nim = scanner.nextLine();

        System.out.println("Nama: " + nama.toUpperCase());
        System.out.println("NIM: " + nim);
        System.out.println("Tahun Masuk: " + nim.substring(0,4));

    }
}
