package com.company;

// EXERCISE CLASS (BASE POINTS(1))
public class Exercise {
    private String name = "";
    private String description = "";
    private double duration = 0;
    private String position = "";

    public Exercise(String name, String description, double duration, String position) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    public String getPosition() {
        return position;
    }

    // BASE POINTS(3)
    @Override
    public String toString() {
        return "\n" + this.getName() + "               " + "DURATION: " + this.getDuration()+".\n----------------------------------------\nDESCRIPTION: " + this.getDescription();
    }
}
