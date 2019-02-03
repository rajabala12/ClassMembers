public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Raja");
        person1.setLastName("Balasubramanian");
        System.out.println("First Name (person1): " +person1.getFirstName());
        System.out.println("Last Name (person1): " +person1.getLastName());

        Person person2 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
        System.out.println("First Name: (person2): " +person1.getFirstName());
        System.out.println("Last Name: (person2): " +person1.getLastName());

        System.out.println("Reprinting person 1's name");
        System.out.println("First Name (person1): " +person1.getFirstName());
        System.out.println("Last Name (person1): " +person1.getLastName());
    }
}
