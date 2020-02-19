package boerderij.veestapel;

/** De class voor geiten, die enkel melk produceren */
public class Geit extends Dier implements Melkproducenten {

    final double voerKostenPerDag = 1.50;
    final double verzorgingKostenPerDag = 2.75;
    final double productiePerDagPerLiter = 16;

    int aantalDagen;
    double totaalKosten;
    double totaalProductie;

    public Geit() {
        System.out.println("Geit is aangemaakt");
    }

    @Override
    public double opbrengstenMelk(int aantalDagen) {
        totaalProductie = aantalDagen * productiePerDagPerLiter;
        System.out.println("Dit is de productie in liters voor " + aantalDagen + " dagen: " + totaalProductie);
        return totaalProductie;
    }

    @Override
    public double kosten(int aantalDagen) {
        totaalKosten = (voerKostenPerDag * aantalDagen) + (verzorgingKostenPerDag * aantalDagen);
        System.out.println("Dit zijn de totaalkosten voor de geit: " + totaalKosten + " voor " + aantalDagen + " dagen.");
        return totaalKosten;
    }
}
