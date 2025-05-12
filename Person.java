public class Person {
    String name;
    int age;


    public Person() {
        this.name = "Prithvi";
        this.age = 18;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        p1.displayInfo();

    }
}
