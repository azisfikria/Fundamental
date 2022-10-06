package juaracodingday7;

import juaracodingday7.bidang.Kotak;
import juaracodingday7.bidang.RuangBidang;
import juaracodingday7.bidang.Segitiga;

public class MainApp {

    public static void main(String[] args) {

        UIManager uiManager = new UIManager();

        uiManager.add(new Kotak(5));
        uiManager.add(new Kotak(8));
        uiManager.add(new Segitiga(5));
        uiManager.add(new Segitiga(8));
        uiManager.print();

        RuangBidang ruangBidang = new RuangBidang();
        ruangBidang.draw();

    }
}
