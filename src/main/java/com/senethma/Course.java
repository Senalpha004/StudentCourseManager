package com.senethma;

public class Course {
    private String courseName;
    private int courseID;
    private int Credit;

    public Course(String courseName, int courseID, int Credit) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.Credit = Credit;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCredit() {
        return Credit;
    }
    public void setCredit(int credit) {
        Credit = credit;
    }

    @Override
    public String toString() {
        return "Course Name: " + getCourseName()
                + "\nCourse ID: " + getCourseID()
                + "\nTotal Credits: " + getCredit() ;
    }
}
