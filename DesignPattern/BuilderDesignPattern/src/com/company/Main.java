package com.company;

public class Main {

    public static void main(String[] args) {
        Sneaker sb = new SneakerBuilder()
                .setSize(44)
                .setYear(18)
                .setModel("Addidas Pendora")
                .getInstance();

        System.out.println(sb.toString());
    }
}
