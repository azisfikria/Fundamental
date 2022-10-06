package juaracodingday3;

public class GerbangLogika {
    public static void main(String[] args) {
        boolean isA, isB, isC, isD, isE, isF, isG, isHasilLab, isHasilCDE;
        isA = 5 == 5; //true
        isB = 5 != 5; //false
        isC = 5 > 6; //false
        isD = 5 < 6; //true
        isE = 5 >= 3; //true
        isF = 5 <= 5; //true
        isHasilLab = isA && isB; //is A = true, isB = False,maka hasil false
        isHasilCDE = isC || isD && isE; //isC = false, (isD(true) OR isE(true) = true), maka isC(true) OR isDE(true) = true

        System.out.println(isA);
        System.out.println(isB);
        System.out.println(isC);
        System.out.println(isD);
        System.out.println(isE);
        System.out.println(isF);
        System.out.println("-------");
        System.out.println(isHasilLab);
        System.out.println(isHasilCDE);
        System.out.println(!isHasilCDE);

    }
}
