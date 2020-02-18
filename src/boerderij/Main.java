package boerderij;

import boerderij.veestapel.*;
import markt.Marktprijzen;

public class Main {

    public static void main(String[] args) {
        Konijnen konijn1 = new Konijnen(30, 20);
        Varkens varken1 = new Varkens(20, 10);
        Kippen kip1 = new Kippen(40, 25);
        Geiten geit1 = new Geiten(45, 65);
        Schapen schaap1 = new Schapen(80, 90);

        System.out.println(konijn1.opbrengstenVlees(1, 10));
        System.out.println(varken1.opbrengstenVlees(15, 40));
        System.out.println(kip1.opbrengstenVlees(3, 12));
        System.out.println(geit1.opbrengstenMelk(8));
        System.out.println(schaap1.opbrengstenMelk(9));

        Marktprijzen m = new Marktprijzen();
        System.out.println(m.marktPrijs());
    }
}
