package ex04;

class Cat {
    String name;
    Cat(){
//        this.name = "Toby";
        this("Toby"); // 이 방식을 쓰는 경우는 거의 없다.
    }
    Cat(String name){
        this.name = name;
    }
}
public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
