package chance;

public class Chancekortfortolker {

    public void brugKort(Spiller s, Chancekort kort){
        if(kort.getClass() == RykKort.class){
            ((RykKort) kort).brug(s);
        }
        if(kort.getClass() == RykTilKort.class){
            kort.brug(s);
        }
    }
}
