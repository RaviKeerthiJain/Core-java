class Student {
    void displayDetails(String name) {
        System.out.println("Name: " + name);
    }

    void displayDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void displayDetails(String name, int age, String city) {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}


public class StudentInfo {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails("RaviKeerthi");
        s.displayDetails("RaviKeerthi", 21);
        s.displayDetails("RaviKeerthi", 21, "Bengaluru");
    }
    
}
