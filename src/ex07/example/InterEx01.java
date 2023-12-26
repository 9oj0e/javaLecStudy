package ex07.example;

import java.rmi.Remote;

interface RemoteC {
    public abstract void on();

    public abstract void off();
}

class SamsungRemoteC implements RemoteC {

    @Override
    public void on() {
        System.out.println("Samsung Remote on");
    }

    @Override
    public void off() {
        System.out.println("Samsung Remote off");
    }
}

class LgRemoteC implements RemoteC {

    @Override
    public void on() {
        System.out.println("LG Remote on");
    }

    @Override
    public void off() {
        System.out.println("LG Remote on");
    }
}
/*
* 작성자 : 홍길동
* 날짜 : 2023.12.26
* 구현체 : SamsungRemoteC, LgRemoteC
*
* */
class CommonRemoteC { // 전략 패턴
    private RemoteC r; // interface or abstract class
    public CommonRemoteC(RemoteC r) {
        this.r = r;
    }
    public void on(){
        r.on();
    }
    public void off(){
        r.off();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
        /*
        SamsungRemoteC s = new SamsungRemoteC();
        CommonRemoteC cr = new CommonRemoteC(s);
        */
        CommonRemoteC cr = new CommonRemoteC(new SamsungRemoteC()); // 임의의 s를 만들 필요 없이 new로 단번에 선언
        cr.off();
    }
}