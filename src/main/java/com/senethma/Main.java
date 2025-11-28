package com.senethma;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Student Enrollment Management!");

        Scanner input = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("*** Menu Options Available *** ");
            System.out.println("1. Add a new Student");
            System.out.println("2. Add a new Course");
            System.out.println("3. View Student/Course Details");
            System.out.println("4. Enroll a Student to a Course");
            System.out.println("5. Exit");

            System.out.print("Your choice? (Enter Only the Number) ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Thank you for using this System!");
                    System.out.println("Exiting the Program...");
                    running = false;
                    break;

                default:
                    System.out.println("Please enter only one of the given number options!");
                    return;

            }
        }

    }
}