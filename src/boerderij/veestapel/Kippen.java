package boerderij.veestapel;

/** De class voor kippen, die enkel vlees produceren */
public class Kippen extends AlleDieren implements Vleesproducenten {

    public Kippen(double voerKostenPerDag, double verzorgingKostenPerDag) {
    }

    @Override
    public double opbrengstenVlees(double startgewicht, int tijd) {
        final double productie_kg = 0.3;
        return startgewicht + (tijd * productie_kg);
    }

    @Override
    public double kosten(double voerKostenPerDag, double verzorgingKostenPerDag, int tijd) {
        return (voerKostenPerDag * tijd) + (verzorgingKostenPerDag * tijd);
    }
}
