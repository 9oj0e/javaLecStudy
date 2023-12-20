package ex04;
// ex03
public class Television {
    private int channel; // 채널 번호
    private int volume; // 볼륨
    private boolean onOff; // 전원 상태
    Television(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }
    void print(){
        System.out.printf("채널은 %d이고, 볼륨은 %d입니다.\n", channel, volume);
    }

    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        Television yourTv = new Television(11, 20, true);
        myTv.print();
        yourTv.print();
    }
}
