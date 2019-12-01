import java.util.*;
public class Faculty extends Employee {

    private String researchInt;

    public Faculty (String name, String email, int salary, String researchInt) {
        super(name, email, salary);
        this.researchInt = researchInt;
    }

    public void setResearchInt(String researchInt) {
        this.researchInt = researchInt;
    }

    public String getResearchInt() {
        return researchInt;
    }

    public Date date() {
        return dateHired;
    }

    public String toString() {
        String output = "Faculty: " + this.name + "\n Email: " + this.email + ". Research Interest: " + this.researchInt
                + ".\n";
        return output;
    }

}
