class Employee {
    double calculateSalary(double basic) {
        return basic;
    }

    double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }

    double calculateSalary(double basic, double bonus, double allowance) {
        return basic + bonus + allowance;
    }
}

public class EmpSalManagement {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Basic only: " + emp.calculateSalary(30000));
        System.out.println("Basic + bonus: " + emp.calculateSalary(30000, 5000));
        System.out.println("Basic + bonus + allowance: " + emp.calculateSalary(30000, 5000, 2000));
    }
}


    

