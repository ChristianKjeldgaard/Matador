package chance;

public class BetalKort extends Chancekort {

    private int Beløb;

    public BetalKort(String iden) {
        super(iden);
    }

    @Override
    void brug(Spiller s) {

        s.getKonto(s);
    }


}
