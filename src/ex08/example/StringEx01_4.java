package ex08.example;


public class StringEx01_4 {
    public static String encoding(String data) {
        String encodedData = "";
        char currentChar = data.charAt(0);
        int count = 1;
        for (int i = 1; i < data.length(); i++) {
            char nextChar = data.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                encodedData += currentChar + Integer.toString(count);
                currentChar = nextChar;
                count = 1;
            }
        }
        encodedData += currentChar + Integer.toString(count);
        return encodedData;
    }

    public static String decoding(String encodedData) {
        String decodedData = "";
        for (int i = 0; i < encodedData.length(); i += 2) {
            char character = encodedData.charAt(i);
            int count = Character.getNumericValue(encodedData.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                decodedData += character;
            }
        }
        return decodedData;
    }

    public static void main(String[] args) {
        String test1 = "AABBBCCCCDDDDD";
        String A = encoding(test1);

        String test2 = "A2B3C4D5";
        String B = decoding(test2);

        System.out.println(A);
        System.out.println(B);
    }
}
