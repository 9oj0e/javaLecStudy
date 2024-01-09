package ex15;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(
                    // 이 자리, BufferedReader의 매개변수 자리를 target이라고 한다.
                    new FileReader("..\\test2.txt")
            );
            outputStream = new PrintWriter(
                    new FileWriter("src\\ex15\\output.txt")
            );
            String l;
            while ((l = inputStream.readLine()) != null)
                outputStream.println(l);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }


    }
}
