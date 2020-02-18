package boerderij.veestapel;

/** De class voor schapen, die enkel melk produceren */
public class Schapen extends AlleDieren implements Melkproducenten {

    public Schapen(double voerKostenPerDag, double verzorgingKostenPerDag) {
    }

    @Override
    public double opbrengstenMelk(int tijd) {
        final double productie_liter = 10;
        return tijd * productie_liter;
    }

    @Override
    public double kosten(double voerKostenPerDag, double verzorgingKostenPerDag, int tijd) {
        return (voerKostenPerDag * tijd) + (verzorgingKostenPerDag * tijd);
    }
}