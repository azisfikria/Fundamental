package juaracodingday5;

class Calculation {
    int hasil;
    void pengurangan(int a, int b){
        hasil = a-b;
        System.out.println(hasil);
    }
}

public class ContohInherit extends Calculation {
    void perkalian (int a, int b){
        hasil = a * b;
        System.out.println(hasil);
    }

    public static void main(String[] args) {
        ContohInherit contohInherit = new ContohInherit();
        contohInherit.pengurangan(10,5);
        contohInherit.perkalian(10,10);



    }
}
