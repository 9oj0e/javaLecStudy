package coffee;
/*
손님 객체는
메뉴판 객체 안에 적힌 메뉴 항목 객체들 중에서
하나를 선택해서 바리스타 객체에게 전달(주문)하는 것입니다.
그리고 바리스타 객체는 주문을 받은 메뉴에
해당하는 커피 객체를 제조하는 것이죠.
*/
public class CoffeeApp {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Barista barista = new Barista();
        Customer customer = new Customer(barista); // 의존하는 대상을 매개인자로 받는다.
        customer.order("아메리카노");
        barista.makeCoffee("아메리카노");
    }
}
