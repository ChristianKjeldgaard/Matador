package com;

import chance.BetalKort;
import chance.Chancekort;
import chance.RykKort;
import chance.RykTilKort;

class Bank {

    private int startingMoney;
    private int lapMoney;
    private String currencySymbol;
    private int wallet;
    private Chancekort[] chancekort;

    public Bank() {
        chancekort = new Chancekort[16]{
           new RykTilKort("Ryk til START",/*felt*/),
           new RykKort("Ryk 5 felter", 5),
           new BetalKort("Du har spist for meget slik. betal M2 til banken", -2);
           new BetalKort("Du har lavet alle dine lektier. Modtag M2 fra banken.", 2);
        };
        startingMoney = 0;
        lapMoney = 0;
        currencySymbol = new String();
        wallet = 0;
    }

    public Bank(String cS, int lM, int sM) {

        startingMoney = sM;
        lapMoney = lM;
        currencySymbol = cS;

    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String cS) {
        currencySymbol = cS;
    }

    public int getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(int sM) {
        startingMoney = sM;
    }

    public int getLapMoney() {
        return lapMoney;
    }

    public void setLapMoney(int lM) {
        lapMoney = lM;
    }

    public int getWallet() {
        return wallet;
    }

    public void withdrawFromWallet(int withdrawAmount) {
        if (withdrawAmount > wallet) {
            System.out.println("Player " + /*playerNumber*/ + " went bankrupt!");
        } else {
            wallet -= withdrawAmount;
        }
        public void depositToWallet ( int depositAmount){
            wallet += depositAmount;
            System.out.println("Payday for " + /*getPlayerNumber()*/ +" You have earned " + /*rentCharge*/);
        }
    }
}