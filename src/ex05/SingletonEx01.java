package ex05;
class President {

    static President instance = new President();
    // appears in the heap memory before main method begins.
    public static President getInstance(){
        return instance;
    }
    private President() {}
}
public class SingletonEx01 {
    public static void main(String[] args) {
        President p1 = President.getInstance();
        System.out.println(p1.hashCode());
        President p2 = President.getInstance();
        System.out.println(p2.hashCode());
    }
}
