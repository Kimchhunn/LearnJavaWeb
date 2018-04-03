package com.company;

public class KIT implements University {
    @Override
    public void startAsFreshman() {
        System.out.println("You are a student of KIT.");
    }

    @Override
    public void graduate() {
        System.out.println("You are graduated from KIT.");
    }
}
