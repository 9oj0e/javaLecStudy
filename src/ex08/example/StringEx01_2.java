package ex08.example;

public class StringEx01_2 {
    public static String encoding(String decodedData){
        String encodedData;
        int A = 0;
        for (int i = 0; i < decodedData.length(); i++) {
            if (decodedData.charAt(i) == 'A')
                A++;
        }
        int B = 0;
        for (int i = 0; i < decodedData.length(); i++) {
            if (decodedData.charAt(i) == 'B')
                B++;
        }
        int C = 0;
        for (int i = 0; i < decodedData.length(); i++) {
            if (decodedData.charAt(i) == 'C')
                C++;
        }
        int D = 0;
        for (int i = 0; i < decodedData.length(); i++) {
            if (decodedData.charAt(i) == 'D')
                D++;
        }
        encodedData = "A" + A + "B" + B + "C" + C + "D" + D;
        return encodedData;
    }
    public static String decoding (String encodedData){
        // 문자열에서 숫자를 분리하고, 숫자만큼 A, B, C, D 출력
        // 2. 스마트한 방법? i = n, replace(Integer.parseInt("i"),"A"), i--, i>=0;
        // 문자열에서 숫자를 분리하고, 숫자만큼 A, B, C, D 출력
        // A = 065, B = 066, C = 067, D = 068;
        /*
        String decodingData;
        decodingData = encodedData.replaceAll("[^0-9]", ""); // {2,3,4,5}
        String decodedData;
        for (int i = 0; i < decodingData.length(); i++) {
            decodedData = decodingData.repeat();
        }
         */
        /*
        for (int i = 0; i < encodedData.length(); i++) {
            if (encodedData.charAt(i) == '2'){
                encodedData.replace("2", "A");
            }
        }*/
        //int num = Integer.parseInt(encodedData);
        /*
        for (int i = 0; i < arr.length; i++) {
            char rp;
            if (arr[i] == 'A'){
                rp = 'A';
                //숫자를 문자로 변경
            }
        }*/
        return "AABBBCCCCDDDDD";
    }
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
        String encodedData = encoding(data);
        System.out.println(encodedData);

        String decodedData = decoding(encodedData);
        System.out.println(decodedData);
    }
}
