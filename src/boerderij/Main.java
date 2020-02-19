package boerderij;

import boerderij.veestapel.*;
import markt.Marktprijs;

public class Main {

    public static void main(String[] args) {
        Konijn konijn1 = new Konijn(30, 20);
        Varken varken1 = new Varken(20, 10);
        Kip kip1 = new Kip(40, 25);
        Geit geit1 = new Geit(45, 65);
        Schaap schaap1 = new Schaap(80, 90);

        System.out.println(konijn1.opbrengstenVlees(1, 10));
        System.out.println(varken1.opbrengstenVlees(15, 40));
        System.out.println(kip1.opbrengstenVlees(3, 12));
        System.out.println(geit1.opbrengstenMelk(8));
        System.out.println(schaap1.opbrengstenMelk(9));

        Marktprijs m = new Marktprijs();
        System.out.println(m.berekenMarktprijs());
    }
}
