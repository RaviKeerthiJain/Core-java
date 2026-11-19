package EmployeeManagement;
class Employee{
    int EmployeeID;
    String name;
    double salary;
    Employee(int EmployeeID,String name,double salary){
        this.EmployeeID=EmployeeID;
        this.name=name;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("EmployeeId"+EmployeeID);
        System.out.println("name"+name);
        System.out.println("salary"+salary);

    }
    void work(){
        System.out.println("Employee works");
    }
}
class Developer extends Employee{
    String Programminglanguage;
    Developer(int id,String name,double salary,String Programminglanguage){
        super(id,name,salary);
        this.Programminglanguage= Programminglanguage;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("language"+Programminglanguage);
    }
    void work(){
        System.out.println("Developer write code");
    }

}
class Tester extends Employee{
    String Testertool;
    Tester(int id,String name,double salary,String Testertool){
        super(id,name,salary);
        this.Testertool=Testertool;
    }
    void displayDetails(){
        super.displayDetails();;
        System.out.println("Testertool"+Testertool);

    }
    void work(){
        System.out.println("Tester test the Application");
    }
}
class Manager extends Employee{
    int Teamsize;
    Manager(int id,String name,double salary,int Teamsize){
        super(id,name,salary);
        this.Teamsize=Teamsize;

    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Teamsize"+Teamsize);

    }
    void work(){
        System.out.println("manager controll team");
    }

}

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer(1, "Ravi", 100000, "java");
        Tester test = new Tester(2, "Preethi", 15000, "selinium");
        Manager man = new Manager(3, "aa", 200000, 8);
        System.out.println("-----Developer---");
        dev.displayDetails();
        dev.work();
        System.out.println("\n----Tetser----");
        test.displayDetails();
        test.work();
        System.out.println("-----Manager----");
        man.displayDetails();
        man.work();
    }


}
