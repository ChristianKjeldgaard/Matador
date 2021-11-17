package chance;

import com.Spiller;

public class Chancekortfortolker {

    public void brugKort(Spiller s, Chancekort kort){

        if(kort.getClass() == RykKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == RykTilKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == BetalKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == GratisFelt.class){
            kort.brug(s);
        }
        if (kort.getClass() == FængselKort.class){
            kort.brug(s);
        }
    }
}
