package com.company;

public class Zamann implements University {


    @Override
    public void startAsFreshman() {
        System.out.println("You are a student of Zamann.");
    }

    @Override
    public void graduate() {
        System.out.println("You are gradudated from Zamann.");
    }
}
