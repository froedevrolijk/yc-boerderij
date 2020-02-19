package boerderij.veestapel;

/** De class voor varkens, die enkel vlees produceren */
public class Varken extends Dier implements Vleesproducenten {

    final double voerKostenPerDag = 1.55;
    final double verzorgingKostenPerDag = 2.78;
    final double productiePerDagPerKg = 5.4;
    
    int aantalDagen;
    double totaalKosten;
    double totaalProductie;

    public Varken() {
        System.out.println("Varken is aangemaakt");
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
        System.out.println("Dit zijn de totaalkosten voor het varken: " + totaalKosten + " voor " + aantalDagen + " dagen.");
        return totaalKosten;
    }
}
