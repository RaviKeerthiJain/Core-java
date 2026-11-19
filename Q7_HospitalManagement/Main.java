class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
    }
}

class Doctor extends Person {
    int doctorId;
    String specialization;

    Doctor(String name, int age, int doctorId, String specialization) {
        super(name, age);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Specialization : " + specialization);
    }
}

class Surgeon extends Doctor {
    String operationType;

    Surgeon(String name, int age, int doctorId, String specialization, String operationType) {
        super(name, age, doctorId, specialization);
        this.operationType = operationType;
    }

    void performSurgery() {
        System.out.println("Dr. " + name + " is performing " + operationType + " surgery.");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Operation Type : " + operationType);
    }
}

public class Main {
    public static void main(String[] args) {
        Surgeon s = new Surgeon("Meera", 42, 501, "Cardiology", "Heart Bypass");
        s.displayDetails();
        s.performSurgery();
    }
}
