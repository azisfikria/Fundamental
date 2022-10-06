package UjianMingguPertama;
import java.util.Scanner;

public class Soal1NestedIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // isi disini
        int tanggal = scanner.nextInt();
        int platNomor = scanner.nextInt();

        for (int i = tanggal; i <= tanggal; i++) {
            for (int j = platNomor; j <= platNomor; j++) {
                if (i % 2 == 0) {
                    System.out.print("Tanggal genap dan ");
                } else {
                    System.out.print("Tanggal ganjil dan ");
                }
                if (j % 2 == 0) {
                    System.out.print("plat nomor genap");
                } else {
                    System.out.print("plat nomor ganjil");
                }
            }
        }
    }
}


//        int usia = 17, beratBadan = 55;
//        if(usia >= 17){
//            if(beratBadan >= 55){
//                System.out.println("Bisa Donor Darah");
//            } else {
//                System.out.println("Belum bisa donor darah karena berat badan kurang dari 55");
//            }
//        } else {
//            System.out.println("Belum bisa donor darah karena usia kurang dari 17 tahun");
//        }

