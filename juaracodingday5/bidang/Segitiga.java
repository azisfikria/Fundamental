package juaracodingday5.bidang;

public class Segitiga {
        public void draw(int sisi){ //prosedur (tidak mengembalikan nilai tapi diluar kelas)
            for (int i = 0; i < sisi+1; i++){
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
