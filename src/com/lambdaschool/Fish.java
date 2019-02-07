package com.lambdaschool;

public class Fish extends AbstractAnimal {
    public String name;

    public Fish(String name, int year) {
        super(year);
        this.name = name;
    }

    @Override
    public String move() {
        useFood();
        return null;
    }

    @Override
    public String breathe() {
        return null;
    }

    @Override
    public String reproduce() {
        return null;
    }
}
