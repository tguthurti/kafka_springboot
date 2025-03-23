package com.company.conference.conferencedemo.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MultiplesOfFiveWithInput {

    // Function to print multiples of 5 between two numbers
    public static String printMultiplesOfFive(StringBuilder input) {
        StringBuilder output = new StringBuilder();
        try {
            // Split the input StringBuilder to extract n1 and n2

            String[] numbers = input.toString().split(" ");
            int n1 = Integer.parseInt(numbers[0]);
            int n2 = Integer.parseInt(numbers[1]);

            // Check that n1 and n2 are within the valid range (1 <= N1 <= N2 <= 499)
            if (n1 < 1 || n1 > 499 || n2 < 1 || n2 > 499 || n1 > n2) {
                System.out.println("Please ensure 1 <= n1 <= n2 <= 499");
                return "Please ensure 1 <= n1 <= n2 <= 499";
            }

            System.out.println("Multiples of 5 between " + n1 + " and " + n2 + ":");

            for (int i = n1; i <= n2; i++) {
                if (i % 5 == 0) {
                    output.append(Integer.toString(i));
                    output.append(System.lineSeparator());
                }
            }


        } catch (Exception e) {
            return "Invalid input. Please enter two valid integers.";
        }
        return output.toString();
    }

    public static void main(String[] args) {
        try {
            // Create BufferedReader to take input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter two numbers (n1 and n2) separated by space (1 <= n1 <= n2 <= 499):");

            // Read the input from the user and store it in a StringBuilder
            StringBuilder input = new StringBuilder(reader.readLine());

            // Call the function to print multiples of 5 between n1 and n2
            System.out.println(printMultiplesOfFive(input));

        } catch (IOException e) {
            e.printStackTrace();        }
    }
}
