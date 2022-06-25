package io.zipcoder.microlabs.mastering_loops;
import java.lang.Math.*;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String out = "";
        for(int i = start; i < stop; i++) {
            if(i % 2 == 0) {
                out += Integer.toString(i);
            }
        }
        return out;
    }


    public static String getOddNumbers(int start, int stop) {
        String out = "";
        for(int i = start; i < stop; i++) {
            if(i % 2 != 0) {
                out += Integer.toString(i);
            }
        }
        return out;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String out = "";
        for(int i = start; i < stop; i+=step) {
            out += Integer.toString(i*i);
        }
        return out;
    }

    public static String getRange(int stop) {
        String out = "";
        for(int i = 0; i < stop; i ++) {
            out += i;
        }
        return out;
    }

    public static String getRange(int start, int stop) {
        String out = "";
        for(int i = start; i < stop; i++) {
            out += i;
        }
        return out;
    }

    public static String getRange(int start, int stop, int step) {
        String out = "";
        for(int i = start; i < stop; i+=step) {
            out += i;
        }
        return out;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String out = "";
        for(int i = start; i < stop; i+=step) {
            int value = (int)Math.pow(i, exponent);
            out += Integer.toString(value);
        }
        return out;
    }
}
