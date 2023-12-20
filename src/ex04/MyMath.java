package ex04;

public class MyMath {
    // method overloading.
    int add(int x, int y) { return x+y; }
    int add(int x, int y, int z) {return x+y+z; }
    int add(int x, int y, int z, int w) {return x+y+z+w;}
    // 매개 변수만 다르면 메소드 이름은 같아도 된다. 이것을 매소드 중복 정의라고 한다.

    public static void main(String[] args) {
        MyMath obj;
        obj = new MyMath();
        System.out.println(obj.add(10, 20)+" ");
        System.out.println(obj.add(10, 20, 30)+" ");
        System.out.println(obj.add(10, 20)+" ");
        System.out.println(obj.add(10, 20, 30, 40)+" ");
    }
}
