import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGrading = true;

        System.out.println("=========================================");
        System.out.println("  Welcome to BRACU Grading System v1.0   ");
        System.out.println("=========================================");

        while (keepGrading) {
            System.out.print("\nEnter Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("Enter marks for " + studentName + " (0-100): ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); 
            
            String letterGrade = "";
            double gradePoint = 0.0;

            if (marks >= 97 && marks <= 100) {
                letterGrade = "A+";
                gradePoint = 4.0;
                System.out.println("Status: Exceptional");
            } else if (marks >= 90 && marks < 97) {
                letterGrade = "A";
                gradePoint = 4.0;
                System.out.println("Status: Excellent");
            } else if (marks >= 85 && marks < 90) {
                letterGrade = "A-";
                gradePoint = 3.7;
            } else if (marks >= 80 && marks < 85) {
                letterGrade = "B+";
                gradePoint = 3.3;
            } else if (marks >= 75 && marks < 80) {
                letterGrade = "B";
                gradePoint = 3.0;
                System.out.println("Status: Good");
            } else if (marks >= 70 && marks < 75) {
                letterGrade = "B-";
                gradePoint = 2.7;
            } else if (marks >= 65 && marks < 70) {
                letterGrade = "C+";
                gradePoint = 2.3;
            } else if (marks >= 60 && marks < 65) {
                letterGrade = "C";
                gradePoint = 2.0;
                System.out.println("Status: Fair");
            } else if (marks >= 57 && marks < 60) {
                letterGrade = "C-";
                gradePoint = 1.7;
            } else if (marks >= 55 && marks < 57) {
                letterGrade = "D+";
                gradePoint = 1.3;
            } else if (marks >= 52 && marks < 55) {
                letterGrade = "D";
                gradePoint = 1.0;
                System.out.println("Status: Poor");
            } else if (marks >= 50 && marks < 52) {
                letterGrade = "D-";
                gradePoint = 0.7;
            } else if (marks >= 0 && marks < 50) {
                letterGrade = "F";
                gradePoint = 0.0;
                System.out.println("Status: Failure");
            } else {
                System.out.println("Invalid marks entered!");
                continue; 
            }

            System.out.println("\n-----------------------------------------");
            System.out.println("            STUDENT REPORT               ");
            System.out.println("-----------------------------------------");
            System.out.println("Name        : " + studentName);
            System.out.println("Marks       : " + marks);
            System.out.println("Grade       : " + letterGrade);
            System.out.println("Grade Point : " + gradePoint);
            System.out.println("-----------------------------------------\n");
            System.out.print("Do you want to grade another student? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("no")) {
                keepGrading = false; 
                System.out.println("Thank you for using BRACU Grading System. Goodbye!");
            }
        }
    scanner.close(); 
    }
}