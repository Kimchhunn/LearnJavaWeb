package com.company;

public class SyncKeyword {
    private static SyncKeyword singleObj;

    private SyncKeyword () { }

    public static synchronized SyncKeyword getInstance() {
        if (singleObj == null) {
            singleObj = new SyncKeyword();
            return singleObj;
        }
        else {
            return null;
        }

    }
}
