package ex06.example7;

public class Burger {
    private String name;
    private int price;

    public Burger(String name, int price) { // 생성자에서 가격을 생략하면? 서브클래스에서도 받지 못한다.
        this.name = name;
        this.price = price;
        System.out.println(name + "가 만들어졌어요.");
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
