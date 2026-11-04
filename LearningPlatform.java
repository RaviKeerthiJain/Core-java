class Course {
    void startCourse() {
        System.out.println("Course is starting.");
    }
}

class JavaCourse extends Course {
    @Override
    void startCourse() {
        System.out.println("Java Course: Learn OOP, collections, and build robust applications.");
    }
}
class PythonCourse extends Course {
    @Override
    void startCourse() {
        System.out.println("Python Course: Learn simple syntax, data handling, and automation.");
    }
}

class WebDevelopmentCourse extends Course {
    @Override
    void startCourse() {
        System.out.println("Web Development Course: Learn HTML, CSS, JavaScript, and build websites.");
    }
}


public class LearningPlatform {
    public static void main(String[] args) {
     Course course;

        course = new JavaCourse();
        course.startCourse();

        course = new PythonCourse();
        course.startCourse();

        course = new WebDevelopmentCourse();
        course.startCourse();
    }
}
    

