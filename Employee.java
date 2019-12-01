import java.util.*;

public class Employee extends Person {

    private int salary;
    Date dateHired;

    public Employee (String name, String email, int salary) {

        super(name, email);
        this.salary = salary;
        dateHired = new Date();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public String toString() {
        String output = "Employee: " + this.name + "\n Email: " + this.email + ". Salary: " + this.salary + ".\n";
        return output;
    }
}
