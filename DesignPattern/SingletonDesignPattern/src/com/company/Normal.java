package com.company;

public class Normal {
    private static Normal singleObj;

    private Normal () { }

    public static Normal getInstance() {
        if (singleObj == null) {
            singleObj = new Normal();
            return singleObj;
        }
        else {
            return null;
        }

    }
}
