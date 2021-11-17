package chance;

import com.Felt;
import com.Spiller;

public class RykTilKort extends Chancekort{

    private Felt felt;

    public RykTilKort(String iden, Felt felt) {
        super(iden);
        this.felt = felt;
    }

    @Override
    public void brug(Spiller s) {
        while(!s.getFelt().equals(felt)){
            s.ryk(1);
        }
    }

}
