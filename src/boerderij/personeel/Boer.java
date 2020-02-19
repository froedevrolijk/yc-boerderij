package boerderij.personeel;

import boerderij.veestapel.*;
import markt.Marktprijs;

public class Boer {

    double omzet;

    public void doeWerk(int aantalDagen) {
         Geit geit = new Geit();

         double opbrengstenGeit = geit.opbrengstenMelk(aantalDagen);
         double kostenGeit = geit.kosten(aantalDagen);

         Marktprijs marktprijs = new Marktprijs();

         omzet = (opbrengstenGeit * marktprijs.berekenMarktprijs()) - kostenGeit;

         System.out.println("Omzet geit: " + omzet);

    }

}
