package ex04;

public class MethodEx01 {
    static void m1 (){ // define a method
        System.out.println("m1");
    }
    static String m2 (){
        System.out.println("m2");
        return "m2";
    }
    public static void main(String[] args) {
        m1();
        String result = "m2";
    }
}
