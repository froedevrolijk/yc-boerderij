package boerderij.veestapel;

/** De class voor geiten, die enkel melk produceren */
public class Geiten extends AlleDieren implements Melkproducenten {

    public Geiten(double voerKostenPerDag, double verzorgingKostenPerDag) {
    }

    @Override
    public double opbrengstenMelk(int tijd) {
        final double productie_liter = 16;
        return tijd * productie_liter;
    }

    @Override
    public double kosten(double voerKostenPerDag, double verzorgingKostenPerDag, int tijd) {
        return (voerKostenPerDag * tijd) + (verzorgingKostenPerDag * tijd);
    }
}
