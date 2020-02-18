package boerderij.veestapel;

/** De class voor konijnen, die enkel vlees produceren */
public class Konijnen extends AlleDieren implements Vleesproducenten {

    public Konijnen(double voerKostenPerDag, double verzorgingKostenPerDag) {
    }

    @Override
    public double opbrengstenVlees(double startgewicht, int tijd) {
        final double productie_kg = 0.1;
        return startgewicht + (tijd * productie_kg);
    }

    @Override
    public double kosten(double voerKostenPerDag, double verzorgingKostenPerDag, int tijd) {
        return (voerKostenPerDag * tijd) + (verzorgingKostenPerDag * tijd);
    }
}
