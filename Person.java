// Base class Person
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class Employee extends Person {
    int employeeID;
    double salary;


    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}


 class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Prithvi", 25, 1, 25000);
        emp.displayDetails();
    }
}
