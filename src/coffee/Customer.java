package coffee;

public class Customer { // 주문의 책임

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }
    public void order(String menuName){
        /*
        Barista b = new Barista();
        // 하면 안된다. customer는 barista를 생산할 책임이 없다.
        */

        Coffee coffee = barista.makeCoffee(menuName);
        System.out.println(coffee.name + "을 받았습니다.");
    }
}
