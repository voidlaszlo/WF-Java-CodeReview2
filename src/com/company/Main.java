package com.company;
public class Main {

    // EXERCISES (BASE POINTS(2), (4))
    private static Exercise[] exercises = {
            new Exercise("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, "Floor"),
            new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "Floor"),
            new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, "Standing"),
            new Exercise("Backward-Kicks", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "Floor"),
            new Exercise("Leg Curls", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg. ", 90, "Standing"),
            new Exercise("Sidewards Back Streches", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand. ", 60, "Standing")
    };

    public static void main(String[] args) {
        // shows exercises from an array
        showExercises();

        // shows floor exercises
        showFloorExercises();

        // shows floor exercises over one minute
        showFloorExercisesOverOneMinute();

        // creates and shows one interval workout
        IntervalWorkout iw = new IntervalWorkout(new String[]{"Push Ups", "Sit Ups", "Planks"}, 3, 30);
        iw.training();
    }

    // BASE POINTS(5.1)
    public static void showExercises() {
        for(Exercise exercise : exercises) {
            System.out.println(exercise);
        }
    }

    // BASE POINTS(5.2)
    public static void showFloorExercises() {
        System.out.println("\n----- ALL FLOOR EXERCISES -----\n");
        for(Exercise exercise : exercises) {
            if(exercise.getPosition() == "Floor") {
                System.out.println(exercise);
            }
        }
        System.out.println("\n----- END ------");
    }

    public static void showFloorExercisesOverOneMinute() {
        System.out.println("\n----- FLOOR EXERCISES OVER ONE MINUTE -----\n");
        for(Exercise exercise : exercises) {
            if(exercise.getPosition() == "Floor" && exercise.getDuration() >= 60) {
                System.out.println(exercise);
            }
        }
        System.out.println("\n----- END ------");
    }
}
