/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulti;

import java.util.Scanner;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message, int MIN, int MAX) {

        while (true) {
            // Print 
            System.out.print(message);
            try {
                String input = scanner.nextLine();
                //Checks is the input is empty
                if (input.isEmpty()) {
                    System.err.println("Cannot be left blank!");
                } else {
                    //Parse the input as an integer
                    int number = Integer.parseInt(input);
                    //Checks if the number is without the specified range
                    if (number < MIN || number > MAX) {
                        System.out.format("Number '%d' is out of range [%d, %d]",
                                number, MIN, MAX);
                    } else {
                        //Return the valid number
                        return number;
                    }
                }
            } catch (Exception e) {
                //Handle the case where the input cannot be parsed as an integer
                System.err.println("Wrong format!");
            }
        }
    }

    public static boolean isValidCourse(String course) {
        return course.equalsIgnoreCase("Java") || course.equalsIgnoreCase(".Net") || course.equalsIgnoreCase("C++");
    }

    public static String getString(String message) {
        while (true) {
            // Print 
            System.out.print(message);
            try {
                String input = scanner.nextLine().trim();
                //Checks is the input is empty
                if (input.isEmpty()) {
                    System.err.println("Cannot be left blank!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                //Handle the case where the input cannot be parsed as an integer
                System.err.println("Wrong format!");
            }
        }
    }
}
