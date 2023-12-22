package ex06;
// ex05
abstract class Employee {
    public int baseSalary = 3000000; // 기본금
    int getSalary() { return baseSalary; }
}
class Manager extends Employee {
    @Override int getSalary() { return (baseSalary + 2000000); }
}
class Programmer extends Employee {
    @Override int getSalary() { return (baseSalary + 3000000); }
}

public class Test {
    public static void main(String[] args) {
        Employee obj1 = new Manager();
        System.out.println("관리자 월급: "+obj1.getSalary());
        Employee obj2 = new Programmer();
        System.out.println("프로그래머 월급: "+obj2.getSalary());
    }
}
