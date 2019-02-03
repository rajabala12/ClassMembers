public class Person {
    private String firstName;
    private static String lastName;

    public String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }
}
