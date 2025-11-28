package com.senethma;

public class Student implements java.io.Serializable {
    private  String firstName;
    private String lastName;
    private String email;
    private int studentID;

    private static int nextID = 1;

    //CONSTRUCTOR
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentID = generateID();
    }

    //auto ID generator
    private static int generateID() {
        return nextID++;
    }

    //used when loading data to fix the next ID after reading from the file
    public static void resetNextID(int value){
        nextID = value;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    String fullName = getFirstName().concat(" " + getLastName());

    @Override
    public String toString() {

        return "Student ID: " + String.format("%03d", studentID)
                + "Student Name: " + fullName
                + "\nEmail: " + getEmail()
                + "\nStudent ID: " + getStudentID();
    }

}
