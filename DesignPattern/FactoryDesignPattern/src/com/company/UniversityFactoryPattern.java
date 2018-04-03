package com.company;

import java.util.Scanner;

public class UniversityFactoryPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Select school to be enrolled \n1. KIT \n2. Zamann \n3. RUPP");
        int sch = s.nextInt();
        String sch_enr;
        switch (sch) {
            case 1:
                sch_enr = "KIT";
                break;
            case 2:
                sch_enr = "Zamann";
                break;
            case 3:
                sch_enr = "RUPP";
                break;
            default:
                sch_enr = "";
        }
        if (sch_enr.equals("")) {
            System.out.println("Invalid University");
        }
        else {
            University uns = UniversityFactory.getInstance(sch_enr);

            uns.startAsFreshman();
            uns.graduate();
        }
    }
}
