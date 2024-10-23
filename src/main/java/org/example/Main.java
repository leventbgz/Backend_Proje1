package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }

        // Checking the state of isBarking
        if (isBarking) {
            return switch (clock) {
                // If it is between 0-7 and 20-23, it returns true.
                case 0, 1, 2, 3, 4, 5, 6, 7, 20, 21, 22, 23 -> true;
                // If it is between 8-19 returns false.
                default -> false;
            };
        }

        // If isBarking false, the method returns false as well.
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        // If any of the int variables are between 13-19, it returns true.
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
        // Otherwise it returns false
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        // isSummer check
        if (isSummer) {
        // If it is summer temp should be between 25-45.
            return temp >= 25 && temp <= 45; // cat is playing
        } else {
            // If it is not summer temp should be between 25-35.
            return temp >= 25 && temp <= 35; // cat is playing
        }
        // If any conditions are not implemented it returns false which means cat is not playing.
    }



    public static double area(double width, double height) {
       if (width<0 || height<0 ) {
           return -1;
       }
        return width * height;
    }

    public static double area(double radius) {
        if (radius<0 ) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
