package boerderij.veestapel;

interface Melkproducenten {
    double opbrengstenMelk(int aantalDagen);
    double kosten(int aantalDagen);
}

interface Vleesproducenten {
    double opbrengstenVlees(int aantalDagen);
    double kosten(int aantalDagen);
}