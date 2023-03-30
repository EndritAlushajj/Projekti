import java.util.*;

public class NumberTheory {
    public static void main(String[] args) {
        System.out.println("Shenoni nje numer te çfaredoshem ndermjet numrave -99,999 dhe 99,999 ->");
        int vleraNumerike = new Scanner(System.in).nextInt();
        int shifraPare = vleraNumerike / 10000;
        int m0 = vleraNumerike % 10000;
        int shifraDyte = m0 / 1000;
        int m1 = m0 % 1000;
        int shifraTrete = m1 / 100;
        int m2 = m1 % 100;
        int shifraKatert = m2 / 10;
        int m3 = m2 % 10;
        int shifraFundit = m3;

        int pp = shifraPare + shifraDyte + shifraTrete + shifraKatert + shifraFundit;
        System.out.println(pp);
        boolean b = (pp % 9) == 0;
        System.out.println(vleraNumerike + " eshte i plotepjestueshem nga 9? " + b);
    }
}
