package ex06;
// ex04
class ePerson {
    String name;
    public ePerson() {
    }
    public ePerson(String theName) {
        this.name = theName;
    }
}
class Employee extends ePerson {
    String id;
    public Employee() {
        super();
    }
    public Employee(String name) {
        super(name);
    }
    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kim", "20210001");
        System.out.println(e1);
    }
}
