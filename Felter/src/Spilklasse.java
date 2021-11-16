public class Spilklasse {
    private Spiller[] spillere;
    private Spiller harTur;
    private Terning terning;
    public Spilklasse(Spiller[] spillere){
        this.spillere = spillere;
        harTur = this.spillere[0];
    }
    void tag_næste_tur(){
        int flyt = terning.slå();
    }

    void skift_til_næste_spiller(){

    }
}
