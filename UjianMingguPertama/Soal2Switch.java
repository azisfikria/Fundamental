package UjianMingguPertama;
import java.util.Scanner;
public class Soal2Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // isi disini
        String day = scanner.nextLine();

        switch (day) {
            case "Weekday":
                System.out.print("Senin Selasa Rabu Kamis Jum'at");
                break;
            case "Weekend":
                System.out.print("Sabtu Minggu");
                break;
            default:
                System.out.print("Invalid input");
                break;
        }
    }
}
