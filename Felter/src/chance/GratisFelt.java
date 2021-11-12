package chance;

public class GratisFelt extends Chancekort {

    private Felt feltfarve;

    public GratisFelt(String iden) {
        super(iden);
    }

    @Override
    void brug(Spiller s) {
        while(!s.getFelt().getFeltfarve().equals(feltfarve)) {
            s.ryk(1);
        }
            if (s.getFelt().getEjer() != null){
                s.getKonto().påvirk(-Ejendomsfelt.pris(getFelt()));
        }else s.getFelt().setEjer(s);

    }
}
