import java.util.*;
public class Staff extends Employee {

    String title;

    public Staff (String name, String email, int salary, String title) {

        super(name, email, salary);
        this.title = title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        String output = "Staff: " + this.name + "\n Email: " + this.email + ". Title: " + this.title + ".\n";
        return output;
    }
}