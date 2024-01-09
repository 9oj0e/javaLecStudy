package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamEx05 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(
                            "src\\ex15\\hello.txt"
                    )
            );
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src\\ex15\\output.txt")
            );
            bw.write("안녕");
            bw.write("반가워\n");
            String line = br.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}