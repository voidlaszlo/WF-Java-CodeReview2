package com.company;

public class IntervalWorkout {
    private String[] exercises;
    private int repetitions = 0;
    private int breakLength = 0;

    public IntervalWorkout(String[] exercises, int repetitions, int breakLength) {
        this.exercises = exercises;
        this.repetitions = repetitions;
        this.breakLength = breakLength;
    }

    public String[] getExercises() {
        return exercises;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getBreakLength() {
        return breakLength;
    }

    public void training() {
        System.out.println("********************\n" +
                "Interval Workout Starts\n" +
                "********************");
        for(int i = 1; i < this.getRepetitions()+1; i++) {
            System.out.println("=============================\n" +
                    "ROUND" + i + ":\n" +
                    "Push Ups\n" +
                    "Sit Ups\n" +
                    "Planks\n" +
                    "=============================");
            if (i != this.getRepetitions()) {
                System.out.println("DO THE BREAK (" + this.getBreakLength() + " SECONDS)");
            }
        }
        System.out.println("********************\n" +
                "CONGRATS YOU ARE DONE\n" +
                "********************");
    }
}
