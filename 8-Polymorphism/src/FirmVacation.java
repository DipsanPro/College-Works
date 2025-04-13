//********************************************************************
//  FirmVacation.java - Only implements required vacation days
//********************************************************************

public class FirmVacation {
    public static void main(String[] args) {
        Staff personnel = new Staff();
        personnel.payday();
    }
}

class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getVacationDays() {
        return 10; // Base vacation days
    }
}

class Executive extends Employee {
    public Executive(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public int getVacationDays() {
        return 20; // Executives get more
    }
}

class Secretary extends Employee {
    public Secretary(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public int getVacationDays() {
        return 15; // Secretaries get slightly more
    }
}

class Volunteer extends Employee {
    public Volunteer(String name) {
        super(name, 0);
    }
    
    @Override
    public int getVacationDays() {
        return 0; // Volunteers get none
    }
}

class Hourly extends Employee {
    public Hourly(String name, double hourlyRate) {
        super(name, hourlyRate * 40 * 52);
    }
    
    @Override
    public int getVacationDays() {
        return 5; // Hourly employees get less
    }
}

class Staff {
    private Employee[] staffList;
    
    public Staff() {
        staffList = new Employee[4];
        staffList[0] = new Executive("John", 75000);
        staffList[1] = new Secretary("Mary", 45000);
        staffList[2] = new Volunteer("Alice");
        staffList[3] = new Hourly("Bob", 20);
    }
    
    public void payday() {
        for (Employee employee : staffList) {
            System.out.println(employee.getName() + 
                " - Salary: $" + employee.getSalary() + 
                ", Vacation: " + employee.getVacationDays() + " days");
        }
    }
}