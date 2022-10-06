package juaracodingday3;

public class ContohKeduaIF {
    public static void main(String[] args) {
        //program mendeteksi bilangan ganjil atau genap
        int platNomor = 1021;
        if(platNomor % 2 == 1){ //1021 di modulus 2= 1 dibandingkan 1, maka true ganjil
            System.out.println("Plat Nomor"+platNomor+"adalah ganjil");
        } else {
            System.out.println("Plat Nomor"+platNomor+"adalah genap");
        }

    }
}
