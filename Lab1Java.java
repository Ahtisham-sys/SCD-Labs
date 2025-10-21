/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.java;

/**
 *
 * @author lab2
 */
public class Lab1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 7;
        
        System.out.println("Multiplication Table of 7:");
        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
        // TODO code application logic here
    }
    
}

