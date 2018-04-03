package com.company;

public class SneakerBuilder {

    private int size, year;
    private String model;

    public Sneaker getInstance() {
        Sneaker s = new Sneaker(size, year, model);
        return s;
    }

    public SneakerBuilder getSize() {
        return this;
    }

    public SneakerBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public SneakerBuilder getYear() {
        return this;
    }

    public SneakerBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public SneakerBuilder getModel() {
        return this;
    }

    public SneakerBuilder setModel(String model) {
        this.model = model;
        return this;
    }

}
