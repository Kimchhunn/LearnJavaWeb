package com.company;

public class UniversityFactory {

    public static University getInstance(String university) {
        if (university.equalsIgnoreCase("kit"))
            return new KIT();
        else if (university.equalsIgnoreCase("zamann"))
            return new Zamann();
        else if (university.equalsIgnoreCase("rupp"))
            return new RUPP();
        else if (university.equals(null))
            return null;
        else
            return null;
    }
}
