package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    // 4 x 4 table
    public static String getSmallMultiplicationTable() {
        String out = "";
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                out += String.format("%3d |", i*j);
            }
            out += "\n";
        }
        return out;
    }

    // 10 x 10 table
    public static String getLargeMultiplicationTable() {
        String out = "";
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                out += String.format("%3d |", i*j);
            }
            out += "\n";
        }
        return out;
    }

    // tableSize table!
    public static String getMultiplicationTable(int tableSize) {
        String out = "";
        for (int i = 1; i < tableSize + 1; i++) {
            for (int j = 1; j < tableSize + 1; j++) {
                out += String.format("%3d |", i*j);
            }
            out += "\n";
        }
        return out;
    }
}
