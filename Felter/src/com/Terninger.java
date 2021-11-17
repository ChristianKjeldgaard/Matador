package com;

import java.util.Random;
import java.util.Scanner;

public class TerningertilCDIO3 {
    private int værdi;
    public void rul() {
        Random rand = new Random();
        værdi = rand.nextInt(6) + 1;
    }
    public int getVærdi() {
        return værdi;
    }


    public TerningertilCDIO3() {

        værdi = 1;


    }
}