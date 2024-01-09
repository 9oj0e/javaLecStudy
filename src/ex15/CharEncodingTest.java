package ex15;
// ex08
import java.io.*;

public class CharEncodingTest {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("src\\ex15\\test.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir), "UTF8"
                )
        );
        String str;

        while((str = in.readLine()) != null)
            System.out.println(str);
        in.close();
    }
}
