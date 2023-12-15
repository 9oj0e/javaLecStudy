package ex03.test;
// 값을 서로 바꾸게 만들기 [Swap 코드]
public class BubbleTest03 {
    public static void main(String[] args) {
        int [] arr = {4, 3};

//        arr[0] = arr[1]; // =3
//        arr[1] = arr[0]; // =3. (4가 사라짐)
        int temp;
        temp = arr[0]; // 4
        arr[0] = arr[1]; // 3
        arr[1] = temp; // 4


        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }
}
