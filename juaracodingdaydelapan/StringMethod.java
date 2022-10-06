package juaracodingdaydelapan;

public class StringMethod {
    public static void main(String[] args) {

        String actual = "Data berhasil disimpan";
        String expect = "berhasil";

        System.out.println(actual.contains(expect)); // harus sama persis

        String browser = "firefox";
        String pilihChrome = "Chrome";
        String pilihFirefox = "Firefox";
        if (pilihChrome.equals(browser)) // ini method equal di String
         {
             System.out.println("Browser Chrome");
        } else if (pilihFirefox.equalsIgnoreCase(browser)) { //mengabaikan perbedaan kecil
            System.out.println("Browser Firefox");
        } else {
            System.out.println("Error");
        }

        System.out.println(browser.toUpperCase()); // huruf gede semua
        System.out.println(browser.substring(1,4)); // manggil indeksnya
        System.out.println(browser.substring(4,7)); // manggil indeksnya
    }
}
