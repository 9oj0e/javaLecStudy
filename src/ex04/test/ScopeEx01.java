package ex04.test;

public class ScopeEx01 {

    int n1 = 1; // instance variable

    static int n2 = 2; // class variable
    static void m1(){
        int n1 = 10; // only exists when m1() is running. -> m1.n1
        System.out.println("m1 : " + n1); //
    }// n1 in m1 extinguishes. n1's lifetime is the shortest.

    void m2(){
        System.out.println("m2 : " + n1); // Refers to the instance variable n1 in the class ScopeEx01
    }
    // before main gets started, static variables are loaded : variable n2, method m1.
    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01(); // define sc in main stack, pop up ScopeEx01 heap memory.
        // variable sc will hold the address of ScopeEx01.
        // Such variable is called a 'reference variable'.
        // sc = *ScopeEx01 -> pointer
        System.out.println(sc.n1);

        //int n2 = 1; // creates n2(in main) varied from n2(in class)
        System.out.println(n2);
        //System.out.println(ScopeEx01.n2); // n2(in class)
    }
}
