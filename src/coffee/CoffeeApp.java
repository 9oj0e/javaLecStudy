package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Customer customer = new Customer(barista); // 의존하는 대상을 매개인자로 받는다.
        customer.order("아메리카노");
        // 아메리카노, 카푸치노, 마끼야토, 에스프레소
        barista.makeCoffee();
    }
}
