package juaracodingday3;

public class OperatorPenugasan {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 5;
        b = 3;
        b = b + 1;
        c = a + b;
        d = c + c + a;
        e = (c + d) * a;
        System.out.println(b);
        System.out.println(b += 1); //artinya b = b + 1
        System.out.println(b %= 2); //moudulus artinya

        System.out.println(10 << 3); //artinya 10 * 2 ^ 3
        System.out.println(40 >> 3); //artinya 40 / 2 ^ 3

    }
}
