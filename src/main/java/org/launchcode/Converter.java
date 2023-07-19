package org.launchcode;

public class Converter {
    public static double convert(double tempF) throws NegativeValueException {
        if (tempF < 0) {
            throw new NegativeValueException(); // either catch the exception or declare the method that throws it

        }
        return tempF - 32 * 9 / 5;
    }
}
