import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float grade_result = 0;

        System.out.print("Enter the grade result: ");
        grade_result = scanner.nextFloat();

        if (grade_result < 0 || grade_result > 100) {
            System.out.println("Invalid grade input.");
        } else {
            if (grade_result <= 74.99) {
                System.out.println("Point Grade: 5.00");
            } else if (grade_result >= 75.00 && grade_result <= 75.99) {
                System.out.println("Point Grade: 3.00");
            } else if (grade_result >= 76.00 && grade_result <= 78.99) {
                System.out.println("Point Grade: 2.75");
            } else if (grade_result >= 79.00 && grade_result <= 81.99) {
                System.out.println("Point Grade: 2.50");
            } else if (grade_result >= 82.00 && grade_result <= 84.99) {
                System.out.println("Point Grade: 2.25");
            } else if (grade_result >= 85.00 && grade_result <= 87.99) {
                System.out.println("Point Grade: 2.00");
            } else if (grade_result >= 88.00 && grade_result <= 90.99) {
                System.out.println("Point Grade: 1.75");
            } else if (grade_result >= 91.00 && grade_result <= 93.99) {
                System.out.println("Point Grade: 1.50");
            } else if (grade_result >= 94.00 && grade_result <= 96.99) {
                System.out.println("Point Grade: 1.25");
            } else if (grade_result >= 97.00 && grade_result <= 100.00) {
                System.out.println("Point Grade: 1.00");
            }
        }
        scanner.close();
    }
}