class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int age, int employeeId, double salary, String programmingLanguage) {
        super(name, age, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println(name + " writes code in " + programmingLanguage);
    }
}

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer("Arjun", 25, 101, 60000, "Java");
        d.displayEmployee();
        System.out.println("Language    : " + d.programmingLanguage);
        d.writeCode();
    }
}
