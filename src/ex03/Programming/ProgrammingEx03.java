package ex03.Programming;

// Game: clap when you hear 3, 6, 9
public class ProgrammingEx03 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int x : arr) {
            if (x % 10 == 3 || x % 10 == 6 || x % 10 == 9) {
                System.out.print("clap ");
            } else {
                System.out.print(x + " ");
            }
        }
    }
}
