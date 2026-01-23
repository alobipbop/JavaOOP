/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import service.Fibonacci2;
import util.Validation;
import service.FibonacciCaculator;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {

    //the main of the class
    public static void main(String[] args) {
        //bc 1 validate
        int number = Validation.getInt("Enter fibonacci length: ", 1, 50);
        //
        FibonacciCaculator fb = new FibonacciCaculator();
        Fibonacci2 fb2 = new Fibonacci2();
        //
        fb2.printFibonacci(number);
    }
}
