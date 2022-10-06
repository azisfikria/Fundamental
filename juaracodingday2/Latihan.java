package juaracodingday2;

public class Latihan {
    public static void main(String[] args) {
        int x = 2;
        int num1 = 10 * x++;
        System.out.println(num1);

        int y = 2;
        int num2 = 10 * ++y;
        System.out.println(num2);

        System.out.println("hasil :" + num1%num2);

        //relational operator
        int a = 10;
        int b = 5;
        boolean hasil;

        hasil = a == b;
        System.out.println("Apakah a == b ?" + hasil);

        hasil = a != b;
        System.out.println("Apakah a != b ?" + hasil);

        hasil = a > b;
        System.out.println("Apakah a > b ?" + hasil);

        hasil = a < b;
        System.out.println("Apakah a < b ?" + hasil);

        hasil = a >= b;
        System.out.println("Apakah a >= b ?" + hasil);

        hasil = a <= b;
        System.out.println("Apakah a <= b ?" + hasil);

        //if dan else statement
        var nilai = 70;
        var absen = 90;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Anda LULUS");
        } else {
            System.out.println("Anda TIDAK LULUS");
        }
    }

}

