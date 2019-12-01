public class Student extends Person {

    private String classStatus;

    public Student (String name, String email, String classStatus) {

        super(name, email);
        this.classStatus = classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }


    public String toString() {
        String output = "Student: " + this.name + "\n Email: " + this.email + ". Class Status: " + this.classStatus + ".\n";
        return output;
    }
}
