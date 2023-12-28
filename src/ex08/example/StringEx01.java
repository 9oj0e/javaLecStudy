package ex08.example;

public class StringEx01 {

    public static String encoding(String decodedData) {
        String encodedData;
        int A = decodedData.indexOf("B") - decodedData.indexOf("A");
        int B = decodedData.indexOf("C") - decodedData.indexOf("B");
        int C = decodedData.indexOf("D") - decodedData.indexOf("C");
        int D = decodedData.length() - decodedData.indexOf("D");
        encodedData = "A" + A + "B" + B + "C" + C + "D" + D;
        return encodedData;
    }

    public static String decoding(String encodedData) { // A2B3C4D5
        String decodingData;
        decodingData = encodedData.replaceAll("[^0-9]", "");
        decodingData = decodingData.replaceAll("2", "AA");
        decodingData = decodingData.replaceAll("3", "BBB");
        decodingData = decodingData.replaceAll("4", "CCCC");
        decodingData = decodingData.replaceAll("5", "DDDDD");
        String decodedData = decodingData;
        return decodedData;
    }
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        String encodedData = encoding(data);
        System.out.println(encodedData);

        String decodedData = decoding(encodedData);
        System.out.println(decodedData);
    }
}
