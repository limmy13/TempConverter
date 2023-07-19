package org.launchcode;

public class App {
    public static void main(String[] args)  { // if you put this: throws NegativeValueException here, it's a note on the method and
        // problem will continue unless handled
        try {
            double tempC = Converter.convert(-212);
//          System.out.println(tempC); //debugging
            //throwing means somewhere else has to deal with it
            //catch means you are going to handle it
        } catch (NegativeValueException ex) {
            System.out.println("No negative temperatures.");
//            System.exit(100); // non-zero means error and 0 means success
        }
        System.out.println("Completed successfully!");
    }
}