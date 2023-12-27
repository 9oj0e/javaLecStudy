package ex06.example7;
// composition how-to example
public class BurgerSet { // has Burger, Coke
//    다른 객체를 필드 값[상태]으로 선언하면 완료.
    private Burger burger;
    private Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요.");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
    public int getTotalPrice(){
        return burger.getPrice() + coke.getPrice();
    }
}
