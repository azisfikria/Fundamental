package juaracodingday2;

public class Casting {
    public static void main(String[] args) {
        //implicity
        int data1 = 100;
        long data2 = data1;
        System.out.println(data2);

        //explicity
        short data3 = 65;
        char char_data = (char) data3;
        //ASCII TABLE
        System.out.println(char_data);
    }
}
