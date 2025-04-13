public class HospitalEmployees {

    // Doctor class
    static class Doctor {
        int empNumber;
        String name;
        String specialty;

        public Doctor(int empNumber, String name, String specialty) {
            this.empNumber = empNumber;
            this.name = name;
            this.specialty = specialty;
        }

        public void doCheckup() {
            System.out.println("Doctor #" + empNumber + " (" + name + ") is checking patients in " + specialty);
        }
    }

    // Nurse class
    static class Nurse {
        int empNumber;
        String name;
        int patients;

        public Nurse(int empNumber, String name, int patients) {
            this.empNumber = empNumber;
            this.name = name;
            this.patients = patients;
        }

        public void careForPatients() {
            System.out.println("Nurse #" + empNumber + " (" + name + ") is caring for " + patients + " patients");
        }
    }

    // Receptionist class
    static class Receptionist {
        int empNumber;
        String name;

        public Receptionist(int empNumber, String name) {
            this.empNumber = empNumber;
            this.name = name;
        }

        public void answerCalls() {
            System.out.println("Receptionist #" + empNumber + " (" + name + ") is answering phone calls");
        }
    }

    // Cleaner class
    static class Cleaner {
        int empNumber;
        String name;
        String area;

        public Cleaner(int empNumber, String name, String area) {
            this.empNumber = empNumber;
            this.name = name;
            this.area = area;
        }

        public void cleanArea() {
            System.out.println("Cleaner #" + empNumber + " (" + name + ") is cleaning " + area);
        }
    }

    public static void main(String[] args) {
        // Create hospital employees
        Doctor drSmith = new Doctor(101, "Dr. Smith", "Cardiology");
        Nurse nurseJoy = new Nurse(201, "Nurse Joy", 8);
        Receptionist mrJones = new Receptionist(301, "Mr. Jones");
        Cleaner mrsClean = new Cleaner(401, "Mrs. Clean", "Ward 3");

        // Make them do their jobs
        System.out.println("--- Hospital Day Starts ---");
        drSmith.doCheckup();
        nurseJoy.careForPatients();
        mrJones.answerCalls();
        mrsClean.cleanArea();
        System.out.println("--- Hospital Day Ends ---");

        System.out.println("\nEmployee List:");
        System.out.println("- " + drSmith.name);
        System.out.println("- " + nurseJoy.name);
        System.out.println("- " + mrJones.name);
        System.out.println("- " + mrsClean.name);
    }
}