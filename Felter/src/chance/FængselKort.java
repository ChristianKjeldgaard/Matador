package chance;

public class FængselKort extends Chancekort {

    private Felt felt;

    public FængselKort(String iden) {
        super(iden);
    }

    @Override
    void brug(Spiller s) {
        !if(s.getFelt().equels(fængsel)){
            s.felt()
        }
    }
}
