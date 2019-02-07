package com.lambdaschool;

public class Fish extends AbstractAnimal {
    public String name;

    public Fish(String name, int year) {
        super(year);
        this.name = name;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", year=" + year +
                '}';
    }
}
