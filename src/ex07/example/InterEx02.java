package ex07.example;

// 라이브러리 판매 (예시)
interface EventListener {
    void action(); // 실행 안됨.
}
class temp implements EventListener {
    public void action(){
        System.out.println("실행");
    }
}
class MyApp {
    public void click(EventListener l){
        l.action();
    }
}

// 개발자의 영역 (라이브러리를 활용)

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();

        app.click(new temp());
        app.click(() -> {
            System.out.println("실행");
        });
        // app.click 두 코드는 같은 의미.

        // 람다 표현식, 구현체를 클래스로 만들지 않아도 된다. 람다식에서는 괄호도 생략할 수 있다. (자료형은 무조건 생략)
        // 람다식으로 표현하는 이유? 클래스를 별도로 선언해주어야하는데, 람다식은 실질적인 실행 부분만 가져온다.
        // 메소드[구현체]를 받을 수 있는데, 인자 입력 란에서 new 로 선언해 줄 수 있다.

    }
}
