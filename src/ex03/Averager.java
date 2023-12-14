package ex03;
//ex13
import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("input score: ");
            int grade = sc.nextInt();
            if (grade < 0) break;
            total += grade;
            count++;
        }
        System.out.println("average: " + total / count);
    }
}
