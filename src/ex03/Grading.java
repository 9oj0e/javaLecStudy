package ex03;
//ex02
import java.util.Scanner;


public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요: ");
        grade = sc.nextInt();
        if (grade >= 90)
            System.out.println("학점 A");
        else if (grade >= 80)
            System.out.println("학점 B");
        else if (grade >= 70)
            System.out.println("학점 C");
        else if (grade >= 60)
            System.out.println("학점 E");
        else
            System.out.println("학점 F");
    }
}
