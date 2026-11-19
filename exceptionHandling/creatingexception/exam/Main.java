package exceptionHandling.creatingexception.exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        try {
            exam.enterMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
