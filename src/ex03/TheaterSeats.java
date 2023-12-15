package ex03;

public class TheaterSeats {
    public static void main(String[] args) {

        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 0, 0, 1, 1, 1, 0}
        };
        int sum = 0;
        int count;

        System.out.println(seats.length); // seats 행의 개수를 표시
        System.out.println(seats[0].length); // seats 첫 행의 열의 개수를 표시

        for (int row = 0; row < seats.length; row++){
            count = 0;
            for (int i = 0; i < seats[row].length; i++) {
                count += seats[row][i];
            }
            System.out.println(row + "번째 행의 관객수는 : " + count);
            sum += count;
        }
        System.out.println("전체 관객수는 : " + sum);
    }
}
