package chance;

public class RykKort extends Chancekort{

    private int distance;

    public RykKort(String iden, int distance) {
        super(iden);
        this.distance = distance;
    }


    @Override
    public  void brug(Spiller s) {

        s.ryk(s);
    }
}
