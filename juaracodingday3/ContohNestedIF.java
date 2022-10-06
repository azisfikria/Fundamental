package juaracodingday3;

public class ContohNestedIF {
    public static void main(String[] args) {
        //
        //program donor darah
        //usia min 17th BB min 55

        int usia = 17, beratBadan = 55;
        if(usia >= 17){
            if(beratBadan >= 55){
                System.out.println("Bisa Donor Darah");
            } else {
                System.out.println("Belum bisa donor darah karena berat badan kurang dari 55");
            }
        } else {
            System.out.println("Belum bisa donor darah karena usia kurang dari 17 tahun");
        }
        /*
        *laki-laki belum menikah pajaknya 10%, menikah 5%
        * perempuan belum menikah 5%, menikah 2%
        * pendapatan >7jt wajib pajak
         */
    }
}
