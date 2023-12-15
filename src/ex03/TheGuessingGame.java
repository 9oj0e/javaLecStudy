package ex03;
//MiniProject
import java.util.Scanner;

public class TheGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess, answer, range;
        System.out.print("input range: ");
        range = sc.nextInt();
        answer = (int) ((Math.random() * range) + 1);
        System.out.println(answer);
        int attempt = 0;
        do {
            System.out.print("input num: ");
            guess = sc.nextInt();
            attempt++;
            if ( guess < answer )
                System.out.println("more. up");
            if ( guess > answer )
                System.out.println("less. down");
        }while(guess != answer);
        System.out.println("Correct!" + " attempts: " + attempt);
    }
}
