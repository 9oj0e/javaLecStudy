package ex07.example;

// 라이브러리 판매 (예시)
interface EventListener {
    void action();
}

class MyApp {
    public void click(EventListener l) {
        l.action();
    }
}
// 개발자의 영역 (라이브러리를 활용)

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();

        app.click(() -> {
            System.out.println("실행");
        });
    }
}
