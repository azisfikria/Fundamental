package juaracodingdaydelapan;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int hasil = 100/0;
        } catch (ArithmeticException e) {
//            e.printStackTrace(); // ini langsung keliatan eror
//            System.err.println(e); //
            System.err.println("Ini Modifikasi Nama Eror");
            // err utk output warnanya merah
        }

        System.out.println("Statement kedua");

//      String browser = "chrome";
        String browser = null; // null tidak bisa dieksekusi di string
        try {
            System.out.println(browser.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("statement keempat"); //bisa dieksekusi karena ada exception
    }
}
