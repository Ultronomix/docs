package com.revature.demos;

import java.util.Objects;

public class Geode {

    private String name;
    private String color;

    public Geode(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geode geode = (Geode) o;
        return Objects.equals(name, geode.name) && Objects.equals(color, geode.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Geode{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
