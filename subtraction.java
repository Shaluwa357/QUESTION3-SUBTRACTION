/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.substractions;

import java.util.Scanner;

/**
 *
 * @author bosslady
 */
public class subtraction {
     public static void main(String[] args) {
        // Generate two single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Swap values if number1 < number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Calculate the correct result
        int correctResult = number1 - number2;

        // Prompt the student
        System.out.println("What is " + number1 + " - " + number2 + "?");

        // Check student's answer
        Scanner scanner = new Scanner(System.in);
        int studentAnswer = scanner.nextInt();

        // Compare with correct result
        if (studentAnswer == correctResult) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctResult + ".");
        }
    }
}
