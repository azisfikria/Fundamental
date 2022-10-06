package juaracodingday3;

public class LatihanDay3 {
    public static void main(String[] args) {
        boolean gender = true; //lakilaki (1) perempuan (0)
        boolean status = true; //menikah (1) perempuan (0)
        int pendapatan = 7100000;

        if (pendapatan > 7000000) {
            if (status && true) {
                if (gender && true) {
                    System.out.println("lakilaki sudah menikah wajib pajak 5%");
                } else {
                    System.out.println("lakilaki belum menikah wajib pajak 10%");
                }
            } else if (gender || status) {
                System.out.println("perempuan sudah menikah wajib pajak 2%");
                } else {
                System.out.println("perempuan belum menikah wajib pajak 5%");

//            } else {
                System.out.println("tidak wajib pajak");
            }
        }
    }
}
