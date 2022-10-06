package juaracodingday3;

public class ContohKetigaIF {
    public static void main(String[] args) {
        //konversi nilai ke predikat
        // A = 91 - 100, B = 85 - 90, C = 78 -84

        int nilai = 90;
        if(nilai > 90){ //90>90 = false
            System.out.println("Predikat A");
        } else if (nilai > 84){ //90>84 = true, ini yg keluar
            System.out.println("Predikat B");
        } else {
            System.out.println("Predikat C");
        }
    }
}
