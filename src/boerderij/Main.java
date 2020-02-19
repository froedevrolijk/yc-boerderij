package boerderij;

import boerderij.personeel.Boer;
import boerderij.veestapel.*;
import markt.Marktprijs;

public class Main {

    public static void main(String[] args) {
        Geit geit = new Geit();
        Kip kip = new Kip();
        Konijn konijn = new Konijn();
        Schaap schaap = new Schaap();
        Varken varken = new Varken();

        geit.kosten(4);
        kip.kosten(3);
        konijn.kosten(8);
        schaap.kosten(10);
        varken.kosten(6);

        Marktprijs marktprijs = new Marktprijs();
        System.out.println(marktprijs.berekenMarktprijs());

        geit.opbrengstenMelk(4);
        kip.opbrengstenVlees(4);
        konijn.opbrengstenVlees(7);
        schaap.opbrengstenMelk(5);
        varken.opbrengstenVlees(12);

        Boer boer = new Boer();
        boer.doeWerk(6);

    }
}
