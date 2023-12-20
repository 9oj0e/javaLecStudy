package ex04;

public class Television {
    int channel; // 채널 번호
    int volumn; // 볼륨
    boolean onOff; // 전원 상태

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volumn = 10;
        myTv.onOff = true;

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volumn = 12;
        yourTv.onOff = true;
        System.out.printf("나의 텔레비전 채널은 %d이고, 볼륨은 %d입니다.\n", myTv.channel, myTv.volumn);
        System.out.printf("너의 텔레비전 채널은 %d이고, 볼륨은 %d입니다.\n", yourTv.channel, yourTv.volumn);
    }
}
