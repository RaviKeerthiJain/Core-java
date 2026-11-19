package exceptionHandling.creatingexception.exam;

public class Exam {
    void enterMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks. Marks must be between 0 and 100");
        }
        System.out.println("Marks = " + marks);
    }
}
