package com.lambdaschool;

public class Bird extends AbstractAnimal {
    public String name;

    public Bird(String name, int year) {
        super(year);
        this.name = name;
    }

    @Override
    public String move() {
        useFood();
        return "fly";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
