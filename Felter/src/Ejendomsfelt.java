public class Ejendomsfelt extends Felt{
    private  int pris;
    private Spiller ejer;
    Ejendomsfelt(String navn, int pris) {
        super(navn);
        ejer = null;
        this.pris=pris;
    }

    @Override
    void ramt(Spiller spiller) {
        if (ejer == null) {
            ejer.getkonto().påvirkBalance();
        }

        }

    }

