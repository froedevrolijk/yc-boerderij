package boerderij.veestapel;

/** De class voor varkens, die enkel vlees produceren */
public class Varkens extends AlleDieren implements Vleesproducenten {

    public Varkens(double voerKostenPerDag, double verzorgingKostenPerDag) {
    }

    @Override
    public double opbrengstenVlees(double startgewicht, int tijd) {
        final double productie_kg = 0.8;
        return startgewicht + (tijd * productie_kg);
    }

    @Override
    public double kosten(double voerKostenPerDag, double verzorgingKostenPerDag, int tijd) {
        return (voerKostenPerDag * tijd) + (verzorgingKostenPerDag * tijd);
    }
}
