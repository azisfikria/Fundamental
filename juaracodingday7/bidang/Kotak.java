package juaracodingday7.bidang;

public class Kotak extends RuangBidang {

    int sisi;
    public Kotak(){

    }

    public Kotak (int sisi) {
        this.sisi = sisi;
    }

    public void draw (){
        for(int x = 0 ; x < sisi; x ++) {
            for (int y = 0 ; y < sisi ;y ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
