package ex03;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] ragged = new int[3][];
        ragged[0] = new int[1]; // the length of the first row of ragged = 1
        ragged[1] = new int[2]; // the length of the second row of ragged = 2
        ragged[2] = new int[3]; // the length of the third row of ragged = 3

        for (int r = 0; r < ragged.length; r++) { // r = row
            for (int c = 0; c < ragged[r].length; c++) { // c = column
                ragged[r][c] = c; // ragged[row][column] will have the value of the current index
                System.out.print(ragged[r][c] + " ");
            }
            System.out.println("");
        }
    }
}
