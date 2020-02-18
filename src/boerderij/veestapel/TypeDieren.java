package boerderij.veestapel;

interface Melkproducenten {
    double opbrengstenMelk(int tijd);
    double kosten(double voerKostenPerDag, double verzorgingKostenPerDag, int tijd);
}

interface Vleesproducenten {
    double opbrengstenVlees(double startgewicht, int tijd);
    double kosten (double voerKostenPerDag, double verzorgingKostenPerDag, int tijd);
}