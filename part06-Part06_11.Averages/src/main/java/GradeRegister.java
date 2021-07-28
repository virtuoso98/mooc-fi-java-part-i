
import java.util.ArrayList;

public class GradeRegister {

    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> pointArr;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointArr = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointArr.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;  
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfPoints() {
        if (this.pointArr.isEmpty()) {
            return -1;
        }
        int nPoints = this.pointArr.size();
        int acc = 0;
        for (int point : this.pointArr) {
            acc += point;
        }
        return (double) acc / nPoints;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int nGrades = this.grades.size();
        int acc = 0;
        for (int grade : this.grades) {
            acc += grade;
        }
        return (double) acc / nGrades;
    }
}
