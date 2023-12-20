package ex03;

class GugudanUtil { // library
    static void gugudan(int x) {
        for (int i = 1; i <= 9; i++)
            System.out.println(x + "*" + i + "=" + (x * i));

        System.out.println();
    }
}

public class GugudanEx04 {
    public static void main(String[] args) {
        //GugudanUtil gu = new GugudanUtil();
        GugudanUtil.gugudan(5);
    }
}

