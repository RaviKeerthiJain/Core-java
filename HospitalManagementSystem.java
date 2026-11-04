class HospitalStaff {
    void performDuty() {
        System.out.println("Hospital staff performs general duties.");
    }
}
class Doctor extends HospitalStaff {
    void performDuty() {
        System.out.println("Doctor examines patients, diagnoses illnesses, and prescribes treatment.");
    }
}
class Nurse extends HospitalStaff {
    
    void performDuty() {
        System.out.println("Nurse assists doctors, administers medicines, and monitors patient care.");
    }
}
class Receptionist extends HospitalStaff {
    
    void performDuty() {
        System.out.println("Receptionist registers patients, schedules appointments, and handles inquiries.");
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
          HospitalStaff staff;

        staff = new Doctor();
        staff.performDuty();

        staff = new Nurse();
        staff.performDuty();

        staff = new Receptionist();
        staff.performDuty();
    
}
}
