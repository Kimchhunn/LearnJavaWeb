package com.company;

public class Sneaker {

    private int size, year;
    private String model;

    public Sneaker(int size, int year, String model) {
        this.size = size;
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "size=" + size +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
