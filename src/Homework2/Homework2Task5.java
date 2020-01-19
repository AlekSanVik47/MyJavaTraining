package Homework2;


public class Homework2Task5 {
    public static void main(String[] args) {

    }

    public static void isMoreOrLessArr(int max, int min) {
        int[] arr = {2, 15, 3, 10, 0, 175, 199, 247};
        max = arr[0];
        min = arr[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] > max) {
                max = arr[i];

                if (arr[i] < min) {
                    min = arr[i];
                    System.out.println("maximum number  " + max + ", minimum number  " + min);
                }
            }
        }
    }
}