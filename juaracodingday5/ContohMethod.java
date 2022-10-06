package juaracodingday5;

import juaracodingday5.bidang.Calculator;
import juaracodingday5.bidang.Segitiga;

public class ContohMethod {
    public static void main(String[] args) {
        persegi(5);
        persegi(7);
        // instance objek atau package lain
        Segitiga segitiga = new Segitiga();
        segitiga.draw(5);

        Calculator calculator = new Calculator();
        int hasil = calculator.add (10, 5);
        System.out.println(hasil);
        System.out.println(calculator.add(100,200));

        ucapSalam();
    }

    static void persegi(int sisi){
        for(int i = 0; i<sisi; i++){
            for (int j = 0; j<sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ucapSalam(){
        System.out.println("Salam Juara");
    }
}
