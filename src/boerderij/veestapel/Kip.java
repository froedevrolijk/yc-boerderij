package boerderij.veestapel;

/** De class voor kippen, die enkel vlees produceren */
public class Kip extends Dier implements Vleesproducenten {

    final double voerKostenPerDag = 1.50;
    final double verzorgingKostenPerDag = 2.75;
    final double productiePerDagPerKg = 0.3;

    int aantalDagen;
    double totaalKosten;
    double totaalProductie;

    public Kip() {
        System.out.println("Kip is aangemaakt");
    }

    @Override
    public double opbrengstenVlees(int aantalDagen) {
        totaalProductie = aantalDagen * productiePerDagPerKg;
        System.out.println("Dit is de productie in Kg voor " + aantalDagen + " dagen: " + totaalProductie);
        return totaalProductie;
    }

    @Override
    public double kosten(int aantalDagen) {
        totaalKosten = (voerKostenPerDag * aantalDagen) + (verzorgingKostenPerDag * aantalDagen);
        System.out.println("Dit zijn de totaalkosten voor de kip: " + totaalKosten + " voor " + aantalDagen + " dagen.");
        return totaalKosten;
    }
}
