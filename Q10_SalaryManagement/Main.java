class Employee {
    String employeeName;
    int employeeId;

    Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    double calculateSalary() {
        return 0;
    }

    void displaySalary() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName
                + " | Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class ContractEmployee extends Employee {
    double contractAmount;

    ContractEmployee(String name, int id, double contractAmount) {
        super(name, id);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Arjun", 101, 60000),
            new PartTimeEmployee("Priya", 102, 80, 300),
            new ContractEmployee("Rahul", 103, 45000)
        };

        System.out.println("--- Salary Details ---");
        for (Employee e : employees) {
            e.displaySalary();
        }
    }
}
