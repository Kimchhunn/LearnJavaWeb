package com.company;

public class RUPP implements University {
    @Override
    public void startAsFreshman() {
        System.out.println("You are a student of RUPP.");
    }

    @Override
    public void graduate() {
        System.out.println("You are graduated from RUPP.");
    }
}
