package UjianMingguPertama;
import java.util.Scanner;

public class Soal9Fungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lengkapi
        String nama = scanner.nextLine();
        String profesi = scanner.nextLine();
        String salary = scanner.nextLine();
//            Main app = new Main();
//            app.karyawan(nama,profesi,salary);
    }

    void karyawan(String nama, String profesi, String salary) {
//         Lengkapi
        System.out.println("Nama: " + nama.toUpperCase());
        System.out.println("Profesi: " + profesi.toUpperCase());
        System.out.println("Salary: " + salary.toUpperCase());
    }
}
