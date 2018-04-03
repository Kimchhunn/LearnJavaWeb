package com.company;

public class SyncCodeBlock {
    private static SyncCodeBlock singleObj;

    private SyncCodeBlock () { }

    public static SyncCodeBlock getInstance() {

        System.out.println("I am using feature of getInstance() function.");


        if (singleObj == null) {
            synchronized (SyncCodeBlock.class) {
                if (singleObj == null)
                    singleObj = new SyncCodeBlock();
                else
                    return null;
            }
            return singleObj;
        }
        else
            return null;

    }
}
