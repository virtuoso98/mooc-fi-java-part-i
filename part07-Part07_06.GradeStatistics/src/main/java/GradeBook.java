/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GradeBook {
    private ArrayList<Integer> grades;
    
    public GradeBook() {
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int number) {
        if (0 <= number && number <= 100) {
            this.grades.add(number);
        }
    }
    
    public String gradeAverage() {
        int sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        
        double result = (double) sum / this.grades.size();
        return result + "";
    }
    
    public String gradeAveragePassing() {
        int count = 0;
        int sum = 0;
        for (int grade : this.grades) {
            if (grade >= 50) {
                count++;
                sum += grade;
            }
        }
        if (count == 0) {
            return "-";
        }
        double result = (double) sum / count;
        return result + "";
    }
    
    public String passingPercentage() {
        int count = 0;
        for (int grade : this.grades) {
            if (grade >= 50) {
                count++;
            }
        }
        double decimal = (double) count / this.grades.size();
        double percentage = decimal * 100.0;
        return percentage + "";
    }
    
    public void gradeDistribution() {
        int[] gradeDistribution = new int[6];
        
        for (int grade : this.grades) {
            if (90 <= grade && grade <= 100) {
                gradeDistribution[5]++;
            }
            else if (80 <= grade && grade <= 89) {
                gradeDistribution[4]++;
            }
            else if (70 <= grade && grade <= 79) {
                gradeDistribution[3]++;
            }
            else if (60 <= grade && grade <= 69) {
                gradeDistribution[2]++;
            }
            else if (50 <= grade && grade <= 59) {
                gradeDistribution[1]++;
            }
            else {
                gradeDistribution[0]++;
            }
        }
        
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            int nStars = gradeDistribution[i];
            for (int k = 0; k < nStars; k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
    
    public void printGrades() {

        System.out.print("Point average (all): " + this.gradeAverage() + "\n"
                + "Point average (passing): " + this.gradeAveragePassing() + "\n"
                + "Pass percentage: " + this.passingPercentage() + "\n");

        gradeDistribution();

    }
}
