package boerderij.veestapel;

/** De class voor schapen, die enkel melk produceren */
public class Schaap extends Dier implements Melkproducenten {

    double voerKostenPerDag = 1.55;
    double verzorgingKostenPerDag = 2.78;
    int productiePerDagPerLiter = 19;
    
    int aantalDagen;
    double totaalKosten;
    int totaalProductie;

    public Schaap() {
        System.out.println("Schaap is aangemaakt");
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
        System.out.println("Dit zijn de totaalkosten voor het schaap: " + totaalKosten + " voor " + aantalDagen + " dagen.");
        return totaalKosten;
    }
}