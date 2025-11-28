package com.senethma;
import java.util.*;
import java.io.*;

public class StudentNdCourse {


    //creating lists to store the added information
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    private final File datafile = new File("Student Course Details.ser");
    private final File studentfile = new File("Student Details.txt");
    private final File coursesfile = new File("Course Details.txt");

    //to map the course ID to the necessary student
    private Map<Integer, List<Integer>> enrollments = new HashMap<>();


    //to save the enrollment information
    public void saveData(){

    }

    //to load the saved file
    public void loadData(){

    }


    //to add a new student
    public void newStudent(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student First Name: ");
        String firstName = input.next();
        System.out.println("Enter Student Last Name: ");
        String lastName = input.next();
        System.out.println("Enter Student Email: ");
        String email = input.next();

        Student student = new Student(firstName, lastName, email);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);

        saveData();
        System.out.println("Student Details are Saved!");
    }

    //to add a new course
    public void newCourse(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Course Name: ");
        String courseName = input.next();
        System.out.println("Enter Course's ID: ");
        int courseID = input.nextInt();
        System.out.println("Enter the total Credits of the Course: ");
        int Credit = input.nextInt();

        Course course = new Course(courseName, courseID, Credit);
        course.setCourseName(courseName);
        course.setCourseID(courseID);
        course.setCredit(Credit);

        saveData();
        System.out.println("Course Details are Saved!");
    }

    //to view all the data separately or all at once
    public void viewData(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Select your choice: ");
        System.out.println("1. View All Students");
        System.out.println("2. View All Courses");
        System.out.println("3. View All Courses of One Student");
        System.out.println("4. View All");

        int selection = choice.nextInt();
        choice.nextLine();

        switch (selection){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                System.out.println("Please don't play with me! ");
                return;

        }

        System.out.println(":)");
    }
}
