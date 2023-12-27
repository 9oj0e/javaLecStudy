package ex08.example;

import java.sql.SQLOutput;

public class StringEx01 {

    public static String encoding(String data) {
        int A = data.indexOf("B") - data.indexOf("A");
        int B = data.indexOf("C") - data.indexOf("B");
        int C = data.indexOf("D") - data.indexOf("C");
        int D = data.length() - data.indexOf("D");
        return "A" + A + "B" + B + "C" + C + "D" + D;
        // 2, 3, 4, 5
    }

    public static String decoding(String encodedData) {
        char[] arr = encodedData.toCharArray(); // [A, 2, B, 3, C, 4, D, 5]
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return "";
    }
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        String encodedData = encoding(data);
        System.out.println(encodedData);

        String decodedData = decoding(encodedData);
        System.out.println(decodedData);
    }
}
