package com.example.project;
import java.util.Random;

public class Student {
    // INSTANCE VARIABLES (private)
    private String firstName;
    private String lastName;
    private int gradYear;
    // sum of test scores (double).. should initialize at 0.0
    private double testScoreSum;
    // test score count (int) ..should initialize at 0
    private int testScoreCount;
    // highest test score (double).. should initialize at 0.0
    private double highestTestScore;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;       
    //random double number
    }

    public int getTestScoreCount(){
        return testScoreCount;
    }

    public int getGradYear(){
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        testScoreSum += newTestScore; 
        testScoreCount++;
        highestTestScore = newTestScore;
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if( averageTestScore() < 65){
        return false;
        } else {
            return true;
        }
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
       
        return testScoreSum * 1.0 / testScoreCount; //random double number
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 