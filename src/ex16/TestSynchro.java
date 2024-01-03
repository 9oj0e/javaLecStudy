package ex16;

class Printer {
    void print(int[] arr) throws Exception {
        synchronized (this){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
                Thread.sleep(500);
            }
        }
    }
}
class MyThread1 extends Thread {
    Printer prn;
    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(Printer prn) {
        this.prn = prn;
    }
    @Override
    public void run() {
        try {
            prn.print(myarr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread {
    Printer prn;
    int[] myarr = { 1, 2, 3, 4, 5 };

    MyThread2(Printer prn) {
        this.prn = prn;
    }
    @Override
    public void run() {
        try {
            prn.print(myarr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class TestSynchro {
    public static void main(String[] args) {
        Printer obj = new Printer();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
