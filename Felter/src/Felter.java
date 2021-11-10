public class Felter {

    private Felt[] felts;

    public void Felter() {
        felts = new Felt[24];
        felts[0] = new Start("Start");
        felts[1] = new Ejendomsfelt("Burgerbaren");
        felts[2] = new Ejendomsfelt("Pizzaria");
        felts[3] = new Chance("Chancen");
        felts[4] = new Ejendomsfelt("Slikbutikken");
        felts[5] = new Ejendomsfelt("Iskiosken");
        felts[6] = new Feltudenvaerdi("På besøg i fængsel");
        felts[7] = new Ejendomsfelt("Museet");
        felts[8] = new Ejendomsfelt("Biblioteket");
        felts[9] = new Chance("Chancen");
        felts[10] = new Ejendomsfelt("Skaterparken");
        felts[11] = new Ejendomsfelt("Swimmingpoolen");
        felts[12] = new Feltudenvaerdi("Gratis parkering");
        felts[13] = new Ejendomsfelt("Spillehallen");
        felts[14] = new Ejendomsfelt("Biografen");
        felts[15] = new Chance("Chancen");
        felts[16] = new Ejendomsfelt("Legetøjsbutikken");
        felts[17] = new Ejendomsfelt("Dyrehandlen");
        felts[18] = new Fængselsfelt("Gå i fængsel");
        felts[19] = new Ejendomsfelt("Bowlinghallen")
        felts[20] = new Ejendomsfelt("Zoo");
        felts[21] = new Chance("Chancen");
        felts[22] = new Ejendomsfelt("Vandlandet");
        felts[23] = new Ejendomsfelt("Strandpromenaden");
    }

}