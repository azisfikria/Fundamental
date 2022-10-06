package juaracodingday7;

import juaracodingday7.bidang.RuangBidang;
import java.util.ArrayList;
import java.util.List;

public class UIManager {
    String text ="";

    List<RuangBidang> bidang = new ArrayList<RuangBidang>();

    public UIManager() {
        this.text ="Hello";

    }

    public void add(RuangBidang bidang) {
        this.bidang.add(bidang);
    }

    public UIManager(String text) {
        this.text = text;
    }

    public void print() {
        if(bidang != null) {
            for (RuangBidang ruangBidang : bidang) {
                ruangBidang.draw();
            }
        }else {
            System.out.println(this.text);
        }
    }

}
