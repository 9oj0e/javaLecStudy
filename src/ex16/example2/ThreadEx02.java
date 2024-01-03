package ex16.example2;

class MyFile {
    public void write(){
        try {
            Thread.sleep(5000);
            System.out.println("파일 쓰기 완료");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadEx02 {
    public static void main(String[] args) {
        new Thread(() -> {
            MyFile mf = new MyFile();
            mf.write();
        }).start();


    }
}
