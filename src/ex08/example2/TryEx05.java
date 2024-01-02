package ex08.example2;

class Cal3 {
    void divide(int num) throws Exception {
        System.out.println(10/num);
    }
}

class Cal4 {
    void divide(int num) {
        try {
            System.out.println(10/num);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class TryEx05 {
    public static void main(String[] args) {
        Cal3 c3 = new Cal3();
        //c3.divide(0);
        try {
            c3.divide(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Cal4 c4 = new Cal4();
        try {
            c4.divide(0);
        } catch (Exception e) {
            System.out.println("내가 처리할께");
        }
    }
}
