public class Person {
    String name;
    String email;

    public Person (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        String testing = "Person: " + this.name + "\n Email: " + this.email + ".\n";
        return testing;
    }
}
