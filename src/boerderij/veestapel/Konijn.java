package boerderij.veestapel;

/** De class voor konijnen, die enkel vlees produceren */
public class Konijn extends Dier implements Vleesproducenten {

    final double voerKostenPerDag = 1.50;
    final double verzorgingKostenPerDag = 2.75;
    final double productiePerDagPerKg = 3.35;

    int aantalDagen;
    double totaalKosten;
    double totaalProductie;

    public Konijn() {
        System.out.println("Konijn is aangemaakt");
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
        System.out.println("Dit zijn de totaalkosten voor het konijn: " + totaalKosten + " voor " + aantalDagen + " dagen.");
        return totaalKosten;
    }
}
