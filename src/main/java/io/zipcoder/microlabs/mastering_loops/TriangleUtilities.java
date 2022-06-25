package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String out = "";
        for (int i = 1; i <= numberOfRows; i ++) {
            out += getRow(i) + "\n";
        }
        return out;
    }

    public static String getRow(int numberOfStars) {
        String out = "";
        for (int i = 0; i < numberOfStars; i++) {
            out += "*";
        }
        return out;
    }

    public static String getSmallTriangle() {
        String out = "";
        for (int i = 1; i <= 4; i ++) {
            out += getRow(i) + "\n";
        }
        return out;
    }

    public static String getLargeTriangle() {
        String out = "";
        for (int i = 1; i <= 10; i ++) {
            out += getRow(i) + "\n";
        }
        return out;
    }
}
