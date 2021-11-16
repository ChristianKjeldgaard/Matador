package chance;

public class Chancekortfortolker {

    public void brugKort(Spiller s, Chancekort kort){
        if(kort.getClass() == RykKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == RykTilKort.class){
            kort.setryk(x)
            kort.brug(s);
        }
    }
}
